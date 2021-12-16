package com.company;

public class Box {
    private int width;
    private int height;
    private int length;

    Box(int width, int height, int length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int volume() {
        return this.length * this.height * this.width;
    }

    public String toString() {
        return "Box: " + this.width + "," + this.height + "," + this.length;
    }
}
