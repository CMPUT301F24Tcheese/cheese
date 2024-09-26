package com.example.cheese;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color = "blue";  // 新添加的字段

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}
