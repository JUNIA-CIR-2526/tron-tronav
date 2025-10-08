package com.jad.light_cycle;

public class Position {
    public int x;
    public int y;


    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void correctPosition(int width, int height) {
        if (this.x < 0) this.x = width - 1;
        if (this.x > width) this.x = 0;
        if (this.y < 0) this.y = height - 1;
        if (this.y > height) this.y = 0;
    }
}
