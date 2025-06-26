public class recursion_function {

    public static void printdec(int number){
        if(number==1){
            System.out.println(number + " ");
            return;
        }
        System.out.print(number + " ");
        printdec(number-1);

    }

    public static void main(String args[]){
        int number = 10;

        printdec(number);
    }
}