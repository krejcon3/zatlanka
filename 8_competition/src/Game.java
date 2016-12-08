import java.util.Random;

/**
 * Created by ondrejkrejcir on 02/12/16.
 */
public class Game {

	private int size;

	private String[][] homeArea;
	private String[][] hostArea;

	private IPlayer homePlayer;
	private IPlayer hostPlayer;

	public Game(IPlayer homePlayer, IPlayer hostPlayer, int size) {
		this.homePlayer = homePlayer;
		this.hostPlayer = hostPlayer;
		this.size = size;
		this.homeArea = this.initArea();
		this.hostArea = this.initArea();
	}

	private String[][] initArea() {
		String[][] area = new String[this.size][this.size];
		for (int i = 0; i < area.length; i++) {
			for (int j = 0; j < area[i].length; j++) {
				area[i][j] = " ";
			}
		}
		return area;
	}

	private String[][] addScout(String[][] area) {
		int x  = getCoord();
		int y  = getCoord();
		while (!this.checkCoord(x, y, area)) {
			x = getCoord();
			y = getCoord();
		}
		area[x][y] = "@";
		return area;
	}

	private String[][] addSubmarine(String[][] area) {
		int x  = getCoord();
		int y  = getCoord();
		while (!this.checkCoord(x, y, area) || !this.checkCoord(x - 1, y, area)) {
			x = getCoord();
			y = getCoord();
		}
		area[x][y] = "@";
		area[x - 1][y] = "@";
		return area;
	}

	private String[][] addCruiser(String[][] area) {
		int x  = getCoord();
		int y  = getCoord();
		while (!this.checkCoord(x, y, area) || !this.checkCoord(x, y + 1, area) || !this.checkCoord(x - 1, y + 1, area) || !this.checkCoord(x, y + 2, area)) {
			x = getCoord();
			y = getCoord();
		}
		area[x][y] = "@";
		area[x][y + 1] = "@";
		area[x - 1][y + 1] = "@";
		area[x][y + 2] = "@";
		return area;
	}

	private String[][] addAircraft(String[][] area) {
		int x  = getCoord();
		int y  = getCoord();
		while (!this.checkCoord(x, y, area) || !this.checkCoord(x, y + 1, area)  || !this.checkCoord(x, y + 2, area) || !this.checkCoord(x, y + 3, area) || !this.checkCoord(x - 1, y + 3, area)) {
			x = getCoord();
			y = getCoord();
		}
		area[x][y] = "@";
		area[x][y + 1] = "@";
		area[x][y + 2] = "@";
		area[x][y + 3] = "@";
		area[x - 1][y + 3] = "@";
		return area;
	}

	private String[][] addShips(String[][] area) {
		area = this.addScout(area);
		area = this.addScout(area);
		area = this.addScout(area);
		area = this.addSubmarine(area);
		area = this.addSubmarine(area);
		area = this.addCruiser(area);
		area = this.addAircraft(area);
		return area;
	}

	private boolean checkCoord(int x, int y, String[][] area) {
		if (x < 0 || x >= area.length || y < 0 || y >= area.length) {
			return false;
		}
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				if ((x + i) < 0 || (x + i) >= area.length) {
					continue;
				}
				if ((y + j) < 0 || (y + j) >= area.length) {
					continue;
				}
				if (!area[x + i][y + j].equals(" ")) {
					return false;
				}
			}
		}
		return true;
	}

	private int getCoord() {
		return Math.abs(new Random().nextInt(this.size));
	}

	private void printAreas() {
		System.out.print("  ");
		for (int j = 0; j < 2 * this.size; j++) {
			System.out.print((j % this.size) + " ");
			if (j == this.size - 1) {
				System.out.print("     ");
			}
		}
		System.out.println();
		for (int i = 0; i < this.size; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 2 * this.size; j++) {
				if (j < this.size) {
					System.out.print(this.homeArea[i][j] + " ");
				} else {
					System.out.print(this.hostArea[i][j - this.size] + " ");
				}
				if (j == this.size - 1) {
					System.out.print("   " + i + " ");
				}
			}
			System.out.println();
		}
	}

	public void run() {
		System.out.println("Vítám vás na zápase nejbrutálnější ligy v lodích!");
		System.out.println("Tentokrát se utkají zkušení hráči, kteří se vám ovšem představí sami!");
		System.out.println();
		System.out.println("Zdravíme domácího hráče!");
		this.homePlayer.greeting();
		System.out.println();
		System.out.println("Zdravíme hostujícího hráče!");
		this.hostPlayer.greeting();
		System.out.println();
		System.out.println("Dobře vidím, že jsou oba hráči připraveni pustit se do hry!");
		System.out.println("Tak tedy jdeme na to!");
		System.out.println();
		this.homeArea = this.addShips(this.homeArea);
		this.hostArea = this.addShips(this.hostArea);
		this.printAreas();
	}
}
