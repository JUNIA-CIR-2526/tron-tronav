package com.jad;

import com.jad.textwindow.TextWindow;

public class Game {
    public static final int GRID_HEIGHT = 50;
    public static final int GRID_WIDTH = 100;
    public Grid grid;
    public TextWindow textWindow;

    public LightCycle[] motos;

    public Game(int nbMotos, TextWindow textWindow) {
        for (int i = 0; i < nbMotos; i++) {
            if (motos != null) {
                motos[i] = new LightCycle(0, 0);
            }
        }
        grid = new Grid(GRID_WIDTH, GRID_HEIGHT);
        this.textWindow = textWindow;

    }

    public void iteration() {
        for (LightCycle moto : motos) {
            moto.move;
        }
    }

    public void display() {
        String[] map = grid.toPrettyString();
        for (int row = 0; row < GRID_HEIGHT; row++) {
            textWindow.display(map[row]);
        }
    }
}
