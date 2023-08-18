package com.trybe.java.regraprogressao;


import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int limitActive = Integer.parseInt(sc.nextLine());

    float acc = 0;
    int burden = 0;
    for (int index = 0; index < limitActive; index++) {
      System.out.println("Digite o nome da atividade " + (index + 1) + ":");
      String key = sc.nextLine();

      System.out.println("Digite o peso da atividade " + (index + 1) + ":");
      int value = Integer.parseInt(sc.nextLine());

      System.out.println("Digite a nota obtida para " + (key) + ":");
      int note = Integer.parseInt(sc.nextLine());

      acc += value * note;
      burden += value;
    }
    sc.close();

    float result = acc / burden;

    if (result >= 85) {
      System.out.println("Parabéns! Você alcançou " + result
          + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, " + result
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}
