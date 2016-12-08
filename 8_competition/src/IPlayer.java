/**
 * Created by ondrejkrejcir on 02/12/16.
 */
public interface IPlayer {

	void greeting();
	void victory();
	void defeat();
	void setArea(String[][] area);
	int[] fire(); // return [x, y]
	void setLastFireResult(boolean shooted, boolean sinked);
}
