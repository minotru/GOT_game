
public class SectorData {
	
	enum Landscape {
		ground, water
	};

	String name;
	int castle = 0;
	int supply = 0;
	int crown = 0;
	Landscape landscape;

	public SectorData() {
		name = new String();
	}
	
	public SectorData(SectorData sectorData) {
		castle = sectorData.castle;
		crown = sectorData.crown;
		supply = sectorData.supply;
		landscape = sectorData.landscape;
		name = sectorData.name;
	}
}