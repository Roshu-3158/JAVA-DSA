public class reverse_array {

    // ------Using For loop------
    // public static void reverse(int arr[]){
    // int j = arr.length-1;
    // for(int i=0; i< arr.length/2 ; i++){
    // int temp =arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // j--;
    // }
    // for(int i=0; i<arr.length; i++){
    // System.out.println(arr[i]);
    // }
    // }

    // ---------using while loop------------
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        reverse(arr);

    }

}
