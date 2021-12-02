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
        boolean removeAfterHit = true;
        
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
        Actor actor_a = getOneIntersectingObject( nItem.class );
        if( actor_a != null ){
            removeAfterHit = false;
            getWorld().removeObject( actor_a );
        }
        Actor actor_b = getOneIntersectingObject( nTeki.class );
        if( actor_b != null && !(removeAfterHit == true)){
            getWorld().removeObject( this );
            Greenfoot.stop();
        }
      }
    }    
