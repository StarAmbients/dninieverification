package app;
import java.util.Scanner;

public class WebNieVerificationApplication {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o DNI ou NIE: ");
    String nie = scanner.nextLine();

    char letraVerificacion = calcularLetraVerificacion(nie);
    System.out.println("Letra de verificación: " + letraVerificacion);

    scanner.close();
  }
  public static char calcularLetraVerificacion(String nie) {
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    char primeiroCaractere = Character.toUpperCase(nie.charAt(0));
    switch (primeiroCaractere)  {
      case 'X':
        primeiroCaractere = '0';
        nie = nie.substring(1);
        break;
      case 'Y':
        primeiroCaractere = '1';
        nie = nie.substring(1);
        break;
      case 'Z':
        primeiroCaractere = '2';
        nie = nie.substring(1);
        break;
      default:
        primeiroCaractere = '0';
    }

    String resultado = primeiroCaractere + nie;

    int valor = Integer.parseInt(resultado);
    valor = valor % 23;
    return letras.charAt(valor);
  }
}
