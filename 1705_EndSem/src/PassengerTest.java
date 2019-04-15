import org.junit.Test;

public class PassengerTest {

    @Test
    public void enterName() {
        Passenger passenger = new Passenger();
        passenger.enterName();
        assertArrayEquals("PassengerName",13,passenger);
    }

    private void assertArrayEquals(String passengerName, int i, Passenger passenger) {
    }
}