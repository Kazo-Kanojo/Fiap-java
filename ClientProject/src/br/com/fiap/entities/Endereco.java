package br.com.fiap.entities;

public class Endereco {
    //visibilidade, tipo de dado, atributo

    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    //metodos setter e getters}

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //sobrescrever as informacões

    @Override
    public String toString() {
        return "\nENDEREÇO{" +
                "\nlogradouro='" + logradouro + '\'' +
                ", \nnumero=" + numero +
                ", \ncomplemento='" + complemento + '\'' +
                ", \ncep='" + cep + '\'' +
                ", \nbairro='" + bairro + '\'' +
                ", \ncidade='" + cidade + '\'' +
                ", \nestado='" + estado + '\'' +
                '}';
    }
}
