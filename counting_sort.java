public class counting_sort {
    public static void countingsort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0; i<count.length; i++){
            for(int j=0; j<count[i]; j++){
                arr[k] = i;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 8, 7, 1};

        countingsort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
}
