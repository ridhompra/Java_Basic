public class reverse {
    public static void main(String[] args) {
        // String lala = reverse("ridhomp");
        // System.out.println(lala);
        String lala = rvs("ridhomp");
        System.out.println(lala);
    }
    public static String reverse(String input){
        StringBuilder rev = new StringBuilder(input);
        rev.reverse();
        return rev.toString();
    }
    public static String rvs(String inpuString){
        String reverseString= "";
        for (int i = 0; i < inpuString.length(); i++) {
            reverseString+= inpuString.charAt(inpuString.length()-i-1);
        }
        return reverseString;
    }
}
