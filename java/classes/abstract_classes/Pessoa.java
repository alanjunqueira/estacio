package abstract_classes;

abstract class Pessoa {
  protected int identificador;

  public Pessoa(int identificador) {
    this.identificador = identificador;
  }

  public abstract void atualizarId();

  public int recuperarId() {
    return identificador;
  }
}


final class PessoaFisica extends Pessoa {
  private String cpf;

  public PessoaFisica(int identificador, String cpf) {
    super(identificador);
    this.cpf = cpf;
  }

  @Override
  public void atualizarId() {
    identificador = identificador + 1;
  }

  public String recuperarCpf() {
    return cpf;
  }
}