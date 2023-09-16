package p6;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String();
        String str3 = new String(new char[]{'h', 'e','l', 'l', 'o'});
        String str4 = new String(new char[]{'h', 'e','l', 'l', 'o'}, 2, 2);
        var str = "Str";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str);

        System.out.println(str1.length());

        char[] str1arr = str1.toCharArray();
        for(char i: str1arr){
            System.out.println(i);
        }

        String s = null;
        if (s.isEmpty()){
            System.out.println("String is empty");
        }










    }

}
