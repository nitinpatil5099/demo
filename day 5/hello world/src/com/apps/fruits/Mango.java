package com.apps.fruits;

public class Mango extends Fruit {
	public Mango(String colour,double weight,String name,boolean fresh) {
		super(colour,weight,name,fresh);
	}

	
	public void pulp()
	{
		System.out.println(getname()+"making pulp");
	}
	@Override
	public String taste()
	{
		return "sweet ";
	}
}