public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Camry";
        car1.kompanya = "Toyota";
        car1.color = "black";
        car1.baasy = 6000;
        car1.yldamdygy = 280;

        Car car2 = new Car();
        car2.name = "Audi";
        car2.kompanya = "Volkswagen";
        car2.color = "yellou";
        car2.baasy = 7000;
        car2.yldamdygy = 120;



        Car car3 = new Car();
        car3.name = "M-6";
        car3.kompanya = "BMW";
        car3.color = "pink";
        car3.baasy = 5000;
        car3.yldamdygy = 300;



        Car car4 = new Car();
        car4.name = "S-class";
        car4.kompanya = "Mers";
        car4.color = "white";
        car4.baasy = 4500;
        car4.yldamdygy = 120;


        Car car5 = new Car();
        car5.name = "Starex";
        car5.kompanya = "Huynday";
        car5.color = "green";
        car5.baasy = 3400;
        car5.yldamdygy = 278;



        int[] array = new int[5];
        Car[] cars = new Car[5];
        cars[0] = car1;

        Car[] cars1 = {car1, car2, car3, car4, car5};

        int maxPrice = cars1[0].baasy;
        for (int i = 0; i < cars1.length; i++) {
            if (maxPrice <= cars1[i].baasy) ;
            maxPrice = cars1[i].baasy;
        }
        for (Car car : cars1) {
            if (car.baasy == maxPrice) {
                car.getInfo();
            }

        }
    }

}