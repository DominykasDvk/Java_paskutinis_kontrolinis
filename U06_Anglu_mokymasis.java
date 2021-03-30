import java.util.Scanner;

public class U06_Anglu_mokymasis {
    public static void main(String[] args) {
        Scanner rdr = new Scanner(System.in);

        System.out.println("Įveskite kelis kartus pr diena mokėsi Jonas: ");
        int n = rdr.nextInt();

        System.out.println("Įveskite mokslo pradžios valandas: ");
        int Aval = rdr.nextInt();

        System.out.println("Įveskite mokslo pradžios minutes: ");
        int Amin = rdr.nextInt();

        System.out.println("Įveskite mokslo pabaigos valandas: ");
        int Bval = rdr.nextInt();

        System.out.println("Įveskite mokslo pabaigos minutes: ");
        int Bmin = rdr.nextInt();

        rdr.close();

        int min = getTimemin(Aval, Amin, Bval, Bmin);
        System.out.println("Minutemis mokėsi: " + min);
        String laik = getTimeFormat(min);
        System.out.println("Laikas: " + laik);

    } // 6.1

    private static int getTimemin(int Aval, int Amin, int Bval, int Bmin) {
        int Allval = ((Bval * 60) + Bmin) - ((Aval * 60) + Amin);
        return Allval;
    }

    // 6.2
    private static String getTimeFormat(int min) {
        int val = (int) min / 60;
        int min2 = min - (val * 60);
        String laikas = val + " val. " + min2 + " min.";
        return laikas;
    }
}