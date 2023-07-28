import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class extraLife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class extraLife extends Actor
{
    /**
     * Act - do whatever the extraLife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public extraLife()
    {
        GreenfootImage rocketImage = new GreenfootImage("cora.png");
        rocketImage.scale(40, 40); 
        setImage(rocketImage);
    }
    public void act()
    {
        World w = getWorld();
        move (-5);
        
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
        else{
            if (isTouching(Rocket.class))
            getWorld().removeObject(this);
            //subir vidas
        }
    }
}
