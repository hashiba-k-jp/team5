import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nItem extends Actor
{
    /**
     * Act - do whatever the nItem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public nItem(){
        getImage().scale( 75 , 75 );
    }
    public void act() 
    {
        Actor actor = getOneIntersectingObject( nItem.class );
        if( actor != null ){
            getWorld().removeObject( actor );
        }
    }    
}
