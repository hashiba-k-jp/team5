import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startButton extends Actor
{
    /**
     * Act - do whatever the startButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img_bkup = null;
    private int width=50;
    private int height= 50;

    public startButton(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( 100,50 );
    }
    public void act() 
    {
        if ( Greenfoot.mouseClicked( this )){
            getWorld().removeObject( this );
            
            int A = 0;
            int B = 600;
            int C = 400;

            int D = A + (int)(Math.random()*((B-A)+1));
            int E = A + (int)(Math.random()*((C-A)+1));
            getWorld().addObject( this, D, E );

            for(int i=0;i<15;i++){
                int F = A + (int)(Math.random()*((B-A)+1));
                int G = A + (int)(Math.random()*((C-A)+1));
                getWorld().addObject( new nTeki(), F, G );
            }
            getWorld().addObject( new nSousa(), 50, 50);
        }
    }
}
