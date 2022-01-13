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
    public int timecount = 1000;
    public boolean movailbe = true;
    public boolean removeAfterHit = true;
    public boolean nEnded = false;

    public nSousa(){
        getImage().scale( 50, 50 );
    }
    public void act() 
    {
        timecount--;
        getWorld().showText( "time\n" + timecount , 100, 50 );
        if(timecount <= 0)
        {
          getWorld().addObject( new gameOver(), 300, 200 );
          Greenfoot.stop();  
        }
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
        // when the nSouse (player) hit the nItem (snowman)
        Actor actor_a = getOneIntersectingObject( nItem.class );
        if( actor_a != null ){
            getWorld().removeObject( actor_a );
            removeAfterHit = false;
            Greenfoot.setWorld( new hBackGround() );
            nEnded = true;
        }
        // when the nSouse (player) hit the nTeki (black man)
        Actor actor_b = getOneIntersectingObject( nTeki.class );
        if( (actor_b != null) && (removeAfterHit)){
            getWorld().addObject( new gameOver(), 300, 200 );
            getWorld().removeObject( this );
            Greenfoot.stop();
        }
      }
    }    
