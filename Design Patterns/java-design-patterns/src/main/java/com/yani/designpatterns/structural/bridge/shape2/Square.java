package com.yani.designpatterns.structural.bridge.shape2;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
