public class PurseTest{
	
	public static void main(String args[]){
		
		
	Purse coins = new Purse(); 
	
	coins.add(new Coin(10,"m_1"));
	coins.add(new Coin(20,"m_2"));
	coins.add(new Coin(30,"m_3"));
	
	//System.out.println(coins.getMaximum().getValue()); 	
	
	System.out.println(coins.find(new Coin(30,"m_3")));
		
		
	}
	
}