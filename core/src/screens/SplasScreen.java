package screens;

import com.badlogic.gdx.graphics.Texture;
import com.chorsstudio.galganek.GalganekGame;

public class SplasScreen extends AbstractScreen {

    private Texture splashImage;
    public SplasScreen(GalganekGame game) {
        super(game);
        init();
    }

    private void init() {
        splashImage = new Texture("splashLogo.png");
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        spriteBatch.begin();
        spriteBatch.draw(splashImage, game.WIDTH/2 - splashImage.getWidth()/2, game.HEIGHT/2 - splashImage.getHeight()/2 + 200) ;
        spriteBatch.end();

    }
}
