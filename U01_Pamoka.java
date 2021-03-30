import java.util.Scanner;

public class U01_Pamoka {
    public static void main(String[] args) {
        Scanner rdr = new Scanner(System.in);

        System.out.println("Kiek pamokų yra pirmadienį? ");
        int pam1 = rdr.nextInt();

        System.out.println("Kiek pamokų yra antradienį? ");
        int pam2 = rdr.nextInt();

        System.out.println("Kiek pamokų yra trečiadienį? ");
        int pam3 = rdr.nextInt();

        System.out.println("Kiek pamokų yra ketvirdienį? ");
        int pam4 = rdr.nextInt();

        System.out.println("Kiek pamokų yra penktadienį? ");
        int pam5 = rdr.nextInt();

        rdr.close();

        int time = 45;

        int sum = pam1 + pam2 + pam3 + pam4 + pam5;

        int sumMin = sum * time;

        System.out.println("Pamokų skaičius: " + sum);
        System.out.println("Tai sudaro minučių: " + sumMin);
    }
}
