package br.com.fiap.entities;

public class Produto {
    //visibilidade, tipo de dado, atributo
    private int codigo;
    private String tipo;
    private String marca;
    private double preco;



    //metodos setter e getters}


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    //sobrescrever as informacões


    @Override
    public String toString() {
        return "Produto{" +
                " \ncodigo=" + codigo +
                ", \ntipo='" + tipo + '\'' +
                ", \nmarca='" + marca + '\'' +
                ", \npreco=" + preco +
                '}';
    }
}