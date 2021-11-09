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
<<<<<<< HEAD
        {
            if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(0);
            move(-1);
        }
            if( Greenfoot.isKeyDown( "up" ) ){
=======
    {
        if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(0);
            move(-1);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
>>>>>>> d6a2900493abb5f00fcd0dd3217cff2ba1a76746
            setRotation(-90);
            move(1);
            setRotation(0);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setRotation(90);
            move(1);
            setRotation(0);
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(1);
        }
    }
<<<<<<< HEAD
}    
// test 20211109
=======
}
>>>>>>> d6a2900493abb5f00fcd0dd3217cff2ba1a76746
