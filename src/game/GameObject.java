package game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Represents an entity in game.
 */
public abstract class GameObject {
    
    /**
     * Called once to initialize the object.
     * 
     * @param container The game container, used in Player class to get input.
     */
    public abstract void init(GameContainer container);
    
    /**
     * Called every frame to update the object.
     * 
     * @param delta The time since the last frame in milliseconds.
     */
    public abstract void update(int delta);
    
    /**
     * Called every frame after update to render the object.
     * 
     * @param g The Graphics object to use to render the object.
     */
    public abstract void render(Graphics g);
}
