package leo.libgdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import leo.libgdx.game.actor.BunnyHead;
import leo.libgdx.game.actor.Rock;
import leo.libgdx.game.assetsmanage.Assets;
import leo.libgdx.game.leave.Level;

import static com.badlogic.gdx.Gdx.input;

/**
 * Created by leo on 2017/9/21.
 */

public class WorldController {

    public TextureRegion img;

    public float move_x;
    public float move_y;
    public Rock rock;
    Level level;

    BunnyHead bunnyHead;

    public void init(){
        Assets.instance.init();
        init_leave();

        //img = Assets.instance.assetBunnyhead.head;
    }

    public void init_leave(){
        level = new Level();

//        rock = new Rock();
//        rock.init();

//        bunnyHead = new BunnyHead();
//        bunnyHead.init();
    }

    public void render(SpriteBatch batch){
        //bunnyHead.render(batch);
//        rock.draw(batch);
        level.render(batch);
    }




    public void debugCamera(){
        if(input.isKeyPressed(Input.Keys.UP)){
            //Gdx.app.log("showinput","UP is press");
            move_y = 5*0.02f;
        }
        if(input.isKeyPressed(Input.Keys.DOWN)){
            //Gdx.app.log("showinput","DOWN is press");
            move_y = -5*0.02f;
        }
        if(input.isKeyPressed(Input.Keys.RIGHT)){
            //Gdx.app.log("showinput","RIGHT is press");
            move_x = 5*0.02f;
        }
        if(input.isKeyPressed(Input.Keys.LEFT)){
            //Gdx.app.log("showinput","LEFT is press");
            move_x = -5*0.02f;
        }


    }

    public void updatacamera(OrthographicCamera camera){
        move_x = 0f;
        move_y = 0f;
        debugCamera();

        camera.position.x = camera.position.x + move_x;
        camera.position.y = camera.position.y + move_y;
        camera.update();

    }


//    public void applyTo(OrthographicCamera camera) {
//        camera.position.x = position.x;
//        camera.position.y = position.y;
//        camera.zoom = zoom;
//        camera.update();
//    }



}
