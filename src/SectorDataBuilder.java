
public class SectorDataBuilder {
	private SectorData sectorData;

	public SectorData create() {
		return new SectorData(sectorData);
	}

	SectorDataBuilder(){
		sectorData = new SectorData();
	}
	
	public SectorDataBuilder setName(String name) {
		sectorData.name = name;
		return this;
	}

	public SectorDataBuilder setCastle(int castle) {
		sectorData.castle = castle;
		return this;
	}

	public SectorDataBuilder setCrown(int crown) {
		sectorData.crown = crown;
		return this;
	}

	public SectorDataBuilder setSupply(int supply) {
		sectorData.supply = supply;
		return this;
	}

	public SectorDataBuilder setLandscape(SectorData.Landscape land) {
		sectorData.landscape = land;
		return this;
	}

}
