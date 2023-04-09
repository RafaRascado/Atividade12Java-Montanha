// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    
    System.out.println("Olá, informe sua altura que vamos calcular o seu peso ideal: ");
    Scanner tecladoAltura = new Scanner(System.in);
    double altura = tecladoAltura.nextFloat();

    double pesoIdeal = (72.7 * altura) - 58;

    System.out.println("O seu peso ideial com base na altura é:" + pesoIdeal);
  }
}