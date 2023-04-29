package files.AulasCode;

public class Loops {
  public static void main(String[] args) {
    int x = 10; // Variável de controle

    System.out.println("\nLoops.java");

    System.out.println("\n10 á 0 com while"); // 10 á 0 com while
    while (x > 0) {
      System.out.println(x);
      x--;
    }

    System.out.println("");

    System.out.println("0 á 10 com for\n"); // 0 á 10 com for
    for (x = 0; x < (10 + 1); x++) {
      System.out.println(x);
    }

    System.out.println("");

    System.out.println("0 á 10 com do while\n"); // 0 á 10 com do while
    x = 0;
    do {
      System.out.println(x);
      x++;
    } while (x < (10 + 1));
  }
}