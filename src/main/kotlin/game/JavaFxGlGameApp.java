package game;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.settings.GameSettings;

public class JavaFxGlGameApp extends GameApplication {

    public static void main(String[] args) {
        launch(JavaFxGlGameApp.class);
    }

    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setWidth(720);
        gameSettings.setHeight(640);
        gameSettings.setTitle("Kotlin Game - Target Practice");
    }
}
