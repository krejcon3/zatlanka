/**
 * Created by ondrejkrejcir on 02/12/16.
 */
public class Competition {

	public static void main(String[] args) {
		Game game = new Game(new DefaultPlayer(), new DefaultPlayer(), 10);
		game.run();
	}
}
