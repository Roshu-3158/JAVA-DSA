public class trappping_rainwater {

    public static int trapped_water(int height[]){
        int n = height.length;
        int trappedwater =0;

        // calculate left max boundary 
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        
        // calculate right max boundary 
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0 ; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        // loop 
        for(int i=0; i<n; i++){
            // waterlevel = min(leftmax bound, rightmost bound)
            int waterlevel = Math.min(leftMax[i],rightMax[i]);

            // trapped water = waterlevel - height[i]
            trappedwater += waterlevel-height[i];
        }
        return trappedwater;
        
    }
    
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("The Trapped Water is "+trapped_water(height));   
    }
}
