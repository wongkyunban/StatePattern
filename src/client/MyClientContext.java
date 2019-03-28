package client;


import concrete_state.BlockState;
import concrete_state.ReadyState;
import concrete_state.RunningState;
import state.State;

public class MyClientContext {
    private State readyState;  //就緒状态
    private State runningState; //运行状态
    private State blockState;//阻塞状态
    private State currentState; //当前状态

    public MyClientContext(){
        readyState = new ReadyState(this);
        runningState = new RunningState(this);
        blockState = new BlockState(this);
        currentState = readyState;
    }

    public void request(){
        currentState.handle();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getBlockState() {
        return blockState;
    }

    public void setBlockState(State blockState) {
        this.blockState = blockState;
    }

    public State getRunningState() {
        return runningState;
    }

    public void setRunningState(State runningState) {
        this.runningState = runningState;
    }

    public State getReadyState() {
        return readyState;
    }

    public void setReadyState(State readyState) {
        this.readyState = readyState;
    }
}
