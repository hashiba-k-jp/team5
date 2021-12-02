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
<<<<<<< HEAD
        }
        Actor actor_a = getOneIntersectingObject( nItem.class );
        if( actor_a != null ){
            getWorld().removeObject( actor_a );
        }
        Actor actor_b = getOneIntersectingObject( nTeki.class );
        if( actor_b != null ){
            getWorld().removeObject( this );
            Greenfoot.stop();
        }
=======
      }
>>>>>>> 61d67cc6f2c19189c997a76b5e350ae58f81e3b9
    }    
}
