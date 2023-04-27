import java.nio.channels.AcceptPendingException;

public class Pen {

    int price;
    int penSize;

    String brand;
    String penName;
    String color;

    //컨스트럭터
    public Pen (int newPrice, int newPenSize, String newBrand, String newPenName, String newColor) {

        this.price = newPrice;
        this.penSize = newPenSize;

        this.brand = newBrand;
        this.penName = newPenName;
        this.color = newColor;

    }
    //특정한 펜의 price 를 두 배로 만드는
    public int doublePen () {
        return price * 2;
    }
    //브랜드를 바꾸어주는 메서드
    public String ChangeBrand(String chBrand) {
        brand = chBrand;
        return brand;
    }
    //두 가지의 price 값을 더하는 메서드
    public void doublePrice(Pen dbPrice){
       price = price + dbPrice.price;
    }
    public boolean rePen(Pen otherPen){

        if (otherPen.penSize >= 1 && otherPen.price <= 10000){
            return false;
        }
        else if (otherPen.penSize >= 1 && otherPen.price >= 10000){
            return false;
        }
        else if (otherPen.penSize <= 1 && otherPen.price >= 10000){
            return true;
        }
        else
            return false;
}
    /*
     * 숙제 : 메서드를 네 가지 만드는데
     *
     * 메인 메서드, 메인 메서드에 두 가지의 인스턴스 베리어블
     * 메서드1 : 브랜드 이름 바꿔주는 것
     * 메서드2 : 두 가지의 프라이스 값의 합을 리턴
     * 메서드3 : 브랜드 이름의 스트링 길이 (숫자로) 리턴
     * 메서드4 : 펜 사이즈가 1 이상이고 , 가격이 10000 이하면 false 리턴
     * 			 펜 사이즈가 1 이상이고 , 가격이 10000 이상 이어도 false 리턴
     * 			 대신 size가 1 이하이고 , 가격이 10000 이상이면 true 리턴
     * 			 나머지의 경우의 수는 false
     */

    public static void main (String[] args){


        Pen pen1 = new Pen(10000, 150, "삼성", "모나미펜", "red");
        Pen pen2 = new Pen(15000, 200, "엘지", "쥬스펜", "black");

        pen1.ChangeBrand("소니");
        System.out.println(pen1.brand);

        pen1.doublePrice(pen2);
        System.out.println(pen1.price);

        pen1.rePen(pen2);
        System.out.println(pen1.rePen(pen1));

    }
}
