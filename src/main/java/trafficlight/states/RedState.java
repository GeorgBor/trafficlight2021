package trafficlight.states;
import trafficlight.ctrl.TrafficLightCtrl;

public class RedState implements State {

    private final TrafficLightCtrl ctrl;

    public RedState(TrafficLightCtrl ctrl) {
        this.ctrl = ctrl;
    }

    @Override
    public void nextState() {
        if (ctrl.getPreviousState().equals(ctrl.getYellowState())){
            ctrl.setCurrentState(ctrl.getYellowState());
            ctrl.setPreviousState(this);
            System.out.println("Rot --> Gelb");

        }
        if (ctrl.getPreviousState().equals(ctrl.getGreenState())){
            ctrl.setCurrentState(ctrl.getGreenState());
            ctrl.setPreviousState(this);
            System.out.println("Rot --> Grün");

        }

    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.RED;
    }
}
