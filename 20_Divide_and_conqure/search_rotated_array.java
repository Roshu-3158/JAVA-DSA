// sorted, rotated array with distinct numbers(in asc order) s is rotated at a pivot point, find the index of given element.

public class search_rotated_array {

    public static int search(int arr[], int tar, int si, int ei) {
        // base case : does not exist
        if (si > ei) {
            return -1;
        }

        // mid index
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }
 
        // mid on line 1
        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid);
            }
            // case a : right
            else {
                return search(arr, tar, mid + 1, ei);
            }
        }
        // mid on line 2
        else {
            // case c : left
            if (arr[mid] >= tar && tar >= arr[ei]) {
                return search(arr, tar, si, mid - 1);
            }
            // case d : right
            else {
                return search(arr, tar, mid + 1, ei);
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6; // output index -> 4
        int tarIDX = search(arr, target, 0, arr.length);

        System.out.println("Ans is : " + tarIDX);

    }

}
