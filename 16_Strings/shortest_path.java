public class shortest_path {
    
    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        int x =0;
        int y =0;

        for(int i=0; i<direction.length(); i++){
            // north
            if(direction.charAt(i) == 'N'){
                y++;
            }
            // south 
            else if(direction.charAt(i) == 'S'){
                y--;
            }
            // west
            else if(direction.charAt(i) == 'W'){
                x--;
            }
            // east 
            else if(direction.charAt(i) == 'E'){
                x++;
            }

        }

        int x2 = x*x;
        int y2 = y*y;

        double ans = Math.sqrt(x2 + y2);

        System.out.println(ans);

    }
}
