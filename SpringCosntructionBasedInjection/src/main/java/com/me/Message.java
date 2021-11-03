package com.me;

public class Message 
{
   private String name;
   private String message;
   
     public Message(String name,String message)
     {
    	 this.name=name;
    	 this.message=message;
     }
     public String getName() 
     {
	     return name;
      }
    public void setName(String name) 
    {
	  this.name = name;
     }
    public String getMessage()
    {
	  return message;
    }
    public void setMessage(String message)
    {
    	this.message = message;
     }
   
   public void show()
   {
	   System.out.println(" from id=" +name);

		System.out.println(" from message=" +message);
   }
}
