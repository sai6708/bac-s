
package bacs;


import java.util.Scanner;
import java.lang.*; 

public class Bacs {

	public static void main(String[] args) {
	    String Compguess = NumberRand();
	    Scanner s=new Scanner(System.in);
            String Userguess = "";	
	    
            System.out.println(Compguess);
		
            System.out.println("Computer Guessed a Number");
            System.out.println("Type Exit to End the Game");
                       

            while(!"exit".equals(Userguess.toLowerCase()) ){
                Userguess = s.nextLine();
                Counter(Compguess,Userguess);
            }
		
		
	}
	
	public static String NumberRand()
	{
	    String basenum = "123456789", finalnum="", tempstr="";
	    Integer ranum = 0, max = 8 ;
            StringBuilder sb = new StringBuilder();

            tempstr = basenum;
            for (int i=1;i<=4;i++)
            {
                sb.setLength(0);
                ranum = (int )(Math.random() * max + 1);
                finalnum = finalnum + (tempstr.charAt(ranum));
                sb.append(tempstr);
                sb.deleteCharAt(ranum);
                tempstr = sb.toString();
                max = max - 1;
            }

           return finalnum;
	}
	
	
	public static void Counter(String Compguess, String Userguess)
	{
            char[] temp = Userguess.toCharArray(); 
            Integer bulls=0, cows=0;
            
	    if(!Compguess.equals(Userguess))
            {
                for (int i = 0; i < temp.length; i++) { 
                    
                    if (temp[i] == Compguess.charAt(i))
                        bulls++;
                    else if ((Compguess.indexOf(String.valueOf(Userguess.charAt(i))))>=0)
                        cows++;
                }
                System.out.println(bulls+" bulls, "+cows+" cows");
            }
	    else
            {
                System.out.println("won");
            }
            
            
	}

}