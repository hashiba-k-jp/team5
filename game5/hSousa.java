import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hSousa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hSousa extends Actor
{
    /**
     * Act - do whatever the hSousa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        getImage().scale( 100, 100 );
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(-90);
        move(4);
        setRotation(0);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(4);
        setRotation(0);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(-4);
        }
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(4);
        }
    }
}
