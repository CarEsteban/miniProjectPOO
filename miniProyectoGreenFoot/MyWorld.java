import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //creación musica background loop
    GreenfootSound myMusic = new GreenfootSound("backLoop.mp3");
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Crea un mundo de 600x400 celdas con celdas ded 1x1 pixeles.
        super(600, 400, 1); 
        prepare(); //prepara el mundo
    }   
    public void act()
    {
        addSpaceObject();
        myMusic.playLoop();
    }
    public void addSpaceObject()
    {
        
        if (Greenfoot.getRandomNumber(3)<1)
        {
            
            int randomNumber = Greenfoot.getRandomNumber(1000);
            
            if (randomNumber>400)
            {
                addObject(new SpaceObject(),randomNumber,Greenfoot.getRandomNumber(400));
            }
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,55,201);
        
        
        for (int i = 0; i<25 ;i++)
        {
            int randomNumber = Greenfoot.getRandomNumber(1000);
            if (randomNumber>400)
            {
                addObject(new SpaceObject(),randomNumber,Greenfoot.getRandomNumber(400));
            }
        }
        
        
    
    }
}
