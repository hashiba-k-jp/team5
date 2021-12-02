import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nTeki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nTeki extends Actor
{
    /**
     * Act - do whatever the nTeki wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public nTeki(){
        getImage().scale( 55, 80 );
        getImage().scale(30, 43);
        // 40, 65
    }
    public void act() 
    {
        Actor actor_b = getOneIntersectingObject( nSousa.class );
       if( actor_b != null ){
            getWorld().removeObject( actor_b );
            
            Greenfoot.stop();
       }
    }    
}
