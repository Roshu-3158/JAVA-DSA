
// next greater element 
// The next greater element of some element X in an array is the first greater element that  is to the right of x in the same array 
// arr = [6,8,0,1,3]
// next greater = [8,-1,1,3,-1]


// similar quesion
// 1) next greater in RHS
// 2) next greater in LHS
// 1) next smakker in RHS
// 2) next smakker in LHS


import java.util.*;

public class next_greater_element {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            // while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // if else
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            // push in s
            s.push(i);

        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + "   ");
        }

    }
}
