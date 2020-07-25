package Implemetation_Collection_List;

import java.util.ArrayList;

public class List_Implementations {
	public void Add(ArrayList<Integer> l,int a) {
		l.add(a);
	}
	public String Remove(ArrayList<Integer> l,int ele) {
		if(l.contains(ele)) {
			l.remove(Integer.valueOf(ele));
			return "yes";
		}
			
		
		else 
			return "Sorry! There is no such element in the list.Try Again.";
	}
	
	public int  Fetch(ArrayList<Integer> l,int index) {
		return l.get(index);
	}
}
