package com.yani.designpatterns.structural.bridge.shape1;

public class RedSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("Applying red color...");
    }
}
