

import java.util.*;


public class Palindrome {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the string");
        String inputStr =scanner.next();
        String reverse="";
        System.out.println("Given String = "+inputStr);
        char [] charArray=inputStr.toCharArray();
        int strlength=(charArray.length)-1;
        boolean isPalindrom=true;
        
    for ( int i = strlength ; i >= 0 ; i-- )
           
    {
        	reverse = reverse + inputStr.charAt(i);
    }
    System.out.println("Reverse of entered string is: "+reverse);

        for(int count=0; count<charArray.length && strlength >= 0; count++,strlength--){
        	       
            if(charArray[count]!=charArray[strlength]){
                isPalindrom=false;
                break;
            }  
            
        }
       

      if(isPalindrom){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
}