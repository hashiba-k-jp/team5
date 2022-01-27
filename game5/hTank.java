import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class hTank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hTank extends Actor
{
    /**
     * Act - do whatever the hTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public hTank(){
        getImage().scale(80, 30);
        // 40, 65
    }
    public void act()
    {
        // Add your action code here.
        Random rand = new Random();
        int num = rand.nextInt(100);
        int targetX = 0;
        int targetY = 0;
        // get location of hSousa
        //int target = getOneIntersectingObject( hSousa.class ).getX();
        if (! getWorld().getObjects(hSousa.class).isEmpty())
        {
            Actor hSousa = (Actor)getWorld().getObjects(hSousa.class).get(0);
            targetX = hSousa.getX();
            targetY = hSousa.getY();
        }
        // int targetX = target.getX();

        // shoot randomely at 1/100 probablity
        if (num == 0){
            getWorld().addObject( new hmissile(), targetX, targetY);
        }
    }
}
