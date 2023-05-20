package Study02;

public class StringMemory {

    public static void main(String[] args){

        String str1 = new String("Hello Java");
        String str2 = new String("Hello Java");
        /*
        new 를 통해서 객체 생성, str1,str2 의 stack 메모리 스택에는 heap 주소 값이 저장됨.
        ex) str1 = 0x100 의 heap 주소 값 저장, str2 = 0x200 의 heap 주소값 저장
         */


        System.out.println(str1);
        System.out.println(str2);
        //Hello Java 출력

        boolean b;

        b = str1 == str2;       // ==은 스택 메모리의 값을 비교하는 연산자
        System.out.println(b);  // 출력 하게 되면, str1,str2 의 스택 메모리 값은, 다른 주소를 가리키고 있으므로 false 출력


        b = str1.equals(str2);  // .equals 는 값을 비교하는 연산자
        System.out.println(b);  // 출력 하게 되면, str1, str2의 값은 똑같이 Hello Java 이므로 true 출력

        System.out.println("이 아래로는 리터럴");

        String str3 = "Hello Java";
        String str4 = "Hello Java";
         /*
         String 는 "" 를 통한 객체 생성이 가능함
         다만 ""를 통해 생성하게 되면 Spool 공간에 생성되고
         같은 값은 새로 생성하지 않고 한 곳의 주소를 가리킴.
          */

        System.out.println(str3);
        System.out.println(str4);
        //Hello Java 출력

        b = str3 == str4;
        System.out.println(b);
        /*
        출력을 하게 되면 true 가 출력된다.
        앞에서 말한 것 처럼 Spool 에 Hello Java 가 한 번 생성이 되었고
        str4 는 str3 가 생성한 stack 메모리 스택에 있는 같은 주소 값을 가리킨다.
        고로 같은 주소값을 가리키는 형태가 되어서 true 가 출력됨.
         */

        b = str2.equals(str3);
        System.out.println(b);
        /*
        .equals 연산자를 사용해서 값을 비교 하더라도
        서로 값은 같기 떄문에 true 를 출력 하게 된다.
         */


    }




}
