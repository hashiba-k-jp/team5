import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hmissile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hmissile extends Actor
{
    /**
     * Act - do whatever the hmissile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int i = 0;
    int xOrigin, yOrigin, TargetX, TargetY;
    int length = 20;
    int xTargets[] = new int[length];
    int yTargets[] = new int[length];
    int sumX, sumY, x, y;
    
    // i := input
    public hmissile(int xTargeti, int yTargeti, int xOrigini, int yOrigini){
        this.setRotation(-180);
        getImage().scale(30, 15);
        xOrigin = xOrigini;
        yOrigin = yOrigini;
        TargetX = xTargeti;
        TargetY = yTargeti;
    }
    // Origin, Target    
    public void act()
    {
        // get location of hSousa
        //int target = getOneIntersectingObject( hSousa.class ).getX();
        if( false ){
            if (! getWorld().getObjects(hSousa.class).isEmpty())
            {
                Actor hSousa = (Actor)getWorld().getObjects(hSousa.class).get(0);
                TargetX = hSousa.getX();
                TargetY = hSousa.getY();
            }
        }

        x = xOrigin + (TargetX - xOrigin) * i / 100;
        y = yOrigin + (TargetY - yOrigin) * i / 100;
        // move(10);
        this.setLocation((int)x, (int)y);
        // Add your action code here.
        i++;
        if(100 <= i){
            getWorld().removeObject( this );
        }
    }
}
