package concrete_state;

import client.MyClientContext;
import state.State;


public class RunningState implements State {

    private MyClientContext myClientContext;

    public RunningState(MyClientContext myClientContext) {
        this.myClientContext = myClientContext;
    }

    @Override
    public void handle() {
        System.out.println("I am running now");

        myClientContext.setCurrentState(myClientContext.getBlockState());  //就运行态进入阻塞状

    }
}
