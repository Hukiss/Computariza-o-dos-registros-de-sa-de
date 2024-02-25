import HealthProfile.Healthprofile;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n...Resgistrar...");

        System.out.print("Nome: ");             String nome = scanner.next();
        System.out.print("Sobrenome: ");        String sobreNome = scanner.next();
        System.out.print("Gênero: ");           String gender = scanner.next();
        System.out.print("Dia: ");              int dia = scanner.nextInt();
        System.out.print("Mês: ");              int mes = scanner.nextInt();
        System.out.print("Ano: ");              int ano = scanner.nextInt();
        System.out.print("Altura: ");           double height = scanner.nextDouble();
        System.out.print("Peso: ");             double weight = scanner.nextDouble();

        Healthprofile heartRades = new Healthprofile(nome, sobreNome, gender, height, weight ,dia, mes, ano);

        System.out.println(heartRades.toString());

    }
}
