package br.com.fiap.entities;

public class Client {

    //visibilidade, tipo de dado, atributo
    private String nome;
    private String cpf;
    private int idade;
    private double altura;
    private Endereco endereco;

    //metodos getters e setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setAltura(double altura) {

        this.altura = altura;
    }
    public  void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente" +
                "\nnome='" + nome + '\'' +
                "\n, cpf='" + cpf + '\'' +
                "\n, idade=" + idade +
                "\n, altura=" + altura + endereco;

    }
}






