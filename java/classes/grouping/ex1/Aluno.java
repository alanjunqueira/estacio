package grouping.ex1;

public class Aluno {
  // Atributos
  private String matricula, nome, naturalidade;

  // Métodos
  public Aluno(String nome, String naturalidade) {
    this.nome = nome;
    this.naturalidade = naturalidade;
  }

  public String recuperarNaturalidade() {
    return naturalidade;
  }

  @Override
  public String toString() {
    return String.format("%s(%s)", nome, naturalidade);
  }
}