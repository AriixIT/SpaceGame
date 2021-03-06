package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	EntityManager entityManager;

	@Override
	public void create () {
		batch = new SpriteBatch();
		entityManager = new EntityManager(10);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		entityManager.render(batch);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}

}
