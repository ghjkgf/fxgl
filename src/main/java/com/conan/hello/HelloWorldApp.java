package com.conan.hello;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

/**
 * @author zsl
 * @date 2022/12/16
 * @apiNote
 */
public class HelloWorldApp extends GameApplication {
    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setTitle("Hello world");
        gameSettings.setVersion("0.1");
        gameSettings.setHeight(385);
        gameSettings.setWidth(500);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
