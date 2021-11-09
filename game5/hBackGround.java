import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hBackGround extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public hBackGround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(512, 314, 1); 
        int A = 0;
        int B = 400;
        int C = A + (int)(Math.random()*((B-A)+1));
        int D = A + (int)(Math.random()*((B-A)+1));
        addObject( new hItem(), C, D );
    }
}
