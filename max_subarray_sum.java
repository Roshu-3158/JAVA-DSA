public class max_subarray_sum {
    //brute force approach
    public static void max(int arr[]){
       int currsum = 0;
       int maxsum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                currsum = 0;
                for(int k=i; k<=j; k++){
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
                
            }
        }
        System.out.println("MAX Sum :" +maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        max(arr);
    }
    
}
