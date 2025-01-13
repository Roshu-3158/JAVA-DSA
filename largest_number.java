public class largest_number {

    public static int largest(int arr[]){
        int l_num = Integer.MIN_VALUE; // store -infinity of checking -ve numbers
        // -infinity = Integr.MIN_VALUE
        // +infinity = Integr.MAX_VALUE
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= l_num){
                l_num = arr[i];
            }
        }
        return l_num;
    }

    public static int smallest(int arr[]){
        int m_num = Integer.MAX_VALUE; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= m_num){
                m_num = arr[i];
            }
        }
        return m_num;
    }

    public static void main(String[] args) {
        int arr[] = {432,43,24,5,3,23,5434,32};

        System.out.println("The largest number is : "+largest(arr));

        System.out.println("The Smallest number is : "+smallest(arr));
         
        
    }
    
}
