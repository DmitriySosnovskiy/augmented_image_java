package com.google.ar.core.examples.java.augmentedimage.rendering;

import androidx.lifecycle.ViewModel;

import java.util.Timer;

public class MainViewModel extends ViewModel {

    private Boolean hasSecondPassed = true;

    private Timer secondTimer;

    public MainViewModel() {
        secondTimer = new Timer();
    }
}
