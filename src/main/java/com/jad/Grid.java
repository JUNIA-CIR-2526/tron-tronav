package com.jad;

public class Grid {
    public int[][] grid;
    private int width;
    private int height;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String[] toPrettyString() {
        String[] map = new String[height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (x == 0) map[y] = intToChar(grid[y][x]);
                else map[y] += intToChar(grid[y][x]);
            }
        }
        return map;
    }

    public String intToChar(int i) {
        if (i == 0) return " ";
        return "#";
    }
}


