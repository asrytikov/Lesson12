package p7;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "all";
        String str3 = str1 + " "+ str2 + " " + 2023;
        System.out.println(str3);

        String str4 = "Hey ";

        str4 = str4.concat(str2);
        System.out.println(str4);

        String s = String.join(" ", str1, str2);
        System.out.println(s);

        char l = str1.charAt(2);
        System.out.println(l);

        String s1 = "Hello world!";
        int start = 3;
        int end = 10;
        char[] dst = new char[end-start];
        s1.getChars(start, end, dst, 0);
        System.out.println(dst);

        String ss = "Hello";
        String ss1 = "hello";

        System.out.println(ss.equals(ss1));
        System.out.println(ss.equalsIgnoreCase(ss1));

        String stroka1 = "Hello world!";
        String stroka2 = "I work";
        boolean result = stroka1.regionMatches(6, stroka2, 2, 3);
        System.out.println(result);

        String sstr1 = "hello";
        String sstr2 = "world";
        String sstr3 = "hell";

        System.out.println(sstr1.compareTo(sstr2));
        System.out.println(sstr1.compareTo(sstr3));


    }

}
