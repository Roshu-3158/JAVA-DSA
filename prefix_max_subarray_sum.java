public class prefix_max_subarray_sum {
    //brute force approach
    public static void max(int arr[]){
       int currsum = 0;
       int maxsum = Integer.MIN_VALUE;
       int prefix[] = new int[arr.length];

    //    calculate prefix array 
    for(int i=1; i<prefix.length; i++){
        prefix[i] = prefix[i-1] + arr[i];
    }
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1] ;
                
                
                if(maxsum<currsum){
                    maxsum = currsum;
                }
                
            }
        }
        System.out.println("MAX Sum :" +maxsum);
    }

    public static void main(String[] args) {
        // int arr[] = {2,4,6,8,10};
        int arr[] = {1,-2,6,-1,3};
        max(arr);
    }
    
}
