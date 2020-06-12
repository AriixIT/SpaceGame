package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.Font;
import java.util.ArrayList;

public class EntityManager {

    private final ArrayList<Asteroid> asteroids = new ArrayList<>();
    private SpaceShip spaceShip;
    private BitmapFont font;

    public EntityManager(int asteroidAmount) {
        font = new BitmapFont();
        spaceShip = new SpaceShip();
        for (int i = 0; i < asteroidAmount; i++) {
            addAsteroid(new Asteroid());
        }
    }

    public void render (SpriteBatch batch) {
        checkCollusion(batch);
        for (Asteroid asteroid : asteroids) {
            asteroid.render(batch);
        }
        spaceShip.render(batch);
    }

    public void checkCollusion(SpriteBatch batch) {
        float x = spaceShip.getSprite().getX();
        float y = spaceShip.getSprite().getY();

        for (Asteroid asteroid : asteroids) {
            if(Math.abs(x - asteroid.getSprite().getX()) < 100 && Math.abs(y - asteroid.getSprite().getY()) < 100) {
                Texture explosion = new Texture("explosion.png");
                //todo
            }
        }
    }

    public void addAsteroid(Asteroid asteroid) {
        asteroids.add(asteroid);
    }
}
