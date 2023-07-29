import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private static int dimensionX =  1000;    
    private static int dimensionY =  600;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(dimensionX, dimensionY, 1); 
        prepare();
    }
    public void prepare()
    {
        Quit Quit= new Quit();
        addObject(Quit,700,500);
        NewGame game= new NewGame();
        addObject(game,300,500);
        showText("Tu puntaje fue: "+MyWorld.puntos.getValue()+" puntos",500,550);
    }

}
