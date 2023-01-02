import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checknumber {
    public static void main(String[] args) {
        String input1 = "hallo jesika24 selamat datang!";
        String input2 = "hallo anggun selamat datang!";
        String input3 = "hallo ** selamat datang!";
        String input4 = "hallo Mariage889120! selamat datang!";
        Check(input1);
        Check(input2);
        Check(input3);
        Check(input4);

    }
    public static void Check(String inputString) {
        String regex = "\\d+";  // Angka bisa diwakili dengan regex "\d"
        Pattern pattern = Pattern.compile(regex);

        // Cek input1
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.find()) {
            // Jika input1 mengandung angka, tampilkan output yang sesuai
            System.out.println("Sistem kami menolak untuk inputan berisi angka " + matcher.group());
        } else {
            // Jika tidak, tampilkan output yang sesuai
            System.out.println("Sistem memeriksa data anda valid dengan ketentuan kami dengan inputan " + inputString);
        }
    }
}
    