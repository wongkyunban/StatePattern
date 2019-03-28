package concrete_state;

import client.MyClientContext;
import state.State;


public class BlockState implements State {

    private MyClientContext myClientContext;
    public BlockState(MyClientContext myClientContext){
        this.myClientContext = myClientContext;
    }

    @Override
    public void handle() {
        System.out.println("I am blocked.There is not enough resource for me to use.");
    }
}
