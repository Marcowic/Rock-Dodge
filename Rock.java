import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Entity
{
    /** 
     * the spawn() method is continuously called.
     * The rocks are continuously checked if it is touching the player.
     */
   public void act() 
   {
       spawn();
       if (isTouching(Player.class))
       {
           Greenfoot.setWorld(new GameOver());
           
           Greenfoot.stop();
       }
   }
   /**
    * When the rock hits the bottom of the world,s they re-spawn in a random location at the top of the world.
    * This method also animates the rock to make it look like it is spinning.
    */
   public void spawn()
   {
       if ( Greenfoot.getRandomNumber(100) < 30 ) 
        {
            turn( Greenfoot.getRandomNumber(90) );
        }
       if (getY() > getWorld().getHeight()-5) {
            int xLoc = Greenfoot.getRandomNumber(getWorld().getWidth()) + 5;            
            setLocation( xLoc, 0 );
  
        }
        else
            setLocation( getX(), getY()+3 );  
    }
}
