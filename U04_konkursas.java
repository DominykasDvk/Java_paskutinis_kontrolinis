import java.util.Scanner;

public class U04_konkursas {
    public static void main(String[] args) {
        Scanner rdr = new Scanner(System.in);

        System.out.println("Intervalo pradžia: ");
        int a = rdr.nextInt();
        
        System.out.println("Intervalo pabaiga: ");
        int b = rdr.nextInt();

        int marsk = 0;
        
        for (int i = a; i <= b; i++) {
            if (i % 6 == 0)
                marsk = marsk + 1;
        }
        System.out.println("Reikalingų marškinėlių skaičius: " + marsk);
        rdr.close();

    }
}