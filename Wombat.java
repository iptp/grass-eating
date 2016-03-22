import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A wombat that lives in the field and search for leafs.
 *
 * @author Gabriel Tibúrcio
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
        checkKeyboard();
        if(foundLeaf()) {
            eatLeaf();
        }
        else if(canMove()) {
            move();
        }
    }

    /**
     * Move the wombat in it's current rotation
     */
    public void move() {
        move(1);
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
     * Return whether the wombat can move forward or not.
     */
    public boolean canMove() {
        if(!isAtEdge()) {
            return true;
        }
        else {
            int rotation = getRotation();
            int width = getWorld().getWidth() - 1;
            int height = getWorld().getHeight() - 1;
            int x = getX();
            int y = getY();
            if(rotation == 0 && x == width) {
                return false;
            } else if(rotation == 90 && y == height) {
                return false;
            } else if(rotation == 180 && x == 0) {
                return false;
            } else if(rotation == 270 && y == 0) {
                return false;
            }
            return true;
        }
    }

    /**
     * Check whether there is a leaf in the same cell as we are.
     * Return true if there is, false otherwise.
     */
    public boolean foundLeaf() {
        Actor leaf = getOneObjectAtOffset(0, 0, Leaf.class);
        if(leaf != null) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Eat a leaf (if there is one in our cell).
     */
    public void eatLeaf()
    {
        Actor leaf = getOneObjectAtOffset(0, 0, Leaf.class);
        if (leaf != null) {
            // eat the leaf...
            getWorld().removeObject(leaf);
            leavesEaten = leavesEaten + 1;
        }
    }

    /**
     * Check keyboard for input of arrow keys
     */
    private void checkKeyboard() {
        if(Greenfoot.isKeyDown("left")) {
            turnLeft();
        }
        if(Greenfoot.isKeyDown("right")) {
            turnRight();
        }
    }

    /**
     * Return the number of leafs the wombat has eaten.
     */
    public int getLeavesEaten() {
        return leavesEaten;
    }
}
