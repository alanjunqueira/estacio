package general;
public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void inserirNome(String nn) {
        nome = nn;
    }

    public String recuperarNome() {
        return nome;
    }

    public void definirIdade(int idade) {
        this.idade = idade;
    }

    public int recuperarIdade() {
        return idade;
    }

    public static void main(String args[]) {
        Aluno a = new Aluno("Pessoa", 20);
        a.inserirNome("Pessoa");
        System.out.println("saida: " + a.recuperarNome());
    }
}