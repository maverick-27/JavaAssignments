import org.junit.jupiter.api.Test;
import org.omg.CORBA.INTERNAL;

import java.text.ParseException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainTest {

    @Test
    void Test() {
        Train train = new Train("Canada Express", 800);

    }

    @Test
    public void getfrieghtCars() {
        Train train = new Train("Demo", 1200);
        train.addCars(200);
        train.addCars(220);
        ArrayList<Integer> expectedFreightCars = new ArrayList();
        expectedFreightCars.add(200);
        expectedFreightCars.add(220);
        System.out.println(expectedFreightCars);
        assertEquals(expectedFreightCars, train.getfrieghtCars());
    }

    @Test
    public void getTotalWeightOfCars() {
        Train train = new Train("ASsd", 800);
        int expected = 200;
        train.addCars(100);
        train.addCars(100);
        assertEquals(expected, train.getTotalWeightOfCars());
    }

    @Test
    public void getNumberOfCars() {
        Train train = new Train("CA", 200);
        int expected = 2;
        train.addCars(200);
        train.addCars(21);
        assertEquals(expected, train.getNumberOfCars());
    }


    @Test
    public void maxSpeed() {
        Train train = new Train("CA", 200);
        int expected = 2;
        train.addCars(200);
        train.addCars(21);
        assertEquals(expected, train.getNumberOfCars());

    }


    @Test
    public void addCars() {
        Train train = new Train("CA", 200);
        ArrayList<Integer> ar = new ArrayList();
        ar.add(200);
        ar.add(21);
        train.addCars(200);
        train.addCars(21);
        assertEquals(ar, train.getfrieghtCars ());
    }

}

