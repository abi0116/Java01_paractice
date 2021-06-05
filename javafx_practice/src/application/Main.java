package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// FXMLのレイアウトをロード
            Parent root = FXMLLoader.load(
                    getClass().getResource(getClass().getSimpleName() + ".fxml"));

            // タイトルセット
            primaryStage.setTitle("JavaFXSample");

            // シーン生成
            Scene scene = new Scene(root);

			//BorderPane root = new BorderPane(); 変数rootは上記で作っている(読み込んでいるので新しくインスタンスを作る必要はない)
			//Scene scene = new Scene(root,400,400);　400,400はFXMLで設定しているので必要ない
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) { //わかりにくいけど、ここにmainクラスが置いてある。
		launch(args);
	}
}
