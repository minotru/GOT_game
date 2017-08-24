
import java.util.ArrayList;


public class Sector {
	ArrayList<Sector> neighbors;
	SectorData data = null;
	int id;

	Sector(SectorData data, int ID, ArrayList<Sector> neighbors) {
		this.data = data;
		id = ID;
		this.neighbors = neighbors;
	}
	
	
}