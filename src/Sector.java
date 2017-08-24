
import java.util.ArrayList;


public class Sector {
	ArrayList<Integer> neighbors;
	SectorData data = null;
	int id;

	Sector(SectorData data, int ID, ArrayList<Integer> neighbors) {
		this.data = data;
		id = ID;
		this.neighbors = neighbors;
	}
}