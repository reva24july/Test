package interviewAutomation;

import java.util.HashMap;
import java.util.Map;

public class ArrayString {
	
	    public static void main(String[] args) {
	        String[] array = {"racecar", "level", "hello", "world"};
	        int palindromeCount = 0;

	        for (String word : array) {
	            if (isPalindrome(word)) {
	                palindromeCount++;
	            }
	        }

	        System.out.println("There are " + palindromeCount + " palindromes in the array.");

	        String[] wordsToCount = {"dad", "mom", "son", "cat"};
	        Map<String, Integer> wordCounts = new HashMap<>();

	        for (String word : wordsToCount) {
	            wordCounts.put(word, 1);
	        }

	        for (String word : array) {
	            if (wordCounts.containsKey(word)) {
	                wordCounts.put(word, wordCounts.get(word) + 1);
	            }
	        }

	        System.out.println("Word counts: " + wordCounts);
	    }

	    public static boolean isPalindrome(String word) {
	        return word.equals(new StringBuilder(word).reverse().toString());
	    }
	}



