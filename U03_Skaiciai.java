public class U03_Skaiciai {
    public static void main(String[] args) {

        int nr1 = -100, nr11 = -100, nr2 = -199, nr12 = -199;

        for (int i = nr11; i >= nr12; i -= 3) {
            System.out.println("For seka: " + i);
        }

        while (nr1 >= nr2) {
            System.out.println("while seka:" + nr1);
            nr1 -= 3;
        }

    }
}
