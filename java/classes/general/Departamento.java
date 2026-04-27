package general;
public class Departamento {
  private String nome;
  public Departamento(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return this.nome;
  }
  public static void main(String args[]) {
    Departamento d = new Departamento("Departamento de Matemática");
    System.out.println(d.getNome());
  }
}
