/**
 * Created by ondrejkrejcir on 06/02/17.
 */
public class Main {
	public static void main(String[] args) {
		Muz muz = new Muz();
		muz.jmeno = "Spytihněv";
		Zena zena = new Zena();
		zena.jmeno = "Gertruda";
		muz.zeptej(zena);
		System.out.println("=================");
		zena.zeptej(muz);
	}
}
