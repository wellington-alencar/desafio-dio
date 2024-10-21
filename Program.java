import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o XP do Herói: ");
        Double xp = input.nextDouble();


        if (xp != null == xp <= 1000) {
            System.out.println("Heroi = Ferro");
        } else if (xp >= 1001 && xp <= 2000) {
            System.out.println("Heroi = Bronze");
        } else if (xp >= 2001 && xp <= 5000) {
            System.out.println("Heroi = Prata");
        } else if (xp >= 5001 && xp <= 7000) {
            System.out.println("Heroi = Ouro");
        } else if (xp >= 7001 && xp<= 8000) {
            System.out.println("Heroi = Platina");
        }else if (xp >= 8001 && xp <= 9000){
            System.out.println("Heroi = Ascendente");
        } else if (xp >= 9001 && xp<= 10000) {
            System.out.println("Heroi = Imortal");
        } else if (xp >= 10001) {
            System.out.println("Heroi = Radiante");
        }

    }
}
