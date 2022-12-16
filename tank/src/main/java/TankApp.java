import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

/**
 * @author zsl
 * @date 2022/12/16
 * @apiNote
 */
public class TankApp extends GameApplication {

    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setWidth(700);
        gameSettings.setHeight(500);
        gameSettings.setTitle("tank");
        gameSettings.setVersion("0.1");
        gameSettings.setAppIcon("");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
