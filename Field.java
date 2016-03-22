import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Field where wombats live and search for leafs.
 * 
 * @author Gabriel Tibúrcio
 * @version 2016/03/20
 */
public class Field extends World
{

    /**
     * Constructs a world with 10x10 cells with a cell 
     * size of 60x60 pixels and set it's background.
     */
    public Field() {    
        super(10, 10, 60);
        setBackground("cell.jpg");
        setPaintOrder(Wombat.class, Leaf.class);
    }
    
    /**
     * Populate the world with a fixed scenario of wombats and leaves.
     */
    public void populate() {
        addObject(new Wombat(), 7, 1);
        addObject(new Wombat(), 6, 6);
        addObject(new Wombat(), 1, 7);
        randomLeaves(15);
    }
    
    /**
     * Place a number of leaves into the world at random places.
     * The number of leaves can be specified.
     */
    public void randomLeaves(int howMany) {
        for (int i = 0; i < howMany; i++) {
            Leaf leaf = new Leaf();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(leaf, x, y);
        }
    }
}
