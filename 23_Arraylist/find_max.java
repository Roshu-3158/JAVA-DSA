import java.util.ArrayList;;
public class find_max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(11);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }

            max = Math.max(max, i);
        }
        System.out.println("max element  = "+max);
    }
    
}
