import java.util.Random;

/**
 * Created by ondrejkrejcir on 02/12/16.
 */
public class DefaultPlayer implements IPlayer {

	private String[][] area;
	private int[] lastFire;

	@Override
	public void greeting() {
		System.out.println("Nazdar! Jsem DefaultPlayer a roznesu tě na hlavicích mých torpéd!");
	}

	@Override
	public void victory() {
		System.out.println("Děkuji svému programátorovi za to, že mě udělal naprosto dokonalého!");
	}

	@Override
	public void defeat() {
		System.out.println("No to snad nemůže být pravda! Já prohrál? To je potupa...");
	}

	@Override
	public void setArea(String[][] area) {
		this.area = area;
	}

	@Override
	public int[] fire() {
		Random random = new Random();
		this.lastFire = new int[2];
		this.lastFire[0] = random.nextInt() % this.area.length;
		this.lastFire[1] = random.nextInt() % this.area.length;
		return this.lastFire;
	}

	@Override
	public void setLastFireResult(boolean hit, boolean sunken) {
		if (hit) {
			if (sunken) {
				System.out.println("Právě jsem potopil loď!");
			} else {
				System.out.println("Právě jsem trefil loď!");
			}
		} else {
			System.out.println("Vůbec nic jsem netrefil!");
		}
	}
}
