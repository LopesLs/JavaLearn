package files.AulasCode;

public class Introduction {
    public static void main(String[] args) {
        // Entrada de dados
        String name = "Carlos";
        int age = 17;
        double height = 1.7; 
        boolean hireInfo = false;
        
        // Saída de dados
        System.out.println("\nIntroduction.java");

        System.out.printf("\nHello, my name is %s and I'm %d years old.\n", name, age); // %s = string e %d = int
        System.out.printf("I'm %.2f meters tall.\n", height); // %.2f = 2 casas     decimais
        System.out.printf("I'm looking for a job: %b\n", hireInfo); // %b = boolean
    }
}
