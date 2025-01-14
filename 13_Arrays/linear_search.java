public class linear_search {

    public static void linear(int numbers[], int key){
        boolean found = false;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                System.out.println("The number "+key+" found " + "at position "+ i);
                found = true;
               
            }
        }
        if(!found){
            System.out.println("Number not found");
        }

    }


    public static void main(String[] args) {
        int numbers[] = {21,43,12,54,76};
        int key = 12;
        // int key = 30;
        linear(numbers, key);
        
    }
    
}
