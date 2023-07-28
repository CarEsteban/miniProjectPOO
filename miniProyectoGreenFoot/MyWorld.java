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
    public lifes objLifes;
    Tablero puntos;
    Tablero vidas;
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
        puntos=new Tablero (0,"Puntaje:");
        vidas=new Tablero (3,"Vidas:");
        addObject(puntos,150,85);
        addObject(vidas,300,85);
    }   
    public void act()
    {
        addExtraLife();
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
    public void addExtraLife()
    {
        
        if (Greenfoot.getRandomNumber(1000)<10)
        {
            
            int randomNumber = Greenfoot.getRandomNumber(dimensionX);
            
            if (randomNumber>700)
            {
                addObject(new extraLife(),dimensionX,Greenfoot.getRandomNumber(dimensionY));
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
        //extraLife heart = new extraLife();
        
        addObject(rocket,55,(dimensionY/2));
        //addObject(heart,1200,(dimensionY/2));

        
        
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
