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
    int c=3;
    private long lastShotTime; // Variable para registrar el tiempo del último disparo
    private static final long SHOT_DELAY = 500; // Tiempo de espera entre disparos en milisegundos
    public Rocket()
    {
        GreenfootImage rocketImage = new GreenfootImage("nave.png");
        rocketImage.scale(90, 90); 
        setImage(rocketImage);
    }
    public void act()
    {
        w= getWorld();
        mover();
        shooter();
        tocar();
        
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
        if (isTouching(SpaceObject.class)){
            removeTouching(SpaceObject.class);
            MyWorld.puntos.add(10);
            
        }
    }
    public void Disminuir()
    {
        int c=3;
        if (isAtEdge())
        {
            setLocation(1190, getY());
        } else
        {
            if(isTouching(Rocket.class))
            {
            c--;
            if (c==0)
            {
                Greenfoot.stop();
            }      
            }
        }
    }
    private void tocar()
    {
        if(isTouching(SpaceObject.class))
        {
           removeTouching(SpaceObject.class);
           MyWorld.vidas.add(-1);
           
        }
    }
}
