/**
 * Created by ondrejkrejcir on 06/02/17.
 */
public class Zena extends Clovek {
	public int podpatky;
	public boolean makeup;

	public void rodit() {
		System.out.println("Jsem matka!");
	}

	public void kojit() {
		System.out.println("Jsem matka a kojím!");
	}

	@Override
	public void zeptej(Clovek c) {
		System.out.println("Dobrý večer pane? Jak se jmenujete?");
		c.predstavSe();
		System.out.println("Jméno nic moc, nashledanou.");
	}
}
