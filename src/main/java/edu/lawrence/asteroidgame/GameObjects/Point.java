package edu.lawrence.asteroidgame.GameObjects;

/* A simple Point class. **/
public class Point {
    public double x;
    public double y;
    
    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
}
