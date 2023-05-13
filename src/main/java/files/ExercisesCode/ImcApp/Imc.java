package files.ExercisesCode.ImcApp;

public class Imc {
  public double peso;
  public double altura;

  public Imc(double peso, double altura) {
    this.peso = peso;
    this.altura = altura;
  }

  public double calculateImc() {
    return this.peso / (this.altura * this.altura);
  }

  public void imcClassification(double imc) {
    if (imc < 18.5) {
      System.out.println(" (Abaixo do peso)");
    } else if (imc < 25) {
      System.out.println(" (Peso normal)");
    } else if (imc < 30) {
      System.out.println(" (Sobrepeso)");
    } else if (imc < 35) {
      System.out.println(" (Obesidade grau 1)");
    } else if (imc < 40) {
      System.out.println(" (Obesidade grau 2)");
    } else {
      System.out.println(" (Obesidade grau 3)");
    }
  }
}
