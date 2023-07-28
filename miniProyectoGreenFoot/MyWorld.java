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
    
    private static int dimensionX =  1000;    
    private static int dimensionY =  600;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(dimensionX, dimensionY, 1); 
        prepare(); //prepara el mundo   
        GreenfootImage backgroundImage = new GreenfootImage("space.jpg");
        backgroundImage.scale(getWidth(), getHeight());
        setBackground(backgroundImage);
    }   
    public void act()
    {
        addSpaceObject();
        myMusic.playLoop();
    }
    public void addSpaceObject()
    {
        
        if (Greenfoot.getRandomNumber(15)<10)
        {
            
            int randomNumber = Greenfoot.getRandomNumber(dimensionX);
            
            if (randomNumber>700)
            {
                addObject(new SpaceObject(),dimensionX,Greenfoot.getRandomNumber(dimensionY));
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
        
        addObject(rocket,55,(dimensionY/2));
        
        
        for (int i = 0; i<50 ;i++)
        {
            int randomNumber = Greenfoot.getRandomNumber(dimensionX);
            if (randomNumber>700)
            {
                addObject(new SpaceObject(),randomNumber+100,Greenfoot.getRandomNumber(dimensionY));
            }
        }
        
        
    
    }
}
