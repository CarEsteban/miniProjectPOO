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
    public void act()
    {
        World w = getWorld();
        move (-5);
        if (isAtEdge())
        {
            setLocation(590, getY());
        }
    }
}
