import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public void act()
    {
        // Add your action code here.
        getImage().scale(100, 50);

        int randomeTime = 100 + (int)(Math.random()*((200-100)+1));
        getWorld().addObject( new hmissile(), getX(), getY() );

    }
}
