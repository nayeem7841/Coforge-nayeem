package com.pkr;

public class Message
{
	//create setter method for injectable writeMessage
	WriteMessage writeMessage;
	private String id;
	 private String message;
	
    public WriteMessage getWriteMessage() 
    {
		return writeMessage;
	}
	public void setWriteMessage(WriteMessage writeMessage)
	{
		this.writeMessage = writeMessage;
	}
   
     public String getId()
     {
	   return id;
     }
     public void setId(String id)
     {
	    this.id = id;
     }
     public String getMessage()
     {
	   return message;
     }
     public void setMessage(String message)
     {
	   this.message = message;
     }
     
     public void show() {
 		writeMessage.WriteMessage();
 		
 	}
 }
