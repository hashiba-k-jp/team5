import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nBackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nBackGround extends World
{
    private int timecount = 1000;
    /**
     * Constructor for objects of class nBackGround.
     * 
     */
    public nBackGround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(600, 400, 1); 
        int A = 0;
        int B = 600;
        int C = 400;
        int D = A + (int)(Math.random()*((B-A)+1));
        int E = A + (int)(Math.random()*((C-A)+1));
        for(int i=0;i<3;i++){
            int H = A + (int)(Math.random()*((B-A)+1));
            int I = A + (int)(Math.random()*((C-A)+1));
            addObject( new nItem(), H, I );
        }
        for(int i=0;i<12;i++){
            int F = A + (int)(Math.random()*((B-A)+1));
            int G = A + (int)(Math.random()*((C-A)+1));
            addObject( new nTeki(), F, G );
       
        }
        addObject( new startButton(), 300, 200);
        addObject( new nSousa(), 50, 50);
        
        Actor SButton = new startButton();
        addObject(SButton, 300, 200);
    }
}
