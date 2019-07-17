import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Entity
{
   //Initalising the images to be used in animating the player object.
   private GreenfootImage run1= new GreenfootImage("1r.png");
   private GreenfootImage run0= new GreenfootImage("0r.png");
   private GreenfootImage run2= new GreenfootImage("2r.png");
   //Instance variable to be used in the cycling of the images above
   private int frame =1;
    /**
     * Act - continuously calls the method "checkKeypress()". 
     */
   public void act() 
    {
        checkKeypress();
        
    }
    /**
     * Determines if any keys on the keyboard are being pressed.
     * this takes care of the movement of the player
     */
   public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("a")) 
        {
            move(-3);
            animate();
        }
        if (Greenfoot.isKeyDown("d")) 
        {
            move(3);
            animate();
        }
        if ("w".equals(Greenfoot.getKey()))
        {
            fire();
        }
    }
    /**
     * Spawns an Axe object where on the current coordinates of the Player.
     */
   public void fire()
   {
        Axe axe = new Axe();
        getWorld().addObject(axe, getX(), getY());
   }
   /**
    * Animating the player image.
    */
   public void animate()
    {
        if(frame == 1)
        {
            setImage(run1);
            
        }else if (frame==2)
        {
            setImage(run0);
        }else if (frame ==3)
        {
            setImage(run2);
            frame =1;
            return;
        }
        frame++;
    }
}


