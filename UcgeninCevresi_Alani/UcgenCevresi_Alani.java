import java.util.Scanner;
public class UcgenCevresi_Alani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1.Kenarı Giriniz:");
        int k1 = input.nextInt();
        System.out.print("2.Kenarı Giriniz:");
        int k2 = input.nextInt();
        System.out.print("3.Kenarı Giriniz:");
        int k3 = input.nextInt();

        double u;
        u = (k1 + k2 +k3)/2;
        System.out.println("Üçgenin Çevresi:" + u);

        double alan;
        alan = Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));
        System.out.println("Üçgenin Alanı:" + alan);
    }
}
