import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight;
        double height;
        System.out.println("Podaj swoją wagę.");
        Scanner weightt = new Scanner(System.in);
        weight = weightt.nextDouble();
        System.out.println("Podaj swój wzrost. Przykład: \"1,8\"");
        Scanner heightt = new Scanner(System.in);
        height = heightt.nextDouble();
        double bMI = weight/(height*height);
        if (bMI > 18.4 && bMI < 25){
            System.out.println("Waga prawidłowa. Twoje BMI to: " + bMI);
        } else if (bMI < 18.5){
            System.out.println("Niedowaga. Twoje BMI to: " + bMI);
        }else if (bMI > 24.9){
            System.out.println("Nadwaga. Twoje BMI to: " + bMI);
        }else {
            System.out.println("Jesteś kosmitą.");
        }
    }
}
