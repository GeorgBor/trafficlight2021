package trafficlight;

import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;

import trafficlight.states.GreenState;
import trafficlight.states.State;
import trafficlight.states.TrafficLightColor;

import static org.junit.jupiter.api.Assertions.*;

public class Statetest {

    @Test
    void greenStateTest(){

        TrafficLightCtrl ctrl = new TrafficLightCtrl();
        State actual = ctrl.getGreenState();
        State expected = ctrl.getGreenState();
        assertEquals(expected,actual);
    }

    @Test
    void yellowStateTest(){

        TrafficLightCtrl yellowState = new TrafficLightCtrl();
        State actual = yellowState.getYellowState();
        TrafficLightColor expected = TrafficLightColor.YELLOW;
        assertEquals(expected,actual);

    }




}
