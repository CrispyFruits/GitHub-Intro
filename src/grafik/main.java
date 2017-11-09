package grafik;

/*
 * INSTRUKTIONER:
 * 
 * Ni ska �terskapa 4 olika vyer i JavaFX med hj�lp av koden nedan.
 * Ni beh�ver modifiera och/eller kopiera delar av koden f�r att
 * lyckas l�sa uppgifterna. 
 * De fyra metoderna makeView1(),makeView2(),makeView3() och makeView4()
 * �r till f�r att skapa de olika vyerna och omkring rad 47 kan du bara �ndra
 * siffran p� metoden till den vy du vill se.
 * 
 * Ditt uppdrag �r att redigera i de 4 olika metoderna och f� vyn att
 * bli lik de fr�n uppgiften i drive-dokumentet!
 * 
 * Dokumentet hittar du h�r: https://tinyurl.com/javafx-te16d
 * 
 * Detta �r mer en rolig och valfri uppgift f�r de som �r nyfikna.
 * Lycka till!
 */

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class main extends Application {

	// �ndra dessa variabler f�r att g�ra ditt f�nster st�rre/mindre
	public static final double WIDTH = 600;
	public static final double HEIGHT = 600;

	private ArrayList<KeyCode> keysPressed = new ArrayList<KeyCode>();
	private AnimationTimer gameLoop;
	private Group root = new Group();

	@Override
	public void start(Stage primaryStage) throws Exception {

		// �ndra siffran h�r nere till 1,2,3 eller 4 beroende p� vilken vy du vill se!
		makeView1();

		primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
		primaryStage.show();

	}

	private void makeView1() {

		/*
		 * TODO: Det �r f�r sm� rutor. Vi m�ste g�ra dem mindre p� n�got vis.
		 * 		 Eller �r det kanske bara f�r m�nga rutor??....
		 */

		int rows = 30;
		int cols = 30;

		double width = WIDTH / cols;
		double height = HEIGHT / rows;

		for (int row = 0; row < rows; row++) {

			for (int col = 0; col < cols; col++) {

				// Skapa en ny Rectangle
				Rectangle rect = new Rectangle(width, height);

				// Flytta rect i x-led s� den kommer r�tt
				rect.setTranslateX(col * width);

				// Flytta rect i y-led s� den kommer r�tt
				rect.setTranslateY(row * height);

				// F�rgl�gg med en random f�rg
				int r = (int) (Math.random() * 255);
				int g = (int) (Math.random() * 255);
				int b = (int) (Math.random() * 255);
				rect.setFill(Color.rgb(r, g, b));

				// L�gg till rect s� den syns i f�nstret
				root.getChildren().add(rect);
			}
		}

	}
	
	private void makeView2(){
		
		/*
		 * TODO: Samma som 3 fast varje Circle m�ste flyttas olika
		 * 		 i x-led och y-led f�r att hamna p� r�tt st�lle.
		 * 
		 * 		 TIPS: B�rja i mitten och g� snett upp�t.
		 */
		
		
	}

	private void makeView3() {

		/*
		 * TODO: Om alla cirklar bara kunde flyttas till mitten av f�nstret
		 * 		 skulle det ju se b�ttre ut? 
		 * 		 Sedan m�ste mellanrummet mellan ringarna minska ocks�...
		 */

		int rings = 15;

		for (int i = rings; i >= 0; i--) {

			double radius = WIDTH / rings / 2;

			Circle cir = new Circle(i * radius);

			int r = (int) (Math.random() * 255);
			int g = (int) (Math.random() * 255);
			int b = (int) (Math.random() * 255);
			cir.setFill(Color.rgb(r, g, b));

			root.getChildren().add(cir);

		}

	}

	private void makeView4() {

		/*
		 * TODO: Typ samma som makeView1 fast med Circle ist�llet f�r Rectangle,
		 * eller hur??
		 */

	}

	public static void main(String[] args) {
		launch(args);
	}

}
