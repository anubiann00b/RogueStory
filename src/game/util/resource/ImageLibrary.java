package game.util.resource;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public enum ImageLibrary {
    
    // Backgrounds.
    TEST("test.png");
    
    private String filepath;
    private Image image;
    
    ImageLibrary(String filepath) {
        this.filepath = filepath;
    }
    
    public Image getImage() {
        if (image == null) {
            try {
                image = ResourceLoader.initializeImage(filepath);
            } catch (SlickException e) {
                throw new RuntimeException("Error loading resources! " + e);
            }
        }
        return image.copy();
    }
}
