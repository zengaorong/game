package leo.libgdx.game.assetsmanage;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import leo.libgdx.game.staticdata.LeoData;


/**
 * Created by leo on 2017/9/20.
 */

public class Assets {
    public static final  Assets instance = new Assets();
    private AssetManager assetManager;
    public AssetBunnyhead assetBunnyhead;

    public AssetRock assetRock;
    public AssetGoldCoin assetGoldCoin;


    public void init(){
        AssetManager assetManager = new AssetManager();

        TextureAtlas textureAtlas ;

        assetManager.load(LeoData.ASSETS_DIR,TextureAtlas.class);
        assetManager.finishLoading();

        textureAtlas = assetManager.get(LeoData.ASSETS_DIR,TextureAtlas.class);
        assetBunnyhead = new AssetBunnyhead(textureAtlas);
        assetRock = new AssetRock(textureAtlas);
        assetGoldCoin = new AssetGoldCoin(textureAtlas);
    }

    public class AssetBunnyhead{
        public AtlasRegion head;


        public AssetBunnyhead(TextureAtlas atlas){
            head = atlas.findRegion("bunny_head");

        }

    }

    public class AssetRock{
        public AtlasRegion regMiddle;
        public AtlasRegion regEdge;

        public AssetRock(TextureAtlas atlas){
            regMiddle = atlas.findRegion("rock_middle");
            regEdge = atlas.findRegion("rock_edge");


        }
    }

    public class AssetGoldCoin{
        public AtlasRegion GoldCoin;

        public AssetGoldCoin(TextureAtlas atlas){
            GoldCoin = atlas.findRegion("item_gold_coin");
        }
    }
}
