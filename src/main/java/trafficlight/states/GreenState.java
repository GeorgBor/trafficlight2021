package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class GreenState implements State {


    private final TrafficLightCtrl ctrl;

    public GreenState(TrafficLightCtrl ctrl) {
        this.ctrl = ctrl;
    }

    @Override
    public void nextState() {

        if (ctrl.getPreviousState().equals(ctrl.getYellowState())){
            ctrl.setCurrentState(ctrl.getYellowState());
            ctrl.setPreviousState(this);
            System.out.println("Green --> Yellow");
        }
        if (ctrl.getPreviousState().equals(ctrl.getYellowState())){
            ctrl.setCurrentState(ctrl.getRedState());
            ctrl.setPreviousState(this);
            System.out.println("Yellow --> Red");
        }

    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.GREEN;
    }
}
