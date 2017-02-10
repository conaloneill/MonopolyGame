package monopoly;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

import javax.swing.JPanel;


import propertyImages.PropertyImages;


@SuppressWarnings("serial")
public class RenderPanel extends JPanel {

	private Image monopolyLogo = null;
	private Image go = null;
	private Image freepark = null;
	private Image gotojail = null;
	private Image injail = null;
	private Image chance = null;
	private Image comchest = null;
	private Image train = null;
	private Image incometax = null;
	private Image luxurytax = null;

	public Image propertyTest = null;
	private PropertyImages propertyImages = new PropertyImages();

	private Color backGreen = new Color(198, 255, 181);
	public Color insideGreen = new Color(165, 255, 137);

	private int dotsize = 15, logoWidth = 500, logoHeight = 200;

	//Function to get images
	public Image getImage(String path){ 
		Image temp = null;
		try {
			URL imageURL = RenderPanel.class.getResource(path);
			temp = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return temp;
	}


	@Override
	protected void paintComponent(Graphics g) {
		GameScreen screen = GameScreen.screen; //enables use of info from screen
		super.paintComponent(g);

		//Draw green background
		g.setColor(backGreen);
		g.fillRect(GameScreen.BOARD_WIDTH - GameScreen.TILESIZE*11 ,GameScreen.BOARD_HEIGHT - GameScreen.TILESIZE*11, GameScreen.BOARD_WIDTH, GameScreen.BOARD_HEIGHT);
		g.setColor(insideGreen);
		g.fillRect(GameScreen.BOARD_WIDTH - GameScreen.TILESIZE*10 ,GameScreen.BOARD_HEIGHT  - GameScreen.TILESIZE*10, GameScreen.BOARD_WIDTH - GameScreen.TILESIZE*2 , GameScreen.BOARD_HEIGHT - GameScreen.TILESIZE*2);

		if(monopolyLogo == null){ //get images
			monopolyLogo = getImage("drawable/monologo.png");
			go = getImage("drawable/go.jpg");
			freepark = getImage("drawable/freepark.png");
			gotojail = getImage("drawable/gotojail.png");
			injail = getImage("drawable/injail.png");
			chance = getImage("drawable/chance.png");
			comchest = getImage("drawable/comchest.png");
			train = getImage("drawable/train.png");
			incometax = getImage("drawable/incometax.png");
			luxurytax = getImage("drawable/luxurytax.png");
			propertyTest = getImage("drawable/Picadilly.png");
			propertyImages.assignTileImages();
		}

		//Draw Monopoly Logo on board
		g.drawImage(monopolyLogo, GameScreen.BOARD_WIDTH/2 - logoWidth/2, GameScreen.BOARD_HEIGHT/2 - logoHeight/2,logoWidth,logoHeight, this);

		for(Tile o : screen.Tiles){ 
			//Draw Tile's image
			g.drawImage(o.getImage(), o.x - GameScreen.TILESIZE/2, o.y - GameScreen.TILESIZE/2, GameScreen.TILESIZE, GameScreen.TILESIZE, this);
			//Draw black rectangles around tiles
			g.setColor(Color.BLACK);
			g.drawRect(o.x - GameScreen.TILESIZE/2, o.y - GameScreen.TILESIZE/2, GameScreen.TILESIZE, GameScreen.TILESIZE);
			
		}

		//Draws the individual player tokens
		for(Player p : screen.Players){
			g.setColor(p.getColour());  //Sets Color to player color
			g.fillOval(p.xPosition, p.yPosition, dotsize, dotsize);  //Draws player token at current x,y coordinates
			g.setColor(Color.BLACK);
			g.drawOval(p.xPosition, p.yPosition, dotsize, dotsize);  //Draws black circle around token
			g.setFont(new Font("TimesRoman", Font.BOLD, 10));
			g.drawString("P" + p.playerNumber, p.xPosition+3, p.yPosition + 12);
		}
	}
}
