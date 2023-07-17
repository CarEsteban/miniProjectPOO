import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World w;
    public void act()
    {
        w= getWorld();
        mover();
        shooter();
    }
    public void mover ()
    {
        if (Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY()-10);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(),getY()+10);
        }
    }
    public void shooter()
    {
        World w= getWorld();
        if(Greenfoot.isKeyDown("space"))
        {
            w.addObject(new shots(), getX()+50, getY());
            //Greenfoot.playSound("destruir.wav");//agregar sonido
        }
    }
}
