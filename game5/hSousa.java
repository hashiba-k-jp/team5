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

    public int timecount = 1000;
    public boolean movailbe = true;
    public boolean hremoveAfterHit = true;

    public hSousa(){
        getImage().scale( 35, 35 );
        getImage().mirrorHorizontally();
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

        // Add your action code here.

        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(-90);
            move(5);
            setRotation(0);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setRotation(90);
            move(5);
            setRotation(0);
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(2);
        }
        // when the nSouse (player) hit the nItem (snowman)
        Actor actor_c = getOneIntersectingObject( hItem.class );
        if( actor_c != null ){
            getWorld().removeObject( actor_c );
            hremoveAfterHit = false;
            Greenfoot.setWorld( new hBackGround() );

        }
        // when the nSouse (player) hit the nTeki (black man)
        Actor actor_tank = getOneIntersectingObject( hTank.class );
        Actor actor_missile = getOneIntersectingObject( hmissile.class );
        if(((actor_tank != null) || (actor_missile != null)) && (hremoveAfterHit)){
            getWorld().addObject( new gameOver(), 300, 200 );
            getWorld().removeObject( this );
            Greenfoot.stop();
        }
      }
    }
