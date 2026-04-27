package grouping.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import general.Endereco;

class Escola {
  // Atributos
  private String nome, CNPJ;
  private Endereco endereco;
  private List<Departamento> departamentos;
  private List<Aluno> discentes;

  // Métodos
  public Escola(String nome, String CNPJ) {
    this.nome = nome;
    this.CNPJ = CNPJ;
    this.departamentos = new ArrayList<>();
    this.discentes = new ArrayList<>();
  }

  public void criarDepartamento(String nomeDepartamento) {
    departamentos.add(new Departamento(nomeDepartamento));
  }

  public void fecharDepartamento(Departamento departamento) {
    departamentos.remove(departamento);
  }

  public void matricularAluno(Aluno novoAluno) {
    discentes.add(novoAluno);
  }

  public void trancarMatriculaAluno(Aluno aluno) {
    discentes.remove(aluno);
  }

  public void agruparAlunos() {
    Map<String, List<Aluno>> agrupamento = new HashMap<>();
    for (Aluno a : discentes) {
      if (!agrupamento.containsKey(a.recuperarNaturalidade())) {
        agrupamento.put(a.recuperarNaturalidade(), new ArrayList<>());
      }
      agrupamento.get(a.recuperarNaturalidade()).add(a);
    }
    System.out.println("Resultado do agrupamento por naturalidade: " + agrupamento);
  }

  public void agruparAlunos2() {
    Map<String, List<Aluno>> agrupamento = discentes.stream()
        .collect(Collectors.groupingBy(Aluno::recuperarNaturalidade));
    System.out.println("Resultado do agrupamento por naturalidade: ");
    agrupamento.forEach((String chave, List<Aluno> lista) -> System.out.println(chave + " = " + lista));
  }

  public void agruparAlunos3(int a) {
    Map<String, Set<Aluno>> agrupamento = discentes.stream()
        .collect(Collectors.groupingBy(Aluno::recuperarNaturalidade, Collectors.toSet()));
    System.out.println("Resultado do agrupamento por naturalidade: ");
    agrupamento.forEach((String chave, Set<Aluno> conjunto) -> System.out.println(chave + " = " + conjunto));
  }

  public void agruparAlunos4(double a) {
    Map<String, Set<Aluno>> agrupamento = discentes.stream()
        .collect(Collectors.groupingBy(Aluno::recuperarNaturalidade, TreeMap::new, Collectors.toSet()));
    System.out.println("Resultado do agrupamento por naturalidade: ");
    agrupamento.forEach((String chave, Set<Aluno> conjunto) -> System.out.println(chave + " = " + conjunto));
  }
}