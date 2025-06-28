import java.util.Scanner;

public class merge_sort {

    // print array
    public static void printarr(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);

        merge(arr, mid, si, ei);
    }

    public static void merge(int arr[], int mid, int si, int ei) {
        int[] temp = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (int r = 0; r < temp.length; r++) {
            arr[si + r] = temp[r];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before sorting is  : ");
        printarr(arr, size);
        mergesort(arr, 0, size - 1);
        System.out.println();
        System.out.print("Array After sorting is  : ");
        printarr(arr, size);

        sc.close();
    }

}
