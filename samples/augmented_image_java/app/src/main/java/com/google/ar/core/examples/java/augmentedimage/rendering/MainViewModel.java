package com.google.ar.core.examples.java.augmentedimage.rendering;

import androidx.lifecycle.ViewModel;

import java.util.Timer;
import java.util.TimerTask;

public class MainViewModel extends ViewModel {

    private Boolean hasSecondPassed = true;

    private Timer secondTimer;

    public MainViewModel() {
        secondTimer = new Timer();

        secondTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                hasSecondPassed = true;
            }
        },0, 1000);
    }


    public void handleImage() {
        if (hasSecondPassed) {
            hasSecondPassed = false;
            //send image to the server
        }
    }
}
