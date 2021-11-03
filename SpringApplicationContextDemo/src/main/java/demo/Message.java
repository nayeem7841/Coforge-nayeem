package demo;

public class Message 
{
    private String name;

    public String getName()
    {
	  return name;
    }

    public void setName(String name)
    {
	    this.name = name;
    }
    
    public void show()
    {
    	System.out.println("from message"+name);
    }
   
 
}
