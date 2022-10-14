package fr.diginamic.listes;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class TestListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>	list = new ArrayList<>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);

		int max = list.get(0);
		for (int i=1;i<list.size();i++)	{
			if (list.get(i) > max )	{
				max = list.get(i);	
			}
		}
		
		Integer min = list.get(0);
		for (int i=1;i<list.size();i++)	{
			if (list.get(i) < min )	{
				min = list.get(i);	
			}
		}
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(max);
		System.out.println(min);
		list.remove(min);
		//ou list.remove(new Integer(min));
		System.out.println(list);
		System.out.println(list.size());
		
		ArrayList<Integer>	list2 = new ArrayList<>();
		list2.add(-1);
		list2.add(5);
		list2.add(7);
		list2.add(3);
		list2.add(-2);
		list2.add(4);
		list2.add(8);
		list2.add(5);
		
		System.out.println(list2);
		for (int i=0;i<list2.size();i++)	{
			if (list2.get(i) < 0 )	{
				 list2.set(i, list2.get(i)*-1);	
			}
		}
		System.out.println(list2);	
		
		
	}

}
