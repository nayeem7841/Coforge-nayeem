package com.pack;

public class Message
{
  private String id;
  private String message;
  WriteMessage writeMessage;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public WriteMessage getWriteMessage() {
	return writeMessage;
}
public void setWriteMessage(WriteMessage writeMessage) {
	this.writeMessage = writeMessage;
}
  
public void show()
{
	writeMessage.WriteMessage();
}
}
