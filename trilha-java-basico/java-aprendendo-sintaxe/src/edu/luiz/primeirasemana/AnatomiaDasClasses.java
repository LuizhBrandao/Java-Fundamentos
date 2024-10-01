package edu.luiz.primeirasemana;

public class AnatomiaDasClasses {

//Padrão de nomenclatura
    String BR = "Brasil";
    double PI = 3.14;
    int ESTADOS_BRASILEIRO = 27;
    int ANO_2000 = 2000

    // Declação inválida de variáveis

    int numero&um = 1; //Os únicos símbolos permitidos são _ e $
    int 1numero = 1;    //Uma variável não pode começar com númerico
    int numero um = 1; //Não pode ter espaço no nome da variável
    int long = 1; //long faz parte das palavras reservadas da linguagem
 
    // Declaração válida de veriáveis
    int numero$um = 1;
    int numero1 = 1;
    int numeroum = 1;
    int longo = 1;

//Declarando variáveis e métodos

    // Estrutura

    Tipo NomeBemDefinido = Atribuição (opcional em alguns casos);

    // Exemplo

    int idade = 30;
    double altura = 1.70;
    Dog bummer; //observe que aqui a variável spike não tem valor, é normal

    // Estrutura

    TipoRetorno NomeObjetivoNoInfinitivo Parametro(s);

    //Exemplo

    int somar (int numeroUm, int numero2);

    String formatarCep (long cep)

//Java Beans

    //Não recomendado
    double salMedio = 1500.23;  //variável abreviada, o que dificulta a compreensão
    String emails = "aluno@escola.com"; //confuso se a variável seria um array ou único e-mail
    String myName = "LUIZ"; //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 

    //Recomendado
    double salarioMedio=1500.23;
    String email ="aluno@escola.com";
    String [] emails = {"aluno@escola.com","professor@escola.com"};
    String meuNome = "LUIZ";
		
    //Métodos
    somar(int n1, int n2){}

    abrirConexao(){}

    concluirProcessamento() {}

    findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

    calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
    
}
