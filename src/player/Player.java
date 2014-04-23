package player;

import game.GameObject;
import game.util.resource.ImageLibrary;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;

public class Player extends GameObject {
    
    private Input in;
    
    private int x;
    private int y;
    
    private Image sprite;
    
    public Player() {
        
    }
    
    @Override
    /** Called once to initialize player. */
    public void init(GameContainer container) {
        sprite = ImageLibrary.TEST.getImage();
        in = container.getInput();
    }
    
    @Override
    /** Called every frame to update state. */
    public void update(int delta) {
        int dx = 0;
        int dy = 0;
        
        if (in.isKeyDown(Input.KEY_W))
            dy--;
        if (in.isKeyDown(Input.KEY_S))
            dy++;
        if (in.isKeyDown(Input.KEY_A))
            dx--;
        if (in.isKeyDown(Input.KEY_D))
            dx++;
        
        x += dx*delta;
        y += dy*delta;
    }
    
    @Override
    /** Called every frame to render player. */
    public void render(Graphics g) {
        g.drawImage(sprite,x,y);
    }
}
