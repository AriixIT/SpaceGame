package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

import java.security.Key;

public class SpaceShip extends Rectangle {

    Texture img;
    Sprite sprite;

    public SpaceShip() {
        img = new Texture("spaceship.png");
        sprite = new Sprite(img);
        sprite.setScale(0.25f);
        sprite.rotate90(true);
    }

    public void render(SpriteBatch batch){
        if(Gdx.input.isKeyPressed(Input.Keys.UP)) {
                sprite.translateY(5f);
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            sprite.translateY(-5f);
        }
        sprite.draw(batch);
    }

    public void dispose () {
        img.dispose();
    }

    public Sprite getSprite() {
        return sprite;
    }
}