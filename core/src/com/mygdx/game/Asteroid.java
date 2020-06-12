package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Asteroid extends Rectangle {

    Texture img;
    Sprite sprite;

    int y = -300 + (int)(Math.random() * ((800 + 300) + 1));
    int x = 2800 + (int)(Math.random() * ((4000 - 2800) + 1));

    public Asteroid() {
        img = new Texture("asteroid.png");
        sprite = new Sprite(img);
        sprite.setY(y);
        sprite.setX(x);
    }

    public void render(SpriteBatch batch) {
        sprite.translateX(1 + (int)(Math.random() * (((-30) - (-10)) - 10)));
        if (sprite.getX() <= -500) {
            sprite.setX(x);
            sprite.setY(y);
        }
        sprite.setScale(0.5f);
        sprite.draw(batch);
    }

    public void dispose () {
        img.dispose();
    }

    public Sprite getSprite() {
        return sprite;
    }
}
