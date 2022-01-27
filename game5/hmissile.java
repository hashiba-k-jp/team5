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

    public hmissile(){
        this.setRotation(-180);
        getImage().scale(30, 15);
    }
    public void act(int xTargetF)
    {
        if (xTargetF == 0){
        }
        // Add your action code here.
    }
}
