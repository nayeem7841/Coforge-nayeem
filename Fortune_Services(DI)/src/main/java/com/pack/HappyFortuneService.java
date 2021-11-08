package com.pack;

public class HappyFortuneService implements Fortune_Service 
{
 
	//define private field for dependence
	private String Fortune;
	private String me;
	
	//constructor for dependence function
	public HappyFortuneService(String theFortune)
	{
		Fortune=theFortune;
	}
	public String  ShowFortune() {
		// TODO Auto-generated method stub
		return "today is your fortune day";

	}
	
	public String getMe() {
		return me;
	}
	public void setMe(String me) {
		this.me = me;
	}
	public void show()
	{
		System.out.println(Fortune);
	}

	public void fun() {
		System.out.println("init-method started...");
	}
    public void destry()
    {
    	System.out.println("called during the destroy method");
    }
}
