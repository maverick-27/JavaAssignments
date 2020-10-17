public class Main {

    public static void main(String[] args) {
        Train train = new Train("Rajdhani", 400);
        Train train2 = new Train("Rajdhani", 400);
        train.addCars(30);
        train.addCars(30);
        train.addCars(30);
//        train.mergeTrains(train2);
        System.out.println(train.maxSpeed());
        System.out.println(train.toString());
        System.out.println(train2.toString());
//        System.out.println(train.getfrieghtCars());
    }
}
