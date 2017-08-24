
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String args[]) {
		Map.sectors = new ArrayList<Sector>();
		int i=0;
		Map.sectors.add(new Sector((new SectorDataBuilder()).
				setName("Castle Black").setCastle(0).setCrown(1).setSupply(0).setLandscape(SectorData.Landscape.ground).create(),
				i++, new ArrayList<Sector>()));
		Map.sectors.add(new Sector((new SectorDataBuilder()).
				setName("Bay of Ice").setCastle(0).setCrown(0).setSupply(0).setLandscape(SectorData.Landscape.water).create(),
				i++, new ArrayList<Sector>()));
		Map.sectors.add(new Sector((new SectorDataBuilder()).
				setName("Karhold").setCastle(1).setCrown(0).setSupply(0).setLandscape(SectorData.Landscape.ground).create(),
				i++, new ArrayList<Sector>()));
		Map.sectors.add(new Sector((new SectorDataBuilder()).
				setName("The Shivering Sea").setCastle(0).setCrown(0).setSupply(0).setLandscape(SectorData.Landscape.water).create(),
				i++, new ArrayList<Sector>()));
		Map.sectors.add(new Sector((new SectorDataBuilder()).
				setName("Winterfell").setCastle(2).setCrown(1).setSupply(1).setLandscape(SectorData.Landscape.ground).create(),
				i++, new ArrayList<Sector>()));
		
//		GsonBuilder builder = new GsonBuilder();
//		Gson gson = builder.create();
//		//System.out.println(gson.toJson(sd));
////		System.out.println(Landscape.ground);
//		try (FileWriter file = new FileWriter("sector.json"))
//		{
//			file.write(gson.toJson(sd));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		SectorData sk = new SectorData();
//		try(JsonReader reader = new JsonReader(new FileReader("sector.json"))){
//			sk = gson.fromJson(reader, SectorData.class);
//		}catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(sk.name+" "+sk.castle+" "+sk.crown+" "+sk.supply+" "+sk.landscape);
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		//System.out.println(gson.toJson(sd));
//		System.out.println(Landscape.ground);
		try (FileWriter file = new FileWriter("sector.json"))
		{
			file.write(gson.toJson(Map.sectors));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
