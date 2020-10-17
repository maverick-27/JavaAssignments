import java.util.ArrayList;

public class Train {
    String name;
    int power;
    private ArrayList<Integer> frieghtCars = new ArrayList<>();


    public Train(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public ArrayList getfrieghtCars() {
        if (frieghtCars.isEmpty()) {
            return null;
        }
        return frieghtCars;
    }

    public String toString() {
        return "Name:" + this.name + " " + "Power:" + " " + this.power + " " + "";
    }

    public int getTotalWeightOfCars() {
        int sum = 0;
        for (int i = 0; i < frieghtCars.size(); i++) {
            sum += frieghtCars.get(i);
        }
        return sum;
    }

    public int getNumberOfCars() {
        return frieghtCars.size();
    }

    public int maxSpeed() {
        int sum = 0;
        for (int i = 0; i < frieghtCars.size(); i++) {
            sum += frieghtCars.get(i);
        }
        int speed = power - sum;
        return speed;
    }

    public void removeAllCars() {
        frieghtCars.clear();
    }

    public void addCars(int weights) {
        frieghtCars.add(weights);
    }

    public void mergeTrains(Train train) {
        for (int i = 0; i < train.frieghtCars.size(); i++) {
            frieghtCars.add(train.frieghtCars.get(i));
        }
        power += train.power;
        train.power = 0;
        train.frieghtCars = null;
    }
}

