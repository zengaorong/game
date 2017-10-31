package leo.libgdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import leo.libgdx.game.assetsmanage.Assets;

public class canyonbunny extends ApplicationAdapter {
	SpriteBatch batch;
	TextureRegion img;
	WorldRender worldRender;
	WorldController worldController;
	
	@Override
	public void create () {
		worldController = new WorldController();
		worldController.init();
		worldRender = new WorldRender(worldController);
	}

	@Override
	public void render () {
		worldRender.draw();
	}
}
