public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("kamu"));
    }

    public static String palindrome(String input){
        String lala = "its not palindrome";
        for (int i = 0; i < input.length()/2; i++) {
            if (input.charAt(i) == input.charAt(input.length()-i-1)) {
                lala = "palindrome";
            }
        }
        return lala;
    }
}

