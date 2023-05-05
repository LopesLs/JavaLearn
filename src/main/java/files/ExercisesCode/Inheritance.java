// Descrição: Crie uma classe Animal, depois crie classes filhas a partir desta classe. Exemplo: humanos, macacos, tigres... A classe Animal deve ter um método e as classes filhas devem sobrescrever esse método.

package files.ExercisesCode;

public class Inheritance {
  public static void main(String[] args) {
    
    // Introduzindo o programa para o usuário
    System.out.println("\n> Inheritance.java");
    System.out.println("Este é um programa que demonstra o conceito de herança em Java.\n");
    
    Animal animal = new Animal();
    animal.eat();

    Dog dog = new Dog();
    dog.eat();

    Cat cat = new Cat();
    cat.eat();
  }
}

class Animal {
  public void eat() {
    System.out.println("As an animal i can eat");
  }

  public void sleep() {
    System.out.println("As an animal i can sleep");
  }

  public void whatAmI() {
    System.out.println("I am an animal");
  }
}

class Dog extends Animal {
  public void bark() {
    System.out.println("As a Dog i can bark");
  }

  public void eat() {
    System.out.println("As a Dog i can eat");
  }

  public void whatAmI() {
    System.out.println("I am a dog");
  }
}

class Cat extends Animal {
  public void meow() {
    System.out.println("As a Cat i can meow");
  }

  public void eat() {
    System.out.println("As a Cat i can eat");
  }

  public void whatAmI() {
    System.out.println("I am a cat");
  }
}