public class selection_sort {

    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};

        selectionsort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
    
}
