import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shots extends Actor
{
    /**
     * Act - do whatever the shots wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        World w= getWorld();
        move(4);
        if (isAtEdge())
        {
            w.removeObject(this);
        }
        else
        {   if (isTouching(SpaceObject.class))
            {
            removeTouching(SpaceObject.class);
            MyWorld.puntos.add(10);
            //contador++
            }
        }
    }
}
