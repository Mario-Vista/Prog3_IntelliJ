class Coin
{  // a constructor for constructing a coin 

   public Coin(double aValue, String aName)
   {  value = aValue;
      name = aName;
   }

   // methods to access the value and name

   public double getValue()
   {  return value;
   }

   public String getName()
   {  return name;
   }

   
   /*@Override //?
   public boolean equals(Coin aCoin)
     {
  	   if(value == aCoin.getValue() && aCoin.getName().equals(name))
  		   return true;
  	   else
  		   return false;
     }*/
   
   
   @Override
   public boolean equals(Object obj)
     {
  	   Coin aCoin = (Coin)obj;
  	   if(value == aCoin.getValue() && aCoin.getName().equals(name))
  		   return true;
  	   else
  		   return false;
     }
   

   // instance variables to store the value and name
 
   private double value;
   private String name;
}
