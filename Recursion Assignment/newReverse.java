class newReverse {
    public static void main (String[]args){
        System.out.println(newReverse.reverse("word"));
    }

    public static String reverse (String word) {
        if (word.length()==0) {
            return "";
        }
        return word.charAt(word.length()-1)+reverse(word.substring(0,word.length()-1));
    }
}
