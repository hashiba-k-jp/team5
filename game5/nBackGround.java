import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nBackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nBackGround extends World
{

    /**
     * Constructor for objects of class nBackGround.
     * 
     */
    public nBackGround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        int A = 0;
        int B = 600;
        int C = 400;
        int D = A + (int)(Math.random()*((B-A)+1));
        int E = A + (int)(Math.random()*((C-A)+1));
        
        Actor Button = new startButton();
        addObject( Button, 300, 200);

    
    
    }
}
