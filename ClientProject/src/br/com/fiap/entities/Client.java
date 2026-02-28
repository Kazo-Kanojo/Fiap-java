package br.com.fiap.entities;
public class Client {
    private String nome;
    private String cpf;
    private int idade;
    private double altura;

    // Metodos seteers
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

    //metodos getters
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


    @Override
    public String toString() {
        return "Client{" +
                "\nnome='" + nome + '\'' +
                "\n, cpf='" + cpf + '\'' +
                "\n, idade=" + idade +
                "\n, altura=" + altura +
                '}';
    }
}






