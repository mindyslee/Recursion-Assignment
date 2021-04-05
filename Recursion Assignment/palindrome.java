class palindrome {
    public static void main (String[]args){
        System.out.println(palindrome.isPalindrome("reviver"));

    }

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length()-1)) {
            return isPalindrome(word.substring(1, word.length()-1));
        } return false;
    }     

}


