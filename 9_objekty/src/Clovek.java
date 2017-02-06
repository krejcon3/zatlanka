/**
 * Created by ondrejkrejcir on 06/02/17.
 */
public abstract class Clovek {
	public String jmeno;
	public boolean oci;
	public boolean hlava;
	public int nohy;
	public boolean ruce;

	public void predstavSe() {
		System.out.println("Ahoj já jsem " + jmeno);
	}

	public void mluv() {
		System.out.println("Mluvím!");
	}

	public String odpovez() {
		return "Téměř s Vámi souhlasím, avšak zcela Vás nechápu...";
	}

	public void zeptej(Clovek c) {
		this.predstavSe();
		c.predstavSe();
		System.out.println("Prosím Vás nevíte kolik je hodin?");
		System.out.println(c.odpovez());
		System.out.println("Aha tak děkuji nashledanou...");
	}

	public void zpivat() {
		System.out.println("LALALALALALALALALALA");
	}

	public void pracovat() {
		System.out.println("Ach ta práce je tak těžká");
	}

	public void ucit() {
		System.out.println("Nauka? Muka...");
	}
}
