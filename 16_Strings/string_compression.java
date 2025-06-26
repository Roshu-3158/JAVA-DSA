public class string_compression {

    public static void main(String[] args) {
        // my logic 
        // String str = "aaabbcccdd";
        // StringBuilder ans = new StringBuilder("");
        // int a = 0;
        // int b = 0;
        // int c = 0;
        // int d = 0;
        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i) == 'a'){
        //         a++;
        //     }
        //     else if(str.charAt(i) == 'b'){
        //         b++;
        //     }
        //     else if(str.charAt(i) == 'c'){
        //         c++;
        //     }
        //     else if(str.charAt(i) == 'd'){
        //         d++;
        //     }  
        // }
        // ans.append("a");
        // ans.append(a);
        // ans.append("b");
        // ans.append(b);
        // ans.append("c");
        // ans.append(c);
        // ans.append("d");
        // ans.append(d);

        // System.out.println(ans);



        // video logic 
        // time complexity O(n)
        String str = "aaabbcccdd";
        String newstr =" ";

        for(int i=0; i<str.length(); i++){  
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count ++;
                i++; // because we increment i here so it will just run for length of str so time complexity is O(n)
            }
            newstr += str.charAt(i);
            if(count > 1){
                newstr += count.toString();
            }
        }

        System.out.println(newstr);

    }
}