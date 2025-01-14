// (+ve)  +  (+ve) =  +ve
// (+ve)  +  (-ve) =  +ve  (where +ve is large number)
// (+ve)  +  (-ve) =  +ve  (where -ve is large number)


public class kadanes_algorithm {

    public static void max_sum(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs +numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("max subarray sum :" +ms);

    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        max_sum(numbers);
    }
    
}
