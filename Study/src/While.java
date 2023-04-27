import java.util.Scanner;

public class While {


        public static void main(String[] args) {


                /*
                 * 구구단 프린트하기
                 * 스캐너로 몇 단을 프린트 할건지 인티저를 받아주고
                 * 만약 2단이라고 예시를 들면
                 * 2 X 1 = 2 ..... 2 X 9 = 18 까지 전부 나와야한다
                 * 힌트는 while 들어가고,  * 사용 해야함
                 * int 라는 answer 를 만들어줘야 한다.
                 */

                int num = 0;


                System.out.println("단을 입력");
                Scanner sc = new Scanner(System.in);
                int srr = sc.nextInt();

                while (num < 9){
                    num ++;

                    System.out.println("2 * " + num +" "+ 2 * num);
                }



            }
        }


