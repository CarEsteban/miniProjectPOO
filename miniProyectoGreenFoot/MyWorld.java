import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }   
    public void act()
    {
        addSpaceObject();
    }
    public void addSpaceObject()
    {
        if (Greenfoot.getRandomNumber(60)<1)
        {
           addObject (new SpaceObject(), Greenfoot.getRandomNumber(600),200); 
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
        SpaceObject spaceObject = new SpaceObject();
        addObject(spaceObject,497,64);
        SpaceObject spaceObject2 = new SpaceObject();
        addObject(spaceObject2,532,160);
        SpaceObject spaceObject3 = new SpaceObject();
        addObject(spaceObject3,548,308);
        SpaceObject spaceObject4 = new SpaceObject();
        addObject(spaceObject4,468,338);
        SpaceObject spaceObject5 = new SpaceObject();
        addObject(spaceObject5,428,195);
        SpaceObject spaceObject6 = new SpaceObject();
        addObject(spaceObject6,425,75);
        SpaceObject spaceObject7 = new SpaceObject();
        addObject(spaceObject7,532,246);
        SpaceObject spaceObject8 = new SpaceObject();
        addObject(spaceObject8,403,264);
        SpaceObject spaceObject9 = new SpaceObject();
        addObject(spaceObject9,390,140);
        removeObject(spaceObject8);
        removeObject(spaceObject4);
        removeObject(spaceObject3);
        removeObject(spaceObject7);
        removeObject(spaceObject5);
        removeObject(spaceObject9);
        removeObject(spaceObject2);
        spaceObject.setLocation(492,65);
        spaceObject.setLocation(488,106);
        removeObject(spaceObject);
        spaceObject6.setLocation(408,68);
        removeObject(spaceObject6);
        SpaceObject spaceObject10 = new SpaceObject();
        addObject(spaceObject10,520,56);
        SpaceObject spaceObject11 = new SpaceObject();
        addObject(spaceObject11,535,103);
        SpaceObject spaceObject12 = new SpaceObject();
        addObject(spaceObject12,534,171);
        SpaceObject spaceObject13 = new SpaceObject();
        addObject(spaceObject13,543,201);
        SpaceObject spaceObject14 = new SpaceObject();
        addObject(spaceObject14,557,68);
        SpaceObject spaceObject15 = new SpaceObject();
        addObject(spaceObject15,575,32);
        SpaceObject spaceObject16 = new SpaceObject();
        addObject(spaceObject16,585,125);
        SpaceObject spaceObject17 = new SpaceObject();
        addObject(spaceObject17,587,125);
        SpaceObject spaceObject18 = new SpaceObject();
        addObject(spaceObject18,478,72);
        SpaceObject spaceObject19 = new SpaceObject();
        addObject(spaceObject19,523,43);
        SpaceObject spaceObject20 = new SpaceObject();
        addObject(spaceObject20,392,118);
        SpaceObject spaceObject21 = new SpaceObject();
        addObject(spaceObject21,472,21);
        SpaceObject spaceObject22 = new SpaceObject();
        addObject(spaceObject22,452,50);
        SpaceObject spaceObject23 = new SpaceObject();
        addObject(spaceObject23,404,104);
        SpaceObject spaceObject24 = new SpaceObject();
        addObject(spaceObject24,492,111);
        SpaceObject spaceObject25 = new SpaceObject();
        addObject(spaceObject25,464,132);
        SpaceObject spaceObject26 = new SpaceObject();
        addObject(spaceObject26,415,68);
        SpaceObject spaceObject27 = new SpaceObject();
        addObject(spaceObject27,396,51);
        SpaceObject spaceObject28 = new SpaceObject();
        addObject(spaceObject28,394,72);
        SpaceObject spaceObject29 = new SpaceObject();
        addObject(spaceObject29,508,223);
        SpaceObject spaceObject30 = new SpaceObject();
        addObject(spaceObject30,529,317);
        SpaceObject spaceObject31 = new SpaceObject();
        addObject(spaceObject31,473,237);
        SpaceObject spaceObject32 = new SpaceObject();
        addObject(spaceObject32,479,164);
        SpaceObject spaceObject33 = new SpaceObject();
        addObject(spaceObject33,483,255);
        SpaceObject spaceObject34 = new SpaceObject();
        addObject(spaceObject34,424,229);
        SpaceObject spaceObject35 = new SpaceObject();
        addObject(spaceObject35,463,146);
        SpaceObject spaceObject36 = new SpaceObject();
        addObject(spaceObject36,458,268);
        SpaceObject spaceObject37 = new SpaceObject();
        addObject(spaceObject37,544,345);
        SpaceObject spaceObject38 = new SpaceObject();
        addObject(spaceObject38,537,314);
        SpaceObject spaceObject39 = new SpaceObject();
        addObject(spaceObject39,443,339);
        SpaceObject spaceObject40 = new SpaceObject();
        addObject(spaceObject40,372,337);
        SpaceObject spaceObject41 = new SpaceObject();
        addObject(spaceObject41,396,197);
        SpaceObject spaceObject42 = new SpaceObject();
        addObject(spaceObject42,397,198);
        SpaceObject spaceObject43 = new SpaceObject();
        addObject(spaceObject43,485,364);
        SpaceObject spaceObject44 = new SpaceObject();
        addObject(spaceObject44,414,334);
        SpaceObject spaceObject45 = new SpaceObject();
        addObject(spaceObject45,405,180);
        SpaceObject spaceObject46 = new SpaceObject();
        addObject(spaceObject46,463,301);
        SpaceObject spaceObject47 = new SpaceObject();
        addObject(spaceObject47,490,358);
        SpaceObject spaceObject48 = new SpaceObject();
        addObject(spaceObject48,557,259);
        SpaceObject spaceObject49 = new SpaceObject();
        addObject(spaceObject49,571,258);
        SpaceObject spaceObject50 = new SpaceObject();
        addObject(spaceObject50,570,357);
        SpaceObject spaceObject51 = new SpaceObject();
        addObject(spaceObject51,582,212);
        SpaceObject spaceObject52 = new SpaceObject();
        addObject(spaceObject52,560,247);
        SpaceObject spaceObject53 = new SpaceObject();
        addObject(spaceObject53,411,318);
        SpaceObject spaceObject54 = new SpaceObject();
        addObject(spaceObject54,591,176);
        SpaceObject spaceObject55 = new SpaceObject();
        addObject(spaceObject55,586,260);
        SpaceObject spaceObject56 = new SpaceObject();
        addObject(spaceObject56,464,187);
    }
}
