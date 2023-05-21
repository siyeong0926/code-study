package Study01;

public class TvStudy {


        String brand;
        String color;
        int size;
        int price;

        //컨스트럭터
        public TvStudy(String newBrand, String newColor, int newSize, int newPrice) {

            this.brand = newBrand;
            this.color = newColor;
            this.size = newSize;
            this.price = newPrice;


        }
        public void changeBrand (String changebrand) {
            brand = changebrand;

        }

//   public boolean samesize (TV othersize) {
//
//      if (size == othersize.size)
//         return true;
//      }
//      return false;
//   }

        //컨스트럭스가 지정이 되어 있어서 인스턴스 베리어블을 지정해줌
        public int sameprice (TvStudy otherprice) {

            if (price == otherprice.price) {
                return 1;
            }
            else if ( price == otherprice.price * 2 || price*2 == otherprice.price ) {
                return 2;
            }
            else {
                return 0;
            }
        }
        /*
         * 10보다 작으면 할인을 안해주고
         * 10보다 크면 할인을 해주는 것
         * price 10이랑 같으면 10% 할인
         */

        public double disprice () {
            int a = 10;

            if (price > a) {
                return price * 0.7;
            }
            else if (price == a) {
                return price * 0.1;
            }
            else {
                return price;
            }
        }

        public void changeSize (TvStudy chSize) {
            //tv1 의 사이즈를 tv2 의 사이즈로 바꿔주는

            size = chSize.size;
        }

        public int checkLength () {

            return brand.length();
        }

        public int getPrice () {

            return price;
        }


        /**
         * 두 개의 가격을 비교하는 것
         * 두 개의 가격이 같으면 1을 반환하고
         * 두 개의 가격이 두 배 차이면 2를 반환
         * 두 개의 가격이 다르면 0반환
         *
         */

        public static void main(String[] args) {

            TvStudy tv1 = new TvStudy ("samsung", "black", 100, 10000);
            TvStudy tv2 = new TvStudy ("LG", "red", 200, 20000);


            //tv1.samesize(tv2);
            tv1.changeBrand("sony");



            tv1.sameprice(tv2);

//      System.out.println(tv1.samesize(tv2));
            System.out.println(tv1.sameprice(tv2));

        }

    }

