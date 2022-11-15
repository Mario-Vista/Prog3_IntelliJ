import java.util.ArrayList;



public class Purse 
{  
  
 public Purse()
  {
   coins = new ArrayList();
  }
  

 public void add(Coin aCoin) 
  {
   coins.add(aCoin);
  }
 

 public double getTotal() 
  {

     double total = 0;
     
     for (int i = 0; i < coins.size(); i++)
     {
       Coin aCoin = (Coin)coins.get(i);
       total = total + aCoin.getValue();
 
     } 
    return total;

  }

 public int count() 
  {
   return coins.size();
  }


  public boolean find(Coin aCoin) 
  {
     
     for (int i = 0; i < coins.size(); i++)
     {
       Coin c = (Coin)coins.get(i);
       if(c.equals(aCoin)) return true;
 
     }
    return false; 
  }


  public int count(Coin aCoin) 
  {
     
      int matches = 0;
     for (int i = 0; i < coins.size(); i++)
     {
       Coin c = (Coin)coins.get(i);
       if(c.equals(aCoin)) matches++;
 
     }
    return matches; 
  }

  
 public Coin getMaximum() 
  {
     
     Coin max = (Coin)coins.get(0);
  
     
     for (int i = 1; i < coins.size(); i++)
     {
       Coin c = (Coin)coins.get(i);
       if(c.getValue() > max.getValue()) max = c;
 
     }
    return max; 
  }

  
   private ArrayList coins; 
}
