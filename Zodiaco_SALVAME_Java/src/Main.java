import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int day, month;
        Scanner user_scann = new Scanner(System.in);

        Zodiaco aries = new Zodiaco();
        Zodiaco tauro = new Zodiaco();
        Zodiaco geminis = new Zodiaco();
        Zodiaco cancer = new Zodiaco();
        Zodiaco leo = new Zodiaco();
        Zodiaco virgo = new Zodiaco();
        Zodiaco libra = new Zodiaco();
        Zodiaco escorpio = new Zodiaco();
        Zodiaco sagitario = new Zodiaco();
        Zodiaco capricornio = new Zodiaco();
        Zodiaco acuario = new Zodiaco();
        Zodiaco piscis = new Zodiaco();

        System.out.println("¿Cual es tu día de nacimiento?");
        day = user_scann.nextInt();
        System.out.println("¿Cual es tu mes de nacimiento? (formato numérico)");
        month = user_scann.nextInt();

        if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            System.out.println("Enhorabuena, eres Aries como ... ");
            aries.devolver_aries();
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            System.out.println("Enhorabuena, eres Tauro como ... ");
            tauro.devolver_tauro();
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 21)) {
            System.out.println("Enhorabuena, eres Géminis como ... ");
            geminis.devolver_geminis();
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 23)) {
            System.out.println("Enhorabuena, eres Cáncer como ... ");
            cancer.devolver_cancer();
        } else if ((month == 7 && day >= 24) || (month == 8 && day <= 23)) {
            System.out.println("Enhorabuena, eres Leo como ... ");
            leo.devolver_leo();
        } else if ((month == 8 && day >= 24) || (month == 9 && day <= 23)) {
            System.out.println("Enhorabuena, eres Virgo como ... ");
            virgo.devolver_virgo();
        } else if ((month == 9 && day >= 24) || (month == 10 && day <= 23)) {
            System.out.println("Enhorabuena, eres Libra como ... ");
            libra.devolver_libra();
        } else if ((month == 10 && day >= 24) || (month == 11 && day <= 22)) {
            System.out.println("Enhorabuena, eres Escorpio como ... ");
            escorpio.devolver_escorpio();
        } else if ((month == 11 && day >= 23) || (month == 12 && day <= 21)) {
            System.out.print("Enhorabuena, eres Sagitario como ... ");
            sagitario.devolver_sagitario();
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 20)) {
            System.out.println("Enhorabuena, eres Capricornio como ... ");
            capricornio.devolver_capricornio();
        } else if ((month == 1 && day >= 21) || (month == 2 && day <= 19)) {
            System.out.println("Enhorabuena, eres Acuario como ... ");
            acuario.devolver_acuario();
        } else {
            System.out.println("Enhorabuena, eres Piscis como ... ");
            piscis.devolver_piscis();
        }


    }



}








