package leo.libgdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import leo.libgdx.game.Test;
import leo.libgdx.game.canyonbunny;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
//		config.width = 100;
//		config.height = 100;
		new LwjglApplication(new canyonbunny(), config);
	}
}
