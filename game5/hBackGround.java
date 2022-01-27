import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hBackGround extends World
{

    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public hBackGround()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        // super(512, 314, 1);
        super(600, 400, 1);

        addObject( new hSousa(), 50, 50);

        int A = 0;
        int B = 600;
        int C = 400;
        int F = 100;
        
        Actor hItem = new hItem();
        
        addObject( new hItem(), 500, 210 );

        addObject( new hTank(), 500, 050 );
        addObject( new hTank(), 500, 100 );
        addObject( new hTank(), 500, 150 );
        addObject( new hTank(), 500, 275 );
        addObject( new hTank(), 500, 325 );
        addObject( new hTank(), 500, 375 );
        

        // addObject( new hItem(), C, D );

    }
}
