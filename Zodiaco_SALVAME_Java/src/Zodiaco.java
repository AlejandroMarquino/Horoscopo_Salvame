import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Zodiaco {

    public static void devolver_sagitario() {
        String[] Sagitario = new String[]{"Paz Padilla", "Leticia Dolera", "Pablo Iglesias", "Ayuso"};
        int indiceSagitario = numeroAleatorioSagitario(0, Sagitario.length - 1);
        String sagitarioAleatorio = Sagitario[indiceSagitario];
        System.out.println(sagitarioAleatorio);
    }
    public static int numeroAleatorioSagitario(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void devolver_piscis() {
        String[] Piscis = new String[]{"Ángela Portero", "Josema Yuste", "Aznar", "Julio José Iglesias"};
        int indicePiscis = numeroAleatorioPiscis(0, Piscis.length - 1);
        String piscisAleatorio = Piscis[indicePiscis];
        System.out.println(piscisAleatorio);
    }
    public static int numeroAleatorioPiscis(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void devolver_acuario() {
        String[] Acuario = new String[]{"Rosa Benito", "Barbara Rey", "Felipe VI", "Sara Carbonero"};
        int indiceAcuario = numeroAleatorioAcuario(0, Acuario.length - 1);
        String acuarioAleatorio = Acuario[indiceAcuario];
        System.out.println(acuarioAleatorio);
    }
    public static int numeroAleatorioAcuario(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void devolver_aries() {
        String[] Aries = new String[]{"Gema López", "M. Rajoy", "Bustamante", "Miguel Bosé"};
        int indiceAries = numeroAleatorioAries(0, Aries.length - 1);
        String ariesAleatorio = Aries[indiceAries];
        System.out.println(ariesAleatorio);
    }
    public static int numeroAleatorioAries(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void devolver_cancer() {
        String[] Cancer = new String[]{"Chenoa", "Javier Ambrossi", "M.A.M", "Mario Vaquerizo"};
        int indiceCancer = numeroAleatorioCancer(0, Cancer.length - 1);
        String cancerAleatorio = Cancer[indiceCancer];
        System.out.println(cancerAleatorio);
    }
    public static int numeroAleatorioCancer(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void devolver_capricornio() {
        String[] Capricornio = new String[]{"Kiko Matamoros", "Gustavo Gonzalez", "Jesulín", "Esperanza Aguirre"};
        int indiceCapricornio = numeroAleatorioCapricornio(0, Capricornio.length - 1);
        String capricornioAleatorio = Capricornio[indiceCapricornio];
        System.out.println(capricornioAleatorio);
    }
    public static int numeroAleatorioCapricornio(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void devolver_escorpio() {
        String[] Escorpio = new String[]{"Paz Padilla", "Leticia Dolera", "Pablo Iglesias", "Ayuso"};
        int indiceEscorpio = numeroAleatorioEscorpio(0, Escorpio.length - 1);
        String escorpioAleatorio = Escorpio[indiceEscorpio];
        System.out.println(escorpioAleatorio);
    }
    public static int numeroAleatorioEscorpio(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void devolver_geminis() {
        String[] Geminis = new String[]{"Alaska", "Bisbal", "Monica Naranjo", "Rosa Diez"};
        int indiceGeminis = numeroAleatorioGeminis(0, Geminis.length - 1);
        String geminisAleatorio = Geminis[indiceGeminis];
        System.out.println(geminisAleatorio);
    }
    public static int numeroAleatorioGeminis(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void devolver_leo() {
        String[] Leo = new String[]{"Jorge Javier Vazquez", "Maria Patiño"};
        int indiceLeo = numeroAleatorioLeo(0, Leo.length - 1);
        String leoAleatorio = Leo[indiceLeo];
        System.out.println(leoAleatorio);
    }
    public static int numeroAleatorioLeo(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void devolver_libra() {
        String[] Libra = new String[]{"Terelu Campos", "Amaia Montero", "Shaila Dúrcal", "Pablo Motos"};
        int indiceLibra = numeroAleatorioLibra(0, Libra.length - 1);
        String libraAleatorio = Libra[indiceLibra];
        System.out.println(libraAleatorio);
    }
    public static int numeroAleatorioLibra(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void devolver_tauro(){
        String[] Tauro = new String[]{"Mila Ximenez", "Raphael", "Infanta Sofía", "Marta Sanchez", "Lolita", "Rociito"};
        int indiceTauro = numeroAleatorioTauro(0, Tauro.length - 1);
        String tauroAleatorio = Tauro[indiceTauro];
        System.out.println(tauroAleatorio);
    }
    public static int numeroAleatorioTauro(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void devolver_virgo(){
        String[] Virgo = new String[]{"Terelu Campos", "Amaia Montero", "Shaila Dúrcal", "Pablo Motos"};
        int indiceVirgo = numeroAleatorioVirgo(0, Virgo.length - 1);
        String virgoAleatorio = Virgo[indiceVirgo];
        System.out.println(virgoAleatorio);
    }
    public static int numeroAleatorioVirgo(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }































}

