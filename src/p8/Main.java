package p8;

public class Main {

    public static void main(String[] args) {
        String str =  "Hello";
        int index = str.indexOf('l');
        int index2 = str.indexOf("el");
        int index3 = str.lastIndexOf('l');

        System.out.printf("%d %d %d",index, index2, index3);
        System.out.println();
        String replStr1 = str.replace('l', 'd');
        System.out.println(replStr1);

        String str1 = "    hello    ";
        str1 = str1.trim();
        System.out.println(str1);

        String s = "Hello world";
        String subs = s.substring(6);
        System.out.println(subs);
        String subs2 = s.substring(2, 7);
        System.out.println(subs2);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String text = "Java is the best";
        String[] words = text.split(" ");
        for (String word: words){
            System.out.println(word);
        }



    }

}
