import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HS extends Actor
{
    /**
     * Act - do whatever the HS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
        setRotation(0);

        }
    }    
}
