package leo.libgdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Disposable;

import java.awt.Dimension;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import javax.print.attribute.standard.MediaSize;

import leo.libgdx.game.assetsmanage.Assets;
import leo.libgdx.game.staticdata.LeoData;

/**
 * Created by leo on 2017/9/26.
 */

public class Test extends ApplicationAdapter {
    Pixmap pixmap;
    Texture texture;
    SpriteBatch batch;
    TextureRegion region;

    public Vector2 dimension;

    // draw 测试


    @Override
    public void create() {
        Assets.instance.init();
        region = Assets.instance.assetRock.regEdge;
        batch = new SpriteBatch();
        dimension = new Vector2(1, 1);


        dimension.x = 1f;
        dimension.y = 1.5f;


    }

    @Override
    public void render() {
        TextureRegion reg = null;
        reg = region;
        batch.begin();
        batch.draw(reg.getTexture(),-0f,-0f,0f,0f, dimension.x / 4, dimension.y,1,1.5f,0f,reg.getRegionX(),reg.getRegionY(),reg.getRegionWidth(),reg.getRegionHeight(),false,false);
//        batch.draw(reg,0,0);

        batch.end();
    }
}
