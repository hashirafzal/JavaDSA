package palindrome;

public class AlmostPalindrome {


 public static void main(String[] args)
 {
     String str = "Helle";

     Boolean isPalindrome = almostPalindrome(str);
     System.out.println(isPalindrome);
 }
 public static boolean almostPalindrome(String str)
 {
     int length = str.length();
     int notMatched=0;
     for(int i=0;i<length/2;i++)
     {
         if(str.charAt(i)!=str.charAt(length-1-i))
         {
             notMatched++;
         }
         if(notMatched>1)
             return false;
     }

     return notMatched<2;
 }

}
