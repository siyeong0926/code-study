package Study01;

public class Phone {

    int size;
    int price;
    int weight;

    String brand;
    String name;

    public Phone (int newSize, int newPrice, int newWeight, String newBrand, String newName){

        this.size = newSize;
        this.price = newPrice;
        this.weight = newWeight;

        this.brand = newBrand;
        this.name = newName;
    }

    public String ChangeName(String chName){
        name = chName;
        return name;
    }

    //사이즈가 60 이상 , 100 이하 가격이 3만원 이라면 true 반환
    //사이즈가 100 이하 브랜드가 애플이면 false 반환
    public boolean otherPhone(){
        return true;
    }

    public static void main(String[] args) {
        Pen pen1 = new Pen(10000, 150, "삼성", "모나미펜", "red");
        Phone ph1 = new Phone(50, 50000, 15, "삼성", "갤럭시");
        Phone ph2 = new Phone(100, 25000, 20, "애플", "아이폰");


        ph1.ChangeName(ph2.name);
        System.out.println(ph1.name); //아이폰




    }
}

