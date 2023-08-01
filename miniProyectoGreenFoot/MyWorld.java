import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
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
    static Tablero puntos=new Tablero("Puntaje");
    static Tablero vidas=new Tablero ("Vidas");
    private static int dimensionX =  1000;    
    private static int dimensionY =  600;
    private boolean isGameOver = false;

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
        if(!isGameOver){
            addExtraLife();
            addSpaceObject();
            myMusic.playLoop();
        }
    }
    
    public void gameOver()
    {
        isGameOver = true; 
        myMusic.stop(); 
    }
    
    public void addSpaceObject()
    {
        
        if (Greenfoot.getRandomNumber(15)<10)
        {
            
            int randomNumber = Greenfoot.getRandomNumber(dimensionX);
            
            if (randomNumber<200)
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

        //addObject(new extraLife(),1000,(dimensionY/2));
        
        addObject(puntos,80,45);
        puntos.setValue(0);
        addObject(vidas,200,45);
        vidas.setValue(3);
    
        
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
