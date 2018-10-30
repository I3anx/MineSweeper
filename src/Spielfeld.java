import java.util.ArrayList;
import java.util.Random;

public class Spielfeld {
	
	private int anzFelder;
	private String space = "  ";
	private Zelle zelle = new Zelle();
	private ArrayList<Zelle> zellenArray = new ArrayList<Zelle>();
	Random random = new Random();
	
	public void setSpielfeld() {
		anzFelder = 7;
		for (int i = 0; i <= anzFelder; i++) {
			System.out.print(space + i + space);
		}
		for (int j = 0; j <= anzFelder; j++) {
			System.out.println("\n" + j);
		}
	}
	
	public void setBomben() {

	}

}


