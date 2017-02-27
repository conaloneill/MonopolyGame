package propertyImages;
/*
 *---Tophat---
 * Brian O'Leary - 134775468
 * Conal O'Neill - 13315756
 * Daniel Graham - 15319536
 * 
 * This Class is used to handle all images drawn onto our monopoly board (RenderPanel).
 * It retrieves images from propertyImages.drawable and assigns them to their correct Tile 
 * in the ArrayList 'Tiles' making references to our instance of our main class 'GameScreen'
 * called 'screen'. These images are drawn in the RenderPanel class.
 * 
 * As this class is cycling through every tile and assigning info to those tiles, we 
 * have added the rent, type, price and name of each tile inside the same loop.
 * This was done to improve readability(everything is assigned together) and 
 * code performance(only 1 loop through all tiles to assign information). 
 * 
 * */
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;



import monopoly.GameScreen;
import monopoly.Tile;


public class PropertyImages {


	//Property Info card variables
	private Image bondStreet = null;
	private Image bowStreet;
	private Image coventryStreet;
	private Image electricCo;
	private Image eustonRoad;
	private Image fleetStreet;
	private Image fenchurchStStation;
	private Image kingsCross;
	private Image leicesterSq;
	private Image liverpoolStStation;
	private Image marlboroughSt;
	private Image maryboyleStation;
	private Image mayfair;
	private Image oldKentRoad;
	private Image northumberlandAv;
	private Image pallMall;
	private Image oxfordStreet;
	private Image parkLane;
	private Image pentonvilleRd;
	private Image piccadilly;
	private Image strand;
	private Image regentStreet;
	private Image trafalgarSq;
	private Image angelIslington;
	private Image vineStreet;
	private Image whitechapelRd;
	private Image waterWorks;
	private Image whitehall;

	//Tile Image variables
	private Image bondStreetTile = null;
	private Image bowStreetTile;
	private Image coventryStreetTile;
	private Image electricCoTile;
	private Image eustonRoadTile;
	private Image fenchurchStStationTile;
	private Image fleetStreetTile;
	private Image kingsCrossTile;
	private Image leicesterSqTile;
	private Image liverpoolStStationTile;
	private Image marlboroughStTile;
	private Image maryleboneStationTile;
	private Image mayfairTile;
	private Image northumberlandAvTile;
	private Image oldKentRoadTile;
	private Image oxfordStreetTile;
	private Image pallMallTile;
	private Image parkLaneTile;
	private Image pentonvilleRdTile;
	private Image piccadillyTile;
	private Image regentStreetTile;
	private Image strandTile;
	private Image angelIslingtonTile;
	private Image trafalgarSqTile;
	private Image vineStreetTile;
	private Image waterWorksTile;
	private Image whitechapelRdTile;
	private Image whitehallTile;

