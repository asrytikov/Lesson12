package p9;

public class Main {

    public static void main(String[] args) {

        String str = "Java";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.capacity());
        stringBuffer.ensureCapacity(32);
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.toString());
        stringBuffer.append(" is the best");
        System.out.println(stringBuffer.toString());
        stringBuffer.insert(16, '!');
        System.out.println(stringBuffer.toString());
        stringBuffer.delete(0, 5);
        System.out.println(stringBuffer.toString());
        stringBuffer.setLength(6);
        System.out.println(stringBuffer.toString());
        stringBuffer.setLength(10);
        System.out.println(stringBuffer.toString());
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString());






    }

}
