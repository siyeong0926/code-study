package Study02;

public class StringMemory {

    public static void main(String[] args){

        String str1 = new String("Hello Java");
        String str2 = new String("Hello Java");

        System.out.println(str1);
        System.out.println(str2);

        boolean b;

        b = str1 == str2;
        System.out.println(b);

        b = str1.equals(str2);
        System.out.println("이 아래로는 리터럴");

        String str3 = "Hello Java";
        String str4 = "Hello Java";

        System.out.println(str3);
        System.out.println(str4);

        b = str3 == str4;
        System.out.println(b);

        b = str2.equals(str3);
        System.out.println(b);


    }




}
