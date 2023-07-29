import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends World
{
    private static int dimensionX =  1000;    
    private static int dimensionY =  600;
    /**
     * Constructor for objects of class Inicio.
     * 
     */
    public Inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(dimensionX, dimensionY, 1); 
        prepare();
    }
    public void prepare()
    {
        NewGame game= new NewGame();
        addObject(game,500,500);
    }
}
