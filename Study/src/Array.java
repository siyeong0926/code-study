
import java.util.Scanner;

public class Array {

    int[] arr;


    public Array () {

        arr = new int[5];
    }
    //스캐너로 특정 인덱스를 바꿈 , 그 인덱스 지정은 파라미터에서 , 어떤 수로 바꿀 것인지는 스캐너로
    public void changeArr (int chAr) {

        System.out.println("숫자입력");
        Scanner sc = new Scanner(System.in);
        int ars = sc.nextInt();

        arr[chAr] = ars;

    }


    public static void main(String[] args) {

        Array ar1 = new Array();

        ar1.changeArr(0); // 인덱스 0 값이 2로 바뀜
    }
}