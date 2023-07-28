import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceObject extends Actor
{
    /**
     * Act - do whatever the SpaceObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public SpaceObject()
    {
        GreenfootImage rocketImage = new GreenfootImage("alien.png");
        rocketImage.scale(80, 60); 
        setImage(rocketImage);
    }
    public void act()
    {
        World w = getWorld();
        move (-5);
        if (isAtEdge())
        {
            setLocation(1190, getY());
        }
        else{
            if (isTouching(Rocket.class))
            Greenfoot.stop();
            //game over
        }
    }
}
