public class create_array {
    public static void print_array(int marks[]){
        for(int i=0; i<=marks.length-1; i++){
            System.out.println(marks[i]);
        }
    }

    public static void main(String[] args) {
        int marks[] = new int[] {1,2,3,4,5};
        // by defualt length function calculate size from 1
        System.out.println("Size of the array is : " +marks.length);
        print_array(marks);
        
    }
}