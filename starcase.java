public class starcase {
    public static void main(String[] args) {
        starcase(10);
    }
    public static void starcase(int input) {
        for (int i = 0; i < input; i++) {
            for (int j = input-i; j < input; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < input; i++) {
            for (int j = input-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = input-i; j <input ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}