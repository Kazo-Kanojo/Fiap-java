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
        objEndereco.setEstado(texto("Coloque o seu estado"));
        objEndereco.setNumero(Inteiro("Coloque o seu numero"));
        objEndereco.setLogradouro(texto("Coloque o seu logradouro"));
        objEndereco.setCep(texto("COloque o seu cep"));
        objEndereco.setCidade(texto("COloque a sua cidade:"));
        objEndereco.setComplemento(texto("Coloque o seu Complemento"));
        objEndereco.setBairro(texto("Coloque o seu bairro"));


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
