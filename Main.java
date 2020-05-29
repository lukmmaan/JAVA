import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World !");
        int number = 21;
        byte umur = 48;
        short iniShort = 128;
        int iniInt = 1_142_342;
        long iniLong = 12345678;
        float iniFloat = 147.32F;
        double iniDouble = 147.33D;
        String nama = "lukman";
        char grade = 'B';
        boolean isVerified = true;

        String people[] = new String[5];
        people[0] = "Seto";
        // System.out.println(Arrays.toString(people)); //sysout

        int orang[] = new int[5];
        orang[0] = 3;
        System.out.println(Arrays.toString(orang)); //sysout

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" }; // array read only
        // System.out.println(Arrays.toString(cars));

        for (int i = 0; i < orang.length; i++) {
            orang[i] = i * 3;
        }
        // System.out.println(Arrays.toString(orang));

        int matrix[][] = new int[4][3];
        matrix[0][1] = 17;
        matrix[1][0] = 7;
        // System.out.println(Arrays.deepToString(matrix));

        final float PI = 3.14F; // const variable
        // System.out.println(PI);

        // Scanner scanner = new Scanner(System.in);
        // byte inputAge = scanner.nextByte();
        // System.out.println("input age "+ inputAge);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Nama Anda: ");
        String inputName = scanner.nextLine();
        System.out.print("Input Umur Anda: ");
        byte inputAge = scanner.nextByte();
        System.out.print("Input Alamat Anda: ");
        String inputAlamat = scanner.next();
        System.out.print("Input Tahun Lahir Anda: ");
        short inputYearBorn = scanner.nextShort();
        System.out.println("Nama Anda Adalah " + inputName + ", dan berumur " + inputAge + " tahun, berAlamat di "
                + inputAlamat + ", dengan tahun lahir " + inputYearBorn);

        // System.out.println("Nama Anda Adalah "+ inputName + <berumur> +<tempat
        // tinggal> + <tahun lahir>);
    }
}