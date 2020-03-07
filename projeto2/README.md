# POO - projeto2

## Requistos do trabalho proposto

- [x] Escolher uma classe de seu projeto anterior (vendedor, produto, cliente, etc) com no mínimo
3 atributos e um atributo ID;

- [x] Implementar 1 cadastro contendo as operações: inserção, busca por id, remoção e listar
todos;

- [x] Seu menu deve contemplar as opções acima e todas as operações devem ser salvas em
arquivo.

> Sua aplicação deve ter duas opções de funcionamento:

  * Cliente/Servidor: Você terá duas aplicações:
    * Aplicação servidora
      - [x] Abrirá uma porta TCP e ficará aguardando as conexões;
      - [x] O servidor é o responsável por receber os comandos da aplicação cliente
relacionadas a opção que o cliente escolheu do menu;
      - [x] O servidor é o responsável por armazenar as alterações em arquivo;
      - [x] O servidor não possui menu, somente recebe os comandos relacionados às
opções do menu que o cliente escolheu;
    * Aplicação Cliente
      - [] Conecta ao servidor (porta e host configuráveis);
      - [x] Apresentará ao cliente o menu de opções;
      - [x] Cada opção selecionada pelo usuário deverá refletir em uma requisição ao
servidor, sendo a resposta lida e apresentada ao usuário;
      - [x] Não possui responsabilidade sobre o arquivo de dados (a aplicação servidora que
salva as alterações em arquivo).
  * Standalone
    - [x] Deve haver apenas uma aplicação, sem servidor e cliente;
    - [x] Essa aplicação deve apresentar um menu ao cliente;
    - [x] A manipulação dos arquivos é de sua responsabilidade.

- [x] Utilize Interfaces, Generics, Exceções e no mínimo um Padrão de Projeto;
- [x] Modele sua solução para reaproveitar código.

## Arquitetura da aplicação

![app architecture](https://raw.githubusercontent.com/thalysonalexr/POO/master/projeto2/docs/architecture.png)

## Credits

Made with ♥ by [Thalyson Rodrigues](https://www.linkedin.com/in/thalysonrodrigues/)