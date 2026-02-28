package br.com.fiap.main;
import br.com.fiap.entities.Client;

import javax.swing.*;

public class Teste {

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

        objCliente.setNome(texto("Coloque o seu nome: "));
        objCliente.setAltura(Real("Coloque a sua altura: "));
        objCliente.setCpf(texto("Coloque o seu cpf: "));
        objCliente.setIdade(Inteiro("Coloque a sua idade: "));

        System.out.println(objCliente);

    }
}
