import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DataTypes {

    public static void main(String[] args) throws Exception {

        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in)
        );

        // Membaca jumlah test case
        int T = Integer.parseInt(input.readLine().trim());

        for (int i = 0; i < T; i++) {

            // Membaca angka sebagai String
            String n = input.readLine().trim();

            // Mengubah String menjadi BigInteger
            // agar dapat membaca angka yang lebih besar dari long
            BigInteger number = new BigInteger(n);

            boolean fitted = false;

            // Mengecek byte
            if (number.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                number.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {

                if (!fitted) {
                    System.out.println(number + " can be fitted in:");
                    fitted = true;
                }

                System.out.println("* byte");
            }

            // Mengecek short
            if (number.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                number.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {

                if (!fitted) {
                    System.out.println(number + " can be fitted in:");
                    fitted = true;
                }

                System.out.println("* short");
            }

            // Mengecek int
            if (number.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                number.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {

                if (!fitted) {
                    System.out.println(number + " can be fitted in:");
                    fitted = true;
                }

                System.out.println("* int");
            }

            // Mengecek long
            if (number.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                number.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {

                if (!fitted) {
                    System.out.println(number + " can be fitted in:");
                    fitted = true;
                }

                System.out.println("* long");
            }

            // Jika tidak bisa disimpan di semua tipe data
            if (!fitted) {
                System.out.println(
                    number + " can't be fitted anywhere."
                );
            }
        }
    }
}