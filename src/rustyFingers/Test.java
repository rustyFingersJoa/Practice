package rustyFingers;
import java.util.InputMismatchException;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

//	String[] a1 = {"One", "Two", "Three", "one", "four", "five", "four"};
//	String[] a2 = {"three", "Two", "Three", "five", "four", "five", "four", "one"};
//	
//	ArrayList<String> list1 = new ArrayList<>(Arrays.asList(a1));
//	ArrayList<String> list2 = new ArrayList<>(Arrays.asList(a2));
//	
//	System.out.println(getCommonString(list1, list2));
		
		String num = "2";
		System.out.println(Integer.parseInt(num));

}
	
	public static ArrayList<String> getCommonString(ArrayList<String> list1, ArrayList<String> list2){
		ArrayList<String> list3 = new ArrayList<>();
		
		for (int i = 0; i < list1.size(); i++)
			list3.add(list1.get(i));
		
		for (int i = 0; i < list2.size(); i++)
			list3.add(list2.get(i));
		
		int j = 1;
		for (int i = 0; i < list3.size(); i++) {
			while (j < list3.size()) {
				if (list3.get(i).equals(list3.get(j))) {
					list3.remove(j);
					j--;
				}
				j++;
			}
		}
		
		
		return list3;
	}
	
}
