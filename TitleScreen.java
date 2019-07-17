import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen for the game. This shows the instructions how to play the game.
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 564*752 cells with a cell size of 1x1 pixels.
        super(564,752, 1); 
        
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new MainWorld());
        }
    }
    
}
