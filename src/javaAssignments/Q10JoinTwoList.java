package javaAssignments;
//Java Program to Join Two Lists

import java.util.ArrayList;
import java.util.List;

public class Q10JoinTwoList {
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Strong");
		list1.add("Stronger");
		list1.add("Strongest");
		List<String> list2 = new ArrayList<String>();
		list2.add("Good");
		list2.add("Better");
		list2.add("Best");
		
		List<String> joinList1 = new ArrayList<String>();
		
		joinList1.addAll(list1);
		joinList1.addAll(list2);
		
		System.out.println("List 1:\n"+list1);
		System.out.println("List 2:\n"+list2);
		System.out.println("Joined List :\n"+joinList1);
	}
}
