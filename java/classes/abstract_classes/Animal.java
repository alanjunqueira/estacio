package abstract_classes;

abstract class Animal {
  // metodo abstrato
  public abstract void emitirSom();

  // metodo concreto
  public void dormir() {
    System.out.println("Zzzz...");
  }
}
