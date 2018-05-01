package edu.maryville.isys320;
import java.util.Scanner;
public class Problem_12 {

	   public static void main(String[] args) {
		   String phrase;
		      int start = 0;

		      // get input
		      Scanner scan = new Scanner(System.in);

		      System.out.print("Enter a word? ");
		      phrase = scan.nextLine();

		      int n=0;

		      while(start < phrase.length()) {
		        n++;
		        if(start+n > phrase.length())
		          n=phrase.length()-start;
		        String row = phrase.substring(start, start + n);
		        start+=n;
		        System.out.println(row);
		      }
		      }
		   }
		

