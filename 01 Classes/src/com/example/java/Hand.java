package com.example.java;

public class Hand {

    public enum State {colosed, open};

    private State state = State.colosed;

    public State getState() {
        return state;
    }

    public void Close(){
        this.state = State.colosed;
    }

    public void Open(){
        this.state = State.open;
    }

    public boolean isClosed(){
        return state == State.colosed;
    }

    public boolean isOpen(){
        return state == State.open;
    }

}
