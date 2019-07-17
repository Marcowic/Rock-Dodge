import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Entity
{
    /**
     * Improvised delay/timer to add 1 to the score. 
     * 
     */
    private int pause = 100;
    public void act() 
    {
       if(pause>0)
           pause--;
       if (pause ==0)
       {
           countScore();
           pause=100;
       }
    }    
}
