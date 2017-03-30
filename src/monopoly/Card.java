package monopoly;

public class Card {
	
	public static final int TYPE_FINE = 0;
	public static final int TYPE_REWARD = 1; 
	public static final int TYPE_GOOJ = 2; 
	public static final int TYPE_GOTO = 3;
	public static final int TYPE_BUILDINGFINE = 4;
	public static final int TYPE_MONEYFROMEACHPLAYER = 5;
	public static final int TYPE_FINEORCHANCE = 6;
	
	
	private String message;
	private int amount;
	private int type;
	private int destination;
	public boolean passGo;
	
	public int cardNumber;
	
	
	public Card(int n){
		this.cardNumber = n;
	}
	public void setMessage(String s){
		this.message = s;
	}
	public String getMessage(){
		return this.message;
	}
	
	public void setAmount(int x){
		this.amount = x;
	}
	public int getAmount(){
		return this.amount;
	}
	
	public void setType(int x){
		this.type = x;
	}
	public int getType(){
		return this.type;
	}
	
	public void setDestination(int x){
		this.destination = x;
	}
	public int getDestination(){
		return this.destination;
	}
}