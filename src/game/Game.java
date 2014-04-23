package game;

import game.state.StatePlaying;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame {
    
    public static final int STATE_PLAYING = 1;
    
    public static int VIEW_SIZE_X;
    public static int VIEW_SIZE_Y;
    
    public Game() {
        super("Rogue Story");
    }
    
    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new Game());
            setupAGC(app);
        } catch (SlickException e) {
            throw new RuntimeException("Error initializing game: " + e);
        }
    }

    @Override
    /** Used to initalize the states that are to be used in the game. */
    public void initStatesList(GameContainer container) throws SlickException {
        this.addState(new StatePlaying(STATE_PLAYING));
    }
    
    /** Sets up the window. */
    private static void setupAGC(AppGameContainer app) throws SlickException {
        VIEW_SIZE_X = 640;
        VIEW_SIZE_Y = 480;
        app.setDisplayMode(VIEW_SIZE_X,VIEW_SIZE_Y,false);
        app.setShowFPS(true);
        app.setTargetFrameRate(60);
        app.setAlwaysRender(true);
        app.setVSync(true);
        app.setForceExit(true);
        app.start();
    }
}