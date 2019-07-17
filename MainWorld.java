import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{
    /**
     * Constructor for objects of class MainWorld.
     * Initialises the objects in the game
     */
    
    public MainWorld()
    {    
        // Create a new world with 564*752 cells with a cell size of 1x1 pixels.
        super(564, 752, 1); 
        setBackground(new GreenfootImage("background.png"));
        
        Player player=new Player();//add player
        addObject(player,270,690);
        
        addObject ( new Score(),80,30);
        rocks();
        firstRow();
        secondRow();
        thirdRow();
        fourthRow();
        fifthRow();
        sixthRow();
    }
    /**
     * Adding the Rocks to the World/
     */
    public void rocks()
    {
        addObject(new Rock(),Greenfoot.getRandomNumber(540)+5,Greenfoot.getRandomNumber(300));
        addObject(new Rock(),Greenfoot.getRandomNumber(540)+5,Greenfoot.getRandomNumber(300));
        addObject(new Rock(),Greenfoot.getRandomNumber(540)+5,Greenfoot.getRandomNumber(300));
        addObject(new Rock(),Greenfoot.getRandomNumber(540)+5,Greenfoot.getRandomNumber(300));
        addObject(new Rock(),Greenfoot.getRandomNumber(540)+5,Greenfoot.getRandomNumber(300));
        addObject(new Rock(),Greenfoot.getRandomNumber(540)+5,Greenfoot.getRandomNumber(300));
        
       
    }
    /**
     * Adding the first row of logs to the world
     */
    public void firstRow()
    {
      int x_cor1=80;
        addObject(new Small_Log(),x_cor1, 120);
        x_cor1=x_cor1+100;
        addObject(new Small_Log(),x_cor1, 120);
        x_cor1=x_cor1+100;
        addObject(new Small_Log(),x_cor1, 120);
        x_cor1=x_cor1+100;
        addObject(new Small_Log(),x_cor1, 120);
        x_cor1=x_cor1+100;
        addObject(new Small_Log(),x_cor1, 120);  
    }
    /**
     * Adding the second row of logs to the world
     */
    public void secondRow()
    {
        int x_cor2=30;
        addObject(new Big_Log(),x_cor2,190);
        x_cor2=x_cor2+100;
        addObject(new Big_Log(),x_cor2,190);
        x_cor2=x_cor2+100;
        addObject(new Big_Log(),x_cor2,190);
        x_cor2=x_cor2+100;
        addObject(new Big_Log(),x_cor2,190);
        x_cor2=x_cor2+100;
        addObject(new Big_Log(),x_cor2,190);
        x_cor2=x_cor2+100;
        addObject(new Big_Log(),x_cor2,190);
        x_cor2=x_cor2+100;
    }
    /**
     * Adding the third row of logs to the world
     */
    public void thirdRow()
    {
        int x_cor1=80;
        addObject(new Small_Log(),x_cor1, 260);
        x_cor1=x_cor1+100;
        addObject(new Small_Log(),x_cor1, 260);
        x_cor1=x_cor1+100;
        addObject(new Small_Log(),x_cor1, 260);
        x_cor1=x_cor1+100;
        addObject(new Small_Log(),x_cor1, 260);
        x_cor1=x_cor1+100;
        addObject(new Small_Log(),x_cor1, 260);  
    }
    /**
     * Adding the fourth row of logs to the world
     */
    public void fourthRow()
    {
        int x_cor2=30;
        addObject(new Big_Log(),x_cor2,330);
        x_cor2=x_cor2+100;
        addObject(new Big_Log(),x_cor2,330);
        x_cor2=x_cor2+100;
        addObject(new Big_Log(),x_cor2,330);
        x_cor2=x_cor2+100;
        addObject(new Big_Log(),x_cor2,330);
        x_cor2=x_cor2+100;
        addObject(new Big_Log(),x_cor2,330);
        x_cor2=x_cor2+100;
        addObject(new Big_Log(),x_cor2,330);
        x_cor2=x_cor2+100;
    }
    /**
     * Adding the fifth row of logs to the world
     */
    public void fifthRow()
    {
         int x_cor2=130;
        addObject(new Small_Log(),x_cor2,400);
        x_cor2=x_cor2+150;
        addObject(new Small_Log(),x_cor2,400);
        x_cor2=x_cor2+150;
        addObject(new Small_Log(),x_cor2,400);
    }
    /**
     * Adding the sixth row of logs to the world
     */
    public void sixthRow()
    {
        int x_cor1=80;
        addObject(new Big_Log(),x_cor1, 470);
        x_cor1=x_cor1+100;
        addObject(new Big_Log(),x_cor1, 470);
        x_cor1=x_cor1+100;
        addObject(new Big_Log(),x_cor1, 470);
        x_cor1=x_cor1+100;
        addObject(new Big_Log(),x_cor1, 470);
        x_cor1=x_cor1+100;
        addObject(new Big_Log(),x_cor1, 470); 
    }
}
