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
    public void init(GameContainer container) {
        sprite = ImageLibrary.TEST.getImage();
        in = container.getInput();
    }
    
    @Override
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
    public void render(Graphics g) {
        g.drawImage(sprite,x,y);
    }
}
