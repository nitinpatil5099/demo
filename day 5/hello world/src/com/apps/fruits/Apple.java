package com.apps.fruits;

public class Apple extends Fruit {
	public Apple(String colour,double weight,String name,boolean fresh) {
		super(colour,weight,name,fresh);
	}

	
	public void jam()
	{
		System.out.println(getname()+"making jam");
	}
	@Override
	public String taste()
	{
		return "sweet and sour";
	}
}
