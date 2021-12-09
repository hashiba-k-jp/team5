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
        for(int i=0; i<15; i++){
            int F = A + (int)(Math.random()*((B-A)+1));
            int G = A + (int)(Math.random()*((C-A)+1));
            if( ((0 <= F ) &&( F <= 100)) || ((0 <= G) && ( G <= 100)) ){
                i--;
                continue;
            }
            addObject( new hTank(), F, G );
        }
        // addObject( new hItem(), C, D );
        
    }
}
