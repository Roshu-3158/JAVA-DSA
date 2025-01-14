public class insertion_sort {

    public static void insertionsort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding ou the correct pos to insert 
            while (prev >=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;              
            }
            // insertion 
            arr[prev+1] = curr;
        }
           
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};

        insertionsort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
    
}
