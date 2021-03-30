import java.util.Scanner;

public class U02_Knygos {
    public static void main(String[] args) {
        Scanner rdr = new Scanner(System.in);

        System.out.println("Įveskite dežių skaičių: ");
        int d = rdr.nextInt();

        System.out.println("Įveskite knygų skaičių: ");
        int k = rdr.nextInt();

        System.out.println("Įveskite, kelios knygos telpa į dežę: ");
        int n = rdr.nextInt();

        rdr.close();

        n = n * d;
        // System.out.println("n: "+n);

        if (n >= k) {
            System.out.println("Knygos telpa į dėžes.");
        } else {
            System.out.println("Į dežes netilpo " + (k - n) + " knygos/-a/-ų.");
        }

    }
}
