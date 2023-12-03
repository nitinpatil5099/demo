package com.app.tester;
import com.apps.fruits.*;
import java.util.*;
public class FruitBasket {

	public static void main(String[] args) {
		System.out.println("Welcome to fruit basket ");
		System.out.println("Please enetr size of basket ");
		Scanner sc=new Scanner(System.in);
		Fruit[] basket=new Fruit[sc.nextInt()];
		System.out.println("class type of basket is "+basket.getClass());
		int counter=0;
		boolean exit=false;
		while(!exit)
		{
		System.out.println("please click below option \n 1.Add Mango \n 2.Add Orange \n 3.Add Apple \n 4.Display name of all fruits \n 5.Display name,colour,weight,taste of all fresh fruits \n 6.Mark a fruit in basket as stale \n7.mark all sour fruits stale \n 8.Invoke fruit specific functa \n9.Exit");
		switch (sc.nextInt())
		{
		case 1:
			System.out.println("Enter colour of fruit ,weight,name,fresh");
			basket[counter++]=new Mango(sc.next(),sc.nextDouble(),sc.next(),true);
			break;

		case 2:
			System.out.println("Enter colour of fruit ,weight,name,fresh");
			basket[counter++]=new Apple(sc.next(),sc.nextDouble(),sc.next(),true);
			break;
		case 3:
			System.out.println("Enter colour of fruit ,weight,name,fresh");
			basket[counter++]=new Orange(sc.next(),sc.nextDouble(),sc.next(),true);
			break;
		case 4:
			for(Fruit f: basket)
			{
				if(f!=null)
				System.out.println(f.getname());
			}
			break;
		case 5:
			for(Fruit f : basket)
			{
				if(f!=null && f.isfresh())
					System.out.println(f.prop()+" "+f.taste());
			}
			break;
		case 6:
			System.out.println("please enter index at which you want to mark fruits stale");
			int i=sc.nextInt();
			if(i>0 && i<counter)
				basket[i].setstale();
			break;
		case 7:
			for(Fruit f :basket)
			{
				if(f!=null && f.taste()=="sour")
				f.setstale();
			}
			break;
		case 8:
			System.out.println("please enter index");
			 i=sc.nextInt();
			 Fruit f=basket[i];
			 if(f!=null)
			 {
			 if(f instanceof Apple)
			 {
				  ((Apple) f).jam();
			 }
			 if(f instanceof Orange)
			 {
				 ((Orange) f).juice();
				 
			 }
			 if(f instanceof Mango)
			 {
				 ((Mango) f).pulp();
			 }
			 }
			 else
				 System.out.println("invalid index");
			 break;
		case 9:
			System.out.println("exit");
			exit=true;
			break;
		default:
			System.out.println("please eneter correct index");
			break;
		}
		
		}
	}

}
