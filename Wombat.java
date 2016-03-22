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
        if(foundLeaf()) {
            eatLeaf();
        }
        else if(canMove()) {
            move();
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
     * Return the number of leafs the wombat has eaten.
     */
    public int getLeavesEaten() {
        return leavesEaten;
    }
}
