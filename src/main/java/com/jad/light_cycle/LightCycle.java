package com.jad.light_cycle;

import java.util.Random;

public class LightCycle {
    private static int SPEED = 1;
    Position position;
    boolean destroyed = false;
    int[] direction;
    Grid grid;

    public LightCycle(int x, int y) {
        position = new Position(x, y);
        direction = this.randomDirection();
    }

    private int[] randomDirection() {
        int chooseDirection = new Random().nextInt(4);
        int[] newDirection;
        switch (chooseDirection) {
            case 0:
                newDirection = new int[]{0, 1};
                break;
            case 1:
                newDirection = new int[]{0, -1};
                break;
            case 2:
                newDirection = new int[]{1, 0};
                break;
            case 3:
                newDirection = new int[]{-1, 0};
                break;
            default:
                newDirection = new int[]{0, 0};
                break;
        }
        return newDirection;
    }

    public void right() {
        if (destroyed) return;
        this.direction[0] = this.direction[1];
        this.direction[1] = -this.direction[0];
    }

    public void left() {
        if (destroyed) return;
        this.direction[0] = -this.direction[1];
        this.direction[1] = this.direction[0];
    }

    public void destroy() {
        if (!destroyed) destroyed = true;
    }

    public void move() {
        position.setX(position.getX() + this.direction[0] * SPEED);
        position.setY(position.getY() + this.direction[1] * SPEED);
        position.correctPosition(grid.getWidth(), grid.getHeight);
    }
}
