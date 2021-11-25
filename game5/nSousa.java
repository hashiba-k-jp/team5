import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nSousa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class nSousa extends Actor
{
    /**
     * Act - do whatever the nSousa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public nSousa(){
        getImage().scale( 50, 50 );
    }
    
    public void act() 
    {
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
