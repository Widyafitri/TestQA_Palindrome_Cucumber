package com.juaracoding.cucumber;

public class PalindromeTest {
    public boolean isPalindrome(String value) {
        for (int i = 0; i < value.length(); i++) {
            int textAwal = i;
            int textAkhir = value.length() - i - 1;

            if (value.charAt(textAwal) != value.charAt(textAkhir)) {
                return false;
            }

        }

        return true;
    }
}




    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to check palindrome");
        String text = scanner.nextLine();
        scanner.close();

        String[] s1 = text.split("");
        String reverseString = "";

        for (int i = s1.length - 1; i >= 0; i--) {
            reverseString = reverseString + s1[i];
        }
        System.out.println(reverseString);
        if (text.equals(reverseString)) {
            System.out.println("Text adalah palindrome");
        } else {
            System.out.println("Text bukan palindrome");
        }

    }

     */



       /*
       String text = "Abu";

       String temp = "";
       for (int i = text.length() - 1; i >= 0; i--) {
           char c = text.charAt(i);
       temp += String.valueOf(c);
   }

   if (text.toLowerCase().equals(temp.toLowerCase())){
       System.out.println("Text adalah polindrome");
    }else {
       System.out.println("Text bukan polindrome");
   }




        */
