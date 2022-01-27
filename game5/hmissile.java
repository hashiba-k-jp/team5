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
    int xOrigin, yOrigin, xTarget, yTarget;
    
    // i := input
    public hmissile(int xTargeti, int yTargeti, int xOrigini, int yOrigini){
        this.setRotation(-180);
        getImage().scale(30, 15);
        xOrigin = xOrigini;
        yOrigin = yOrigini;
        xTarget = xTargeti;
        yTarget = yTargeti;
        
    }
    // Origin, Target
    public void act()
    {
        double x, y;
        x = xOrigin + (xTarget - xOrigin) * i / 100;
        y = yOrigin + (yTarget - yOrigin) * i / 100;
        // move(10);
        this.setLocation((int)x, (int)y);
        // Add your action code here.
        i++;
        if(100 <= i){
            getWorld().removeObject( this );
        }
    }
}
