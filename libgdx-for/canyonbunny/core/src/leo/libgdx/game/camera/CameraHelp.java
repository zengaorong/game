package leo.libgdx.game.camera;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.glutils.VertexData;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by leo on 2017/9/21.
 */

public class CameraHelp{

    public Vector2 vector2;

    public CameraHelp(){

    }

    public void updata(float position_x,float position_y){
        vector2.set(position_x, position_y);
    }

}
