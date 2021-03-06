package com.mitrais.cdc.java;

import java.util.Arrays;
import java.util.Collections;

public class SortingExamples {

  // array containing a few Strings
  public static String[] words = { "hi", "hello", "hola", "bye", "goodbye", "adios" };
  public static String[] wordsFirst= { "ci", "kello", "yola", "bye", "goodbye", "adios" };
  
  public static String[] sortedByLengthAscending(){
	  String[] sortedByLengthAscending = words;
	  
	  /*
	   * TO DO
	   * Sort words by length (i.e., shortest to longest)
	   * 
	   */
	  Arrays.sort(sortedByLengthAscending,(s1,s2)->(s1.length()-s2.length()));
	  return sortedByLengthAscending;
  }
  
  
  public static String[] sortedByLengthDescending(){
	  String[] sortedByLengthDescending = words;
	  int counter=0;
	  String[] tampung= new String[6];
	  
	  /*
	   * TO DO
	   * Sort words by reverse length (i.e., longest to shortest)
	   * 
	   */
	  Arrays.sort(sortedByLengthDescending,(s1,s2)->(s2.length()-s1.length()));
	  
	  
	  
	  return sortedByLengthDescending;
			  
  }
  
  public static String[] sortedByFirstLetter(){
	  String[] sortedByFirstLetter = wordsFirst;
	  
	  /*
	   * TO DO
	   * Sort words alphabetically by the first character only
	   * 
	   */
	  
	  Arrays.sort(sortedByFirstLetter,(s1,s2)->(s1.charAt(0)- s2.charAt(0)));
	  
	  for (String tampung:sortedByFirstLetter)
	  {
		  System.out.println(tampung);
	  }
	  
	  return sortedByFirstLetter;
			  
  }
  
  public static String[] sortedByContains(){
	  String[] sortedByContains = words;
	  
	  /*
	   * TO DO
	   * Sort words by whether it contains 'e'
	   * Strings that contain “e” first, everything else second
	   * Hint: use method StringUtils.eChecker
	   * 
	   */
	  
	  Arrays.sort(sortedByContains,(s1,s2)->StringUtils.eChecker(s1, s2));
	  
	  
	  return sortedByContains;
			  
  } 
  
}
