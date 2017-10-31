package leo.libgdx.game.actor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import leo.libgdx.game.assetsmanage.Assets;

/**
 * Created by leo on 2017/9/29.
 */

public class Rock extends AbstractGameObject{
    public TextureRegion regMiddle;
    public TextureRegion regEdge;
    public Texture reg;

    public int length;


    public Rock(){
        init();
    }


    public void init(){


        dimension = new Vector2(1f, 1.5f);
        position = new Vector2(0f, 0f);
        length = 1;
        regEdge = Assets.instance.assetRock.regEdge;
        regMiddle = Assets.instance.assetRock.regMiddle;



    }

    public void setPosition(float x, float y){
        position.x = x;
        position.y = y;
    }

    public void changelength(){
        length += 1;
    }

    public void draw(SpriteBatch batch){
        float relx = 0f;
        float rely = 0f;
        TextureRegion reg = null;



        batch.begin();
        // draw begin
        reg = regEdge;
        batch.draw(reg.getTexture(),position.x,position.y,0f,0f, dimension.x / 4, dimension.y,1,1.5f,0f,reg.getRegionX(),reg.getRegionY(),reg.getRegionWidth(),reg.getRegionHeight(),false,false);

        relx  = relx + dimension.x /4f;
//        //draw minddle
        reg = regMiddle;

        for(int i=0;i<length;i++){
            batch.draw(reg.getTexture(), position.x + relx, position.y,0f,0f, dimension.x, dimension.y,1,1.5f,0f,reg.getRegionX(),reg.getRegionY(),reg.getRegionWidth(),reg.getRegionHeight(),false,false);

            relx = dimension.x + relx;
        }




        reg = regEdge;
        batch.draw(reg.getTexture(),position.x + relx, position.y,0f + dimension.x / 8,0f, dimension.x / 4, dimension.y,1,1.5f,0f,reg.getRegionX(),reg.getRegionY(),reg.getRegionWidth(),reg.getRegionHeight(),true,false);

//        reg = regEdge;
//        batch.draw(reg.getTexture(), position.x + relX, position.y + relY,
//                origin.x + dimension.x / 8, origin.y, dimension.x / 4,
//                dimension.y, scale.x, scale.y, rotation, reg.getRegionX(),
//                reg.getRegionY(), reg.getRegionWidth(), reg.getRegionHeight(),
//                true, false);



        //draw end

        batch.end();

    }



}
