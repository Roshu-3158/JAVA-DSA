// Majority Element 
// given an integer array of size n, find all elements that appear more than [n/3] times. Where n is size of an array
// arr[] = {1,3,2,5,1,3,1,5,1};  Ans = 1 
import java.util.HashMap;
// import java.util.Set;


public class majority_element {
    
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,3,3,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
        //    if(map.containsKey(arr[i])){
        //     map.put(arr[i],map.get(arr[i]) + 1);
        //    }else{
        //     map.put(arr[i],1);
        //    }

            // if and else can be replace by this single line 
           map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }


        // Set<Integer> keyset = map.keySet();
        // for(Integer key : keyset){
        //     if(map.get(key) > arr.length/3){
        //         System.out.println(key);
        //     }   
        // }

        
        for(Integer key : map.keySet()){
            if(map.get(key) > arr.length/3){
                System.out.println(key);
            }   
        }

        
    }
    
}
