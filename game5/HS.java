import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HS extends Actor
{
    /**
     * Act - do whatever the HS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD


        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(-1);
    }

 

          // Add your action code here.
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(-90);
        move(1);
        setRotation(0);
}

=======
          // Add your action code here.
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(-90);
            move(1);
        }
>>>>>>> c83f607fce73b69f9be54290f0cec1e1faae0ebf
        if( Greenfoot.isKeyDown( "down" ) ){
            setRotation(90);
            move(1);
            setRotation(0);
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(1);
        }
<<<<<<< HEAD

}
=======
    }    
>>>>>>> c83f607fce73b69f9be54290f0cec1e1faae0ebf
}
