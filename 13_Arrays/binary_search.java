public class binary_search {

    public static int search(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while (start <= end) {
            int mid= (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){ //right
                start = mid+1;
            }else{  //left
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {332,43,32,43,3,21,43};
        int key =43;
        System.out.println("Index for key is : "+search(numbers, key));
    }
    
}
