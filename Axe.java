import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Axe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Axe extends Entity
{
   /**
     * Methods: travel(), hit_log() and animate_axe() are all continuously called.
     * 
     */
    public void act() 
    {
        travel();
        
        hit_log();
        
        animate_axe();
    } 
   /**
    * This method give the axe movement.
    * Move towards the top of the screen.
    */
   public void travel()
   {
       setLocation(getX(), getY()-7);
   }
   /**
    * This method uses conditions to determine whether the Axe object is touching : Small_Log.class, Big_Log.class or the edge of the screen.
    * If the conditions return true, the axe itself gets removed from the world as well as the other object it touches(not including the edge of the world.
    */
   public void  hit_log()
   {
        if(isTouching(Small_Log.class)) 
        {
            
            removeTouching( Small_Log.class );
            getWorld().removeObject(this);
            
        }
        else if(isTouching(Big_Log.class))
        {
           
            removeTouching(Big_Log.class);
            getWorld().removeObject(this);
            
        }
        else if(isTouching(Rock.class))
        {
            getWorld().removeObject(this);
            
        }
        else 
        {
            if( isAtEdge() ) 
            {
            getWorld().removeObject(this);
            }
        }
        
   }
   /**
    * Using the turn method to animate the axe spinning.
    */
   public void animate_axe()
   {
       if ( Greenfoot.getRandomNumber(100) < 30 ) 
        {
            turn( Greenfoot.getRandomNumber(90) );
        }
    }
}   