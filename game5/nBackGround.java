import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nBackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nBackGround extends World
{
    private int timecount = 1000;
    /**
     * Constructor for objects of class nBackGround.
     * 
     */
    public nBackGround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Actor SButton = new startButton();
        addObject(SButton, 300, 200);
    }
    public void act(){
        timecount=timecount-1;
        showText( "timecount = " + timecount , 100, 50 );
        if(timecount <= 0)
        {
          addObject( new gameOver(), 300, 200 );
          Greenfoot.stop();  
        }
    }
}
