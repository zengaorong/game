package leo.libgdx.game.actor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import leo.libgdx.game.assetsmanage.Assets;

/**
 * Created by leo on 2017/9/29.
 */

public class BunnyHead extends AbstractGameObject {
    TextureRegion head;

    public BunnyHead(){
        init();
    }

    public void init(){
        head = Assets.instance.assetBunnyhead.head;
    }

    public void render(SpriteBatch batch){
        batch.begin();
        batch.draw(head,0,0);
        batch.end();
    }
}
