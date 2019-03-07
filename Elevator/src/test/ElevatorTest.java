package test;

import com.company.Elevator;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElevatorTest {
    @Test
    public void goToSecondFloor(){
        Elevator elevator= new Elevator();
        elevator.MoveTo(7);
        assertEquals(7,elevator.getCurrentFloor());
    }

}