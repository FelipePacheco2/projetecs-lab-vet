package Dominio;

public class Colaborador extends AbsPessoaFisica{
    private Double salario;
    private String matricula;

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Colaborador(){
        super();
    }

    public Colaborador(String nome, double salario, String matricula){
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }
}
