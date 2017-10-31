package leo.libgdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;

import leo.libgdx.game.staticdata.LeoData;

/**
 * Created by leo on 2017/9/21.
 */

public class WorldRender {

    WorldController worldController;
    public SpriteBatch batch;

    public OrthographicCamera camera;

    public TextureRegion textureRegion;

    public Texture brush;
    public FrameBuffer frameBuffer;

    public WorldRender(WorldController worldController){
        this.worldController = worldController;
        init();


        //textureRegion = new TextureRegion(new Texture("test.png"));

    }

    public void init(){
        batch = new SpriteBatch();
        camera = new OrthographicCamera(LeoData.WORLD_WIDTH, LeoData.WORLD_HEIGHT);
        camera.position.set(0, 0, 0);

    }



    public void rendercamera(){

        worldController.updatacamera(camera);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(camera.combined);

        worldController.render(batch);
    }

    public void draw(){
        rendercamera();
    }



}
