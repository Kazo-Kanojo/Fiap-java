package br.com.fiap.main;
import br.com.fiap.entities.Client;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteSistema {

    static String texto( String j) {
        return JOptionPane.showInputDialog(j);
    }
    static int Inteiro(String j){
      return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double Real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        Client objCliente = new Client();
        Produto objProduto = new Produto();
        Endereco objEndereco = new Endereco();

        //=========entradas========


        //entradas do objeto cliente
        objCliente.setNome(texto("Coloque o seu nome: "));
        objCliente.setAltura(Real("Coloque a sua altura: "));
        objCliente.setCpf(texto("Coloque o seu cpf: "));
        objCliente.setIdade(Inteiro("Coloque a sua idade: "));

        //Entradas endereço do cliente
        objEndereco.setBairro(texto(texto("Coloque seu bairro: ")));
        objEndereco.setCep(texto("Coloque seu cep: "));
        objEndereco.setCidade(texto("Coloque a cidade: "));
        objEndereco.setComplemento(texto("Coloque o complemento: "));
        objEndereco.setLogradouro(texto("Coloque o logradouro: "));
        objEndereco.setNumero(Inteiro("Numero da casa: "));
        objEndereco.setEstado(texto("Coloque o seu estado: "));

        objCliente.setEndereco(objEndereco);

        //entradas do objeto produto
        objProduto.setTipo(texto("Coloque o nome do produto: "));
        objProduto.setCodigo(Inteiro("Coloque o cógigo do produto: "));
        objProduto.setMarca(texto("COloque o nome da marca: "));
        objProduto.setPreco(Real("Coloque o valor do produto"));


        //=======saidas========


        System.out.println(objCliente + "\n" + objProduto);

    }
}
