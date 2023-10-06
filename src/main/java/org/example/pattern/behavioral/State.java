package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.MediaPlayer;

public interface State {

    void pause(MediaPlayer obj);

    void play(MediaPlayer obj);

    class SubState
            implements State {

        @Override
        public void pause(MediaPlayer obj) {}

        @Override
        public void play(MediaPlayer obj) {
            obj.setState(new Sub2State());
            obj.setIcon("pause button");
            System.out.printf("Video playing, icon set to %s%n", obj.getIcon());
        }
    }

    class Sub2State
            implements State {

        @Override
        public void pause(MediaPlayer obj) {
            obj.setState(new SubState());
            obj.setIcon("play button");
            System.out.printf("Video pause, icon set to %s%n", obj.getIcon());
        }

        @Override
        public void play(MediaPlayer obj) {}
    }
}