package leo.libgdx.game.actor;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import leo.libgdx.game.assetsmanage.Assets;

/**
 * Created by leo on 2017/9/30.
 */

public class GoldCoin extends AbstractGameObject {
    public TextureRegion region;

    public GoldCoin(){
        init();
    }

    public void init(){
        region = Assets.instance.assetGoldCoin.GoldCoin;
        position = new Vector2(0, 0);
        dimension = new Vector2(0.5f, 0.5f);
    }

    public void setPosition(float x,float y){
        position.x = x;
        position.y = y;
    }

    public void draw(SpriteBatch batch){
        batch.begin();

        TextureRegion reg = region;

        batch.draw(reg.getTexture(),position.x,position.y,0f,0f,dimension.x,dimension.y,1f,1f,0f,reg.getRegionX(),reg.getRegionY(),reg.getRegionWidth(),reg.getRegionHeight(),false,false);



        batch.end();
    }
}
