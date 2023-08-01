import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Tablero extends Actor
{
    GreenfootImage imagen;
    private static final Color transparent = new Color(0,0,0,0);
    int cont;
    String mensaje;
    private int value;
    private String prefix;
    private int Target;
    private GreenfootImage background;
    public Tablero()
    {
        this(new String());
    }
    public Tablero(String prefix)
    {
        background=getImage();
        value=0;
        Target=0;
        this.prefix=prefix;
        updateImage();
    }
    public void act()
    {
        if (value<Target){
            value++;
            updateImage();
        }
        else if (value>Target){
            value--;
            updateImage();
        }
    }
    public void add(int puntos)
    {
        Target += puntos;
    }
    public int getValue()
    {
        return Target;
    }
    public void setValue(int newValue)
    {
        Target=newValue;
        value=newValue;
        updateImage();
    }
    public void setPrefix(String prefix)
    {
        this.prefix=prefix;
        updateImage();
    }

    
    public int ObtenerValor()
    {
        return cont;
    }
    public void updateImage()
    {
        GreenfootImage image=new GreenfootImage(background);
        GreenfootImage text=new GreenfootImage(prefix + value,22,Color.WHITE, transparent);
        if (text.getWidth()>image.getWidth()-20)
        {
            image.scale(text.getWidth()+20,image.getHeight());
        }
        image.drawImage(text,(image.getWidth()-text.getWidth())/2,
                            (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
