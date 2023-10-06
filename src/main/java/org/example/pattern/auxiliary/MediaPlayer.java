package org.example.pattern.auxiliary;

import org.example.pattern.behavioral.State;

public class MediaPlayer {

    private State state = new State.SubState();
    private String icon = "play button";

    public State getState() {
        return state;
    }

    public String getIcon() {
        return icon;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void mediaPlay() {
        state.play(this);
    }

    public void mediaPause() {
        state.pause(this);
    }
}