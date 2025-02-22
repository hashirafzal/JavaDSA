package palindrome;

public class Palindrome {

    public static void main(String[] args) {

        int[] palindrome = new int[]{10,20,30,30,20,0};
        String[] palindromeArray = new String[]{"Hello", "World", "!","!", "World","Hello"};
        //Boolean isPalindrome = palindromeChecker(palindromeArray);
        Boolean isPalindrome = isPalindrome(palindromeArray);


        System.out.println(isPalindrome);


    }

    private static Boolean palindromeChecker(String palindrome) {
        int length = palindrome.length();
        for(int i=0;i<length/2;i++)
        {

            if(palindrome.charAt(i)!=palindrome.charAt(length-1-i))
            {
                return false;
            }

        }
        return true;
    }
    private static Boolean palindromeChecker(int[] palindrome) {
        int length = palindrome.length;
        for(int i=0;i<length/2;i++)
        {

            if(palindrome[i]!=palindrome[(length-1-i)]
            )
            {
                return false;
            }

        }
        return true;
    }

    public static boolean isPalindrome(String[] palindrome)
    {
        int length = palindrome.length;
        for(int i=0;i<length/2;i++)
        {
            if(!palindrome[i].equals(palindrome[length-1-i]))
            {
                return false;
            }
        }

        return true;
    }




}
