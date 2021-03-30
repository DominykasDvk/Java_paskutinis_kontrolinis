import java.util.Scanner;

public class U05_KETmokykla {
    public static void main(String[] args) {
        Scanner rdr = new Scanner(System.in);

        System.out.print("Įveskite pažymį: ");
        int p1 = rdr.nextInt();

        System.out.print("Įveskite pažymį: ");
        int p2 = rdr.nextInt();
        
        System.out.print("Įveskite pažymį: ");
        int p3 = rdr.nextInt();

        rdr.close();

        int geriausias = gautiGeriausiaIvertinima(p1, p2, p3);
        System.out.println("Geriausias pažimys: " + geriausias);
    }

    private static int gautiGeriausiaIvertinima(int p1, int p2, int p3) {
        return Math.max(Math.max(p1, p2), p3);
    }
}