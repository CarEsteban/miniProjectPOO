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
    
    private long lastShotTime; // Variable para registrar el tiempo del último disparo
    private static final long SHOT_DELAY = 1000; // Tiempo de espera entre disparos en milisegundos (0.5 segundos en este ejemplo)

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
        if (Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX()-10,getY());
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+10,getY());
        }
    }
    public void shooter()
    {
        World w = getWorld();
        long currentTime = System.currentTimeMillis();
    
        if (Greenfoot.isKeyDown("space") && currentTime - lastShotTime >= SHOT_DELAY)
        {
            w.addObject(new shots(), getX() + 50, getY());
            Greenfoot.playSound("shootLaserLow.mp3");
            lastShotTime = currentTime; // Actualiza el tiempo del último disparo
        }
    }
}
