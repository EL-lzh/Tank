package com.el.tank;

import java.awt.*;

public class Bullet {
    private static final int SPEED = 5;
    private static final int WIDTH = 15;
    private static final int HEIGHT = 15;

    private int x;
    private int y;
    private Dir dir;

    public Bullet(int x, int y, Dir dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }
    public void paint(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.red);
        g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(c);
        move();
    }

    private void move() {
        switch(dir){
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
        }
    }
}
