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
<<<<<<< HEAD
          // Add your action code here.
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(-90);
        move(1);
}
=======
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
        setRotation(0);

        }
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
        }
>>>>>>> 1dd28eea601cfa06ceb9130334d7287c1505da2f
    }    
}