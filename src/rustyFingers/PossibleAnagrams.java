package rustyFingers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PossibleAnagrams {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the word to generate it's anagrams: ");
		String word = scan.next();
		
        List<String> anagrams = Anagrams(word);
        
        System.out.println();
        for (String anagram : anagrams) {
            System.out.println(anagram);
        }
        
        scan.close();
        
	}
	
	
    private static List<String> Anagrams(String word){
    	    List<String> anagrams = new ArrayList<>();
	        generateAnagrams("", word, anagrams);
	        removeDuplicates(anagrams);
	        return anagrams;
	    }

    private static void generateAnagrams(String prefix, String remaining, List<String> anagrams) {
	        int n = remaining.length();
	        
	        if (n == 0) {
	            anagrams.add(prefix);
	        } else {
	            for (int i = 0; i < n; i++) {
	            	generateAnagrams(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n), anagrams);
	            }
	        }
	    }
	    
    private static void removeDuplicates(List<String> list) {
	        int size = list.size();
	        
	        for (int i = 0; i < size; i++) {
	            String currentAnagram = list.get(i);
	            for (int j = i + 1; j < list.size(); j++) {
	                if (currentAnagram.equals(list.get(j))) {
	                    list.remove(j);
	                    j--;
	                    size--;
	                }
	            }
	        }
	    }

}
