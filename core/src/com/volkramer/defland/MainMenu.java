package com.volkramer.defland;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainMenu implements Screen {

    final Defland game;
    OrthographicCamera camera;

    public MainMenu(final Defland game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 1280, 720);

    }

    public void pause() {

    }

    public void resume() {

    }

    public void resize(int width, int height) {

    }

    public void create() {

    }

    public void render(float delta) {
        ScreenUtils.clear(0.066f, 0.184f, 0.254f, 1);
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        game.font.draw(game.batch, "DEFLAND", camera.viewportHeight / 2, camera.viewportWidth / 2);
        game.batch.end();
    }

    public void dispose() {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

}
