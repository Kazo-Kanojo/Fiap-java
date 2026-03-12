Projeto de Cadastro: Cliente e Produto
Este é um projeto acadêmico desenvolvido em Java que tem como objetivo simular o cadastro e a exibição de dados de um Cliente (incluindo seu Endereço) e de um Produto. O sistema utiliza a biblioteca javax.swing.JOptionPane para interagir com o usuário por meio de interfaces gráficas simples (caixas de diálogo) e exibe o resumo dos dados no console.

🛠️ Tecnologias Utilizadas
Java (JDK): Linguagem principal do desenvolvimento.

Swing (JOptionPane): Para captura de entrada de dados do usuário.

Orientação a Objetos: Utilização de conceitos como encapsulamento, composição (Cliente tem um Endereço) e métodos de formatação (toString).

📁 Estrutura do Projeto
O código-fonte está organizado em pacotes, separando as entidades de domínio da classe de execução principal:

br.com.fiap.entities: Contém as classes de modelo (Entidades).

Client.java: Modela as informações do cliente (nome, CPF, idade, altura) e faz composição com a classe Endereco.

Endereco.java: Contém os dados de localização (logradouro, número, complemento, CEP, bairro, cidade, estado).

Produto.java: Representa um item/produto (código, tipo, marca, preço).

br.com.fiap.main: Contém as classes que executam o programa.

TesteSistema.java: É a classe principal (Main). Ela contém funções utilitárias para conversão de dados (Inteiro, Real, texto) e orquestra a coleta de informações usando JOptionPane, instanciando os objetos e imprimindo o resultado no console.

Main.java: Uma classe secundária vazia.

🚀 Como Executar o Projeto
Pré-requisitos: Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

Clone o repositório ou baixe os arquivos fonte.

Abra o projeto em uma IDE (como IntelliJ IDEA, Eclipse ou VS Code). O projeto já possui a estrutura de configuração do IntelliJ (.idea e arquivos .iml).

Localize a classe TesteSistema no caminho src/br.com.fiap/main/TesteSistema.java.

Execute o método main desta classe.

Interação:

O programa começará a exibir janelas pop-up pedindo para você inserir os dados do Cliente (nome, altura, cpf, idade).

Em seguida, solicitará os dados de Endereço.

Por fim, pedirá os dados do Produto.

Após preencher todas as janelas, abra o console/terminal da sua IDE para visualizar as informações formatadas dos objetos instanciados.

📌 Funcionalidades
Cadastro Dinâmico: O usuário preenche todos os atributos dos objetos em tempo de execução.

Tratamento de Tipos: Métodos personalizados na classe TesteSistema que convertem automaticamente as Strings recebidas pelo JOptionPane para int e double.

Sobrescrita do toString(): Facilita a visualização dos dados dos objetos diretamente pelo comando System.out.println.