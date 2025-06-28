import java.util.Scanner;

public class quick_sort {

    // print array
    public static void printarr(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx - 1); // left
        quicksort(arr, pidx + 1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // this code is again writr for only pivot element 
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

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

        System.out.println("Array before sort : ");
        printarr(arr, size);
        quicksort(arr, 0, size - 1);
        System.out.println("Array After sort : ");
        printarr(arr, size);

        sc.close();
    }

}
