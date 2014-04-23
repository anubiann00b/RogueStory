package game.state;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import player.Player;

public class StatePlaying extends BasicGameState {
    
    private final int id;
    private Player player;
    
    /**
     * Construct a new instance of this game state with a given id.
     * 
     * @param id The unique id of this state.
     */
    public StatePlaying(int id) {
        this.id = id;
    }
    
    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        player = new Player();
        player.init(container);
    }
    
    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        player.update(delta);
    }
    
    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        player.render(g);
    }
    
    /**
    * Get the ID of this state.
    * 
    * @return The game unique ID of this state.
    */
    @Override
    public int getID() {
        return id;
    }
}