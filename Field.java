import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Field where wombats live and search for leafs.
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
    }
}