	// Non-property Image variables
	public Image monopolyLogo;
	private Image go;
	private Image freepark;
	private Image gotojail;
	private Image injail;
	private Image chance;
	private Image comchest;
	private Image incometax;
	private Image luxurytax;
	private Image comchestleft;
	private Image comchestright;
	private Image chancetop;
	private Image chanceright;
	
	
	//Property Types
	public static final int TYPE_GO = 0;
	public static final int TYPE_PROPERTY = 1; 
	public static final int TYPE_STATION = 2; 
	public static final int TYPE_UTILITY = 3; 
	public static final int TYPE_COMMUNITY = 4; 
	public static final int TYPE_CHANCE = 5; 
	public static final int TYPE_JAIL = 6; 
	public static final int TYPE_PARKING = 7; 
	public static final int TYPE_GOTO_JAIL = 8; 
	public static final int TYPE_TAX = 9;

	
	//Property rent constants
	private static final int[][] SITE_RENTS = { {2,10,30,90,160,250},
			{4,20,60,180,320,450},{25,50,100,200,200,200},{6,30,90,270,400,550},{6,30,90,270,400,550},
			{8,40,100,300,450,600},{10,50,150,450,625,750},{4,10,0,0,0,0},{10,50,150,450,625,750},
			{12,60,180,500,700,900},{25,50,100,200,200,200},{14,70,200,550,750,950},
			{14,70,200,550,750,950},{16,80,220,600,800,1000},{18,90,250,700,875,1050},
			{18,90,250,700,875,1050},{20,100,300,750,925,1100},{25,50,100,200,200,200},
			{22,110,330,800,975,1150},{22,110,330,800,975,1150},{4,10,0,0,0,0},
			{22,120,360,850,1025,1200},{26,130,390,900,1100,1275},
			{26,130,390,900,1100,1275},{28,150,450,1000,1200,1400},{25,50,100,200,200,200},
			{35,175,500,1100,1300,1500}, {50,200,600,1400,1700,2000}};
	
	
	//Function to retrieve images from their path in the drawable folder
	public Image getImage(String path){ 
		Image temp = null;
		try {
			URL imageURL = PropertyImages.class.getResource(path);
			temp = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return temp;
	}
	
	

	public void assignTileImages() {
		//Allow reference to our game screen
		GameScreen screen = GameScreen.screen;

		//Get images 
		if(bondStreetTile == null){ 
			bondStreetTile = getImage("drawable/Bond Street Tile.png");
			bowStreetTile = getImage("drawable/Bow Street Tile.png");
			coventryStreetTile = getImage("drawable/Coventry Street Tile.png");
			electricCoTile = getImage("drawable/ElectricCompany Tile.png");
			eustonRoadTile = getImage("drawable/Euston Road Tile.png");
			fenchurchStStationTile = getImage("drawable/Fenchurch St Station Tile.png");
			fleetStreetTile = getImage("drawable/Fleet Street Tile.png");
			kingsCrossTile = getImage("drawable/Kings Cross Station Tile.png");
			leicesterSqTile = getImage("drawable/Leicester Square Tile.png");
			liverpoolStStationTile = getImage("drawable/Liverpool St Station Tile.png");
			marlboroughStTile = getImage("drawable/Marlborough Street Tile.png");
			maryleboneStationTile = getImage("drawable/Marylebone Station Tile.png");
			mayfairTile = getImage("drawable/Mayfair Tile.png");
			northumberlandAvTile = getImage("drawable/Northumberland Avenue Tile.png");
			oldKentRoadTile = getImage("drawable/Old Kent Road Tile.png");
			oxfordStreetTile = getImage("drawable/Oxford Street Tile.png");
			pallMallTile = getImage("drawable/Pall Mall Tile.png");
			parkLaneTile = getImage("drawable/Park Lane Tile.png");
			pentonvilleRdTile = getImage("drawable/Pentonville Road Tile.png");
			piccadillyTile = getImage("drawable/Piccadilly Tile.png");
			regentStreetTile = getImage("drawable/Regent Street Tile.png");
			strandTile = getImage("drawable/Strand Tile.png");
			angelIslingtonTile = getImage("drawable/The Angel Islington Tile.png");
			trafalgarSqTile = getImage("drawable/Trafalgar Square Tile.png");
			vineStreetTile = getImage("drawable/Vine Street Tile.png");
			waterWorksTile = getImage("drawable/WaterWorks Tile.png");
			whitechapelRdTile = getImage("drawable/WhiteChapel Road Tile.png");
			whitehallTile = getImage("drawable/Whitehall Tile.png");




			//Non- Property images
			monopolyLogo = getImage("drawable/monologo.png");
			go = getImage("drawable/go.jpg");
			freepark = getImage("drawable/freepark.png");
			gotojail = getImage("drawable/gotojail.png");
			injail = getImage("drawable/injail.png");
			chance = getImage("drawable/chance.png");
			comchest = getImage("drawable/comchest.png");
			incometax = getImage("drawable/incometax.png");
			luxurytax = getImage("drawable/luxurytax.png");
			comchestleft = getImage("drawable/comchestleft.png");
			comchestright = getImage("drawable/comchestright.png");
			chancetop = getImage("drawable/chancetop.png");
			chanceright = getImage("drawable/chanceright.png");





			//Info Card images
			bondStreet = getImage("drawable/Bond Street.png");
			bowStreet = getImage("drawable/Bow Street.png");
			coventryStreet = getImage("drawable/Coventry Street.png");
			electricCo = getImage("drawable/Electric Co.png");
			eustonRoad = getImage("drawable/Euston Road.png");
			fenchurchStStation = getImage("drawable/Fenchurch Street Station.png");
			fleetStreet = getImage("drawable/Fleet Street.png");
			kingsCross = getImage("drawable/King's Cross Station.png");
			leicesterSq = getImage("drawable/Leicester Square.png");
			liverpoolStStation = getImage("drawable/Liverpool Street Station.png");
			marlboroughSt = getImage("drawable/Marlborough Street.png");
			maryboyleStation = getImage("drawable/Maryboyle Station.png");
			mayfair = getImage("drawable/Mayfair.png");
			northumberlandAv = getImage("drawable/Northumberland Avenue.png");
			oldKentRoad = getImage("drawable/Old Kent Road.png");
			oxfordStreet = getImage("drawable/Oxford Street.png");
			pallMall = getImage("drawable/Pall Mall.png");
			parkLane = getImage("drawable/Park Lane.png");
			pentonvilleRd = getImage("drawable/Pentonville Road.png");
			piccadilly = getImage("drawable/Piccadilly.png");
			regentStreet = getImage("drawable/Regent Street.png");
			strand = getImage("drawable/Strand.png");
			angelIslington = getImage("drawable/The Angel Islington.png");
			trafalgarSq = getImage("drawable/Trafalgar Square.png");
			vineStreet = getImage("drawable/Vine Street.png");
			waterWorks = getImage("drawable/Water Works.png");
			whitechapelRd = getImage("drawable/Whitechapel Road.png");
			whitehall = getImage("drawable/Whitehall.png");
		}


		//Assign Images to their correct Tile
		for (Tile o : screen.Tiles) {
			switch (o.getTileNum()) {
			case 0:
				o.setImage(go);
				o.setType(TYPE_GO);
				o.setName("Go");
				break;
			case 1:
				o.setImage(oldKentRoadTile);
				o.setInfoImage(oldKentRoad);
				o.setName("Old Kent Road");
				o.setPrice(60);
				o.setType(TYPE_PROPERTY);
				o.setPossibleRents(SITE_RENTS[0]);
				break;
			case 2:
				o.setImage(comchest);
				o.setType(TYPE_COMMUNITY);
				o.setName("Community Chest");
				break;
			case 3:
				o.setImage(whitechapelRdTile);
				o.setInfoImage(whitechapelRd);
				o.setName("White Chapel Road");
				o.setPrice(60);
				o.setType(TYPE_PROPERTY);
				o.setPossibleRents(SITE_RENTS[1]);
				break;
			case 4:
				o.setImage(incometax);
				o.setType(TYPE_TAX);
				o.setPrice(200);
				o.setName("Income Tax");
				break;
			case 5:
				o.setImage(kingsCrossTile);
				o.setInfoImage(kingsCross);
				o.setName("Kings Cross Station");
				o.setPrice(200);
				o.setType(TYPE_STATION);
				o.setPossibleRents(SITE_RENTS[2]);
				break;
			case 6:
				o.setImage(angelIslingtonTile);
				o.setInfoImage(angelIslington);
				o.setName("The Angel Islington");
				o.setType(TYPE_PROPERTY);
				o.setPrice(100);
				o.setPossibleRents(SITE_RENTS[3]);
				break;
			case 7:
				o.setImage(chance);
				o.setType(TYPE_CHANCE);
				o.setName("Chance");
				break;
			case 8:
				o.setImage(eustonRoadTile);
				o.setInfoImage(eustonRoad);
				o.setName("Euston Road");
				o.setType(TYPE_PROPERTY);
				o.setPrice(100);
				o.setPossibleRents(SITE_RENTS[4]);
				break;
			case 9:
				o.setImage(pentonvilleRdTile);
				o.setInfoImage(pentonvilleRd);
				o.setName("Pentonville Road");
				o.setType(TYPE_PROPERTY);
				o.setPrice(120);
				o.setPossibleRents(SITE_RENTS[5]);
				break;
			case 10:
				o.setImage(injail);
				o.setType(TYPE_JAIL);
				o.setName("Jail");
				break;
			case 11:
				o.setImage(pallMallTile);
				o.setInfoImage(pallMall);
				o.setName("Pall Mall");
				o.setType(TYPE_PROPERTY);
				o.setPrice(150);
				o.setPossibleRents(SITE_RENTS[6]);
				break;
			case 12:
				o.setImage(electricCoTile);
				o.setInfoImage(electricCo);
				o.setName("Electric Company");
				o.setType(TYPE_UTILITY);
				o.setPrice(150);
				o.setPossibleRents(SITE_RENTS[7]);
				break;
			case 13:
				o.setImage(whitehallTile);
				o.setInfoImage(whitehall);
				o.setName("Whitehall");
				o.setType(TYPE_PROPERTY);
				o.setPrice(150);
				o.setPossibleRents(SITE_RENTS[8]);
				break;
			case 14:
				o.setImage(northumberlandAvTile);
				o.setInfoImage(northumberlandAv);
				o.setName("Northumberland Avenue");
				o.setType(TYPE_PROPERTY);
				o.setPrice(160);
				o.setPossibleRents(SITE_RENTS[9]);
				break;
			case 15:
				o.setImage(maryleboneStationTile);
				o.setInfoImage(maryboyleStation);
				o.setName("Marylebone Station");
				o.setType(TYPE_STATION);
				o.setPrice(200);
				o.setPossibleRents(SITE_RENTS[10]);
				break;
			case 16:
				o.setImage(bowStreetTile);
				o.setInfoImage(bowStreet);
				o.setName("Bow Street");
				o.setType(TYPE_PROPERTY);
				o.setPrice(180);
				o.setPossibleRents(SITE_RENTS[11]);
				break;
			case 17:
				o.setImage(comchestleft);
				o.setType(TYPE_COMMUNITY);
				o.setName("Community Chest");
				break;
			case 18:
				o.setImage(marlboroughStTile);
				o.setInfoImage(marlboroughSt);
				o.setName("Marlborough Street");
				o.setType(TYPE_PROPERTY);
				o.setPrice(180);
				o.setPossibleRents(SITE_RENTS[12]);
				break;
			case 19:
				o.setImage(vineStreetTile);
				o.setInfoImage(vineStreet);
				o.setName("Vine Street");
				o.setType(TYPE_PROPERTY);
				o.setPrice(200);
				o.setPossibleRents(SITE_RENTS[13]);
				break;
			case 20:
				o.setImage(freepark);
				o.setType(TYPE_PARKING);
				o.setName("Free Parking");
				break;
			case 21:
				o.setImage(strandTile);
				o.setInfoImage(strand);
				o.setName("Strand");
				o.setType(TYPE_PROPERTY);
				o.setPrice(220);
				o.setPossibleRents(SITE_RENTS[14]);
				break;
			case 22:
				o.setImage(chancetop);
				o.setType(TYPE_CHANCE);
				o.setName("Chance");
				break;
			case 23:
				o.setImage(fleetStreetTile);
				o.setInfoImage(fleetStreet);
				o.setName("Fleet Street");
				o.setType(TYPE_PROPERTY);
				o.setPrice(220);
				o.setPossibleRents(SITE_RENTS[15]);
				break;
			case 24:
				o.setImage(trafalgarSqTile);
				o.setInfoImage(trafalgarSq);
				o.setName("Trafalgar Square");
				o.setType(TYPE_PROPERTY);
				o.setPrice(240);
				o.setPossibleRents(SITE_RENTS[16]);
				break;
			case 25:
				o.setImage(fenchurchStStationTile);
				o.setInfoImage(fenchurchStStation);
				o.setName("Fenchurch Station");
				o.setType(TYPE_STATION);
				o.setPrice(200);
				o.setPossibleRents(SITE_RENTS[17]);
				break;
			case 26:
				o.setImage(leicesterSqTile);
				o.setInfoImage(leicesterSq);
				o.setName("Leicester Square");
				o.setType(TYPE_PROPERTY);
				o.setPrice(260);
				o.setPossibleRents(SITE_RENTS[18]);
				break;
			case 27:
				o.setImage(coventryStreetTile);
				o.setInfoImage(coventryStreet);
				o.setName("Coventry Street");
				o.setType(TYPE_PROPERTY);
				o.setPrice(260);
				o.setPossibleRents(SITE_RENTS[19]);
				break;
			case 28:
				o.setImage(waterWorksTile);
				o.setInfoImage(waterWorks);
				o.setName("Water Works");
				o.setType(TYPE_UTILITY);
				o.setPrice(150);
				o.setPossibleRents(SITE_RENTS[20]);
				break;
			case 29:
				o.setImage(piccadillyTile);
				o.setInfoImage(piccadilly);
				o.setName("Picadilly");
				o.setType(TYPE_PROPERTY);
				o.setPrice(280);
				o.setPossibleRents(SITE_RENTS[21]);
				break;
			case 30:
				o.setImage(gotojail);
				o.setType(TYPE_GOTO_JAIL);
				o.setName("Go to Jail!");
				break;
			case 31:
				o.setImage(regentStreetTile);
				o.setInfoImage(regentStreet);
				o.setName("Regent Street");
				o.setType(TYPE_PROPERTY);
				o.setPrice(300);
				o.setPossibleRents(SITE_RENTS[22]);
				break;
			case 32:
				o.setImage(oxfordStreetTile);
				o.setInfoImage(oxfordStreet);
				o.setName("Oxford Street");
				o.setType(TYPE_PROPERTY);
				o.setPrice(300);
				o.setPossibleRents(SITE_RENTS[23]);
				break;
			case 33:
				o.setImage(comchestright);
				o.setType(TYPE_COMMUNITY);
				o.setName("Community Chest");
				break;
			case 34:
				o.setImage(bondStreetTile);
				o.setInfoImage(bondStreet);
				o.setName("Bond Street");
				o.setType(TYPE_PROPERTY);
				o.setPrice(320);
				o.setPossibleRents(SITE_RENTS[24]);
				break;
			case 35: 
				o.setImage(liverpoolStStationTile);
				o.setInfoImage(liverpoolStStation);
				o.setName("Liverpool Station");
				o.setType(TYPE_STATION);
				o.setPrice(200);
				o.setPossibleRents(SITE_RENTS[25]);
				break;
			case 36:
				o.setImage(chanceright);
				o.setType(TYPE_CHANCE);
				o.setName("Chance");
				break;
			case 37:
				o.setImage(parkLaneTile);
				o.setInfoImage(parkLane);
				o.setName("Park Lane");
				o.setType(TYPE_PROPERTY);
				o.setPrice(350);
				o.setPossibleRents(SITE_RENTS[26]);
				break;
			case 38:
				o.setImage(luxurytax);
				o.setType(TYPE_TAX);
				o.setPrice(100);
				o.setName("Luxury Tax");
				break;
			case 39:
				o.setImage(mayfairTile);
				o.setInfoImage(mayfair);
				o.setName("Mayfair");
				o.setType(TYPE_PROPERTY);
				o.setPrice(400);
				o.setPossibleRents(SITE_RENTS[27]);
				break;
			default:
				break;
			}
		}
	}
}