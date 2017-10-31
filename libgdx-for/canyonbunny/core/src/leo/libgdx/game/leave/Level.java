package leo.libgdx.game.leave;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import leo.libgdx.game.actor.GoldCoin;
import leo.libgdx.game.actor.Rock;
import leo.libgdx.game.staticdata.LeoData;

/**
 * Created by leo on 2017/9/29.
 */

// 读取地图数据 初始化地图

public class Level {

    public Level(){
        init();
    }

    public Array<Rock> rocks;

    public Array<GoldCoin> goldCoins;

    public void init(){
        Pixmap pixmap = new Pixmap(Gdx.files.internal(LeoData.LEAVE_01));

        ByteBuffer byteBuffer = pixmap.getPixels();
        IntBuffer intBuffer = byteBuffer.asIntBuffer();
        int[] arr2 = new int[intBuffer.remaining()];
        //将缓冲区数据放入arr2数组中去
        intBuffer.get(arr2);
        int tempnum2 = 0;
        int time = 1;

        int heightnum = pixmap.getHeight();
        int widthnum = pixmap.getWidth();

        rocks = new Array<Rock>();
        goldCoins = new Array<GoldCoin>();



        for(int k : arr2){
            if(BLOCK_TYPE.ROCK.color==k){
                if(tempnum2 != k){
//                    System.out.println("rock" + time + " : " + "X:" + time%widthnum + " Y:" + (heightnum - time/widthnum));

                    Rock rock = new Rock();
                    rock.setPosition(time%widthnum,(heightnum - time/widthnum));
                    rocks.add(rock);
                }else {
                    rocks.get(rocks.size-1).length += 1;
                }

            }

            if(BLOCK_TYPE.ITEM_GOLD_COIN.color==k){
                GoldCoin goldCoin = new GoldCoin();
                float offsetHeight = -1.5f;
                goldCoin.setPosition(time%widthnum,(heightnum - time/widthnum) - offsetHeight);

                goldCoins.add(goldCoin);
            }



            time += 1;
            tempnum2 = k;
        }
    }

    public void render(SpriteBatch batch){

        for(Rock rock : rocks){
            rock.draw(batch);
        }

        for(GoldCoin goldCoin : goldCoins){
            goldCoin.draw(batch);
        }
    }

    public enum BLOCK_TYPE {
        GOAL(255, 0, 0), // red
        EMPTY(0, 0, 0), // black
        ROCK(0, 255, 0), // green
        PLAYER_SPAWNPOINT(255, 255, 255), // white
        ITEM_FEATHER(255, 0, 255), // purple
        ITEM_GOLD_COIN(255, 255, 0); // yellow
        public int color;

        private BLOCK_TYPE(int r, int g, int b) {
            color = r << 24 | g << 16 | b << 8 | 0xff;
        }

        public boolean sameColor(int color) {
            return this.color == color;
        }

        public int getColor() {
            return color;
        }
    }

}
