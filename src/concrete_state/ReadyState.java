package concrete_state;

import client.MyClientContext;
import state.State;


public class ReadyState implements State {

    private MyClientContext myClientContext;

    public ReadyState(MyClientContext myClientContext) {
        this.myClientContext = myClientContext;
    }

    @Override
    public void handle() {
        System.out.println("I am waiting for cpu");

        myClientContext.setCurrentState(myClientContext.getRunningState());  //就绪进入运行态

    }
}
