
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Araccınızın markasını belirtiniz : ");
        String marka = scn.nextLine();
        System.out.println("Araccınızın modelini belirtiniz : ");
        String model =scn.nextLine();
        System.out.println("Aracınız kilometrede kaç kuruş yakıyor :(lütfen nokta kullanın kullanın(.)(example = 3.20)) ");
        double ne_kadar_yakar = scn.nextDouble();
        System.out.println("Kaç kilometrelik bir yolculuk düşünüyorsunuz; (lütfen nokta kullanın kullanın(.)(example = 900.1050))");
        double kac_kilometre = scn.nextDouble();
        System.out.println("Markası "+marka +" ve modeli "+model +" olan aracınız ile ulaşmak istediğiniz hedefe varabilmek için " +(ne_kadar_yakar*kac_kilometre) +" TÜRK LİRASI harcamanız gerekmektedir.");

    }
    
}
