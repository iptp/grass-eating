import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A wombat that lives in the field and search for leafs.
 *
 * @author Gabriel Tibúrcio
 * @version 2016/03/20
 */
public class Wombat extends Actor
{
    private int leavesEaten;

    public Wombat() {
        leavesEaten = 0;
    }

    /**
     * Act - do whatever the Wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move();
    }

    /**
     * Move the wombat in it's current rotation
     */
    public void move() {
        move(2);
        turnRight();
    }

    /**
     * Turn left by 90 degrees.
     */
    public void turnLeft() {
        turn(-90);
    }

    /**
     * Turn right by 90 degrees.
     */
    public void turnRight() {
        turn(90);
    }

    /**
     * Return the number of leafs the wombat has eaten.
     */
    public int getLeavesEaten() {
        return leavesEaten;
    }
}
