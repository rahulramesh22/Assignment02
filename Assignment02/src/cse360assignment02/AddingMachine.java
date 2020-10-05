package cse360assignment02;

public class AddingMachine
{
	private int total;
	private String transactions;
	  
	  public AddingMachine () 
	  {
	    total = 0;  // not needed - included for clarity
	    transactions="0";
	  }
	  
	  public int getTotal () {
	    return total; //returns total
	  }
	  
	  public void add (int value) 
	  {
		  total+=value;
		  transactions= transactions+" + "+value; //adds the operator and value to the string
	  }

	  public void subtract (int value)
	  {
		  total-=value;
		  transactions= transactions+" - "+value;
	  }

	  public String toString () {
	    return transactions;
	  }

	  public void clear() 
	  {
		transactions="";
		total=0;
		 
	  }

}

