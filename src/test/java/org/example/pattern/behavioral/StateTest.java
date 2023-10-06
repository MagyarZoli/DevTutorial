package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.MediaPlayer;
import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StateTest
        extends UserTest
        implements BehavioralTest {

    private MediaPlayer player;

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> player = new MediaPlayer());
        player.mediaPlay();
        player.mediaPause();
        player.mediaPlay();
    }
}