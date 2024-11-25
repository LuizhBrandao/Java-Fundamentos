🚀 **Fundamentos do Java** 🚀

**Java** é uma linguagem de programação de alto nível, orientada a objetos, desenvolvida pela Sun Microsystems (agora parte da Oracle). É amplamente usada para desenvolvimento de aplicações corporativas, móveis (principalmente Android), desktop e sistemas distribuídos.

* * *

### 🧩 **Características do Java**:

1. **Portabilidade**: O código Java é compilado para **bytecode**, que pode ser executado em qualquer máquina com a **Java Virtual Machine (JVM)**, tornando-o multiplataforma ("**Write Once, Run Anywhere**").
2. **Orientação a Objetos**: Java segue o paradigma da **Programação Orientada a Objetos (POO)**.
3. **Robustez**: Gerenciamento automático de memória (coleta de lixo), tratamento de exceções e verificação de tipos em tempo de compilação.
4. **Segurança**: Implementa mecanismos para evitar acesso não autorizado à memória e possui uma estrutura de segurança bem definida.
5. **Multithreading**: Suporte nativo para execução de múltiplas threads, facilitando o desenvolvimento de aplicações concorrentes.
6. **Biblioteca Padrão (API)**: Possui uma rica coleção de bibliotecas para lidar com I/O, rede, estruturas de dados, interfaces gráficas, entre outros.

* * *

### 📝 **Conceitos Básicos**:

#### 1. **Sintaxe**:

A estrutura básica de um programa Java é composta por **classes** e **métodos**.

Código:

    public class HelloWorld {

        public static void main(String[] args) {

            System.out.println("Olá, Mundo!");

    }

}

* **`class`**: Define uma classe.
* **`main`**: Método principal onde a execução do programa começa.
* **`System.out.println`**: Imprime uma mensagem no console.

* * *

#### 2. **Tipos de Dados**:

Java possui tipos de dados **primitivos** e **referência**:

**Tipos Primitivos**:

* **Inteiros**: `byte`, `short`, `int`, `long`
* **Ponto Flutuante**: `float`, `double`
* **Caractere**: `char`
* **Booleano**: `boolean` (`true` ou `false`)

    **Exemplo**: Código

int idade = 25;

double altura = 1.75;

char letra = 'A';

boolean ativo = true;`

**Tipos de Referência**:

* Referenciam objetos, como instâncias de classes (`String`, `Array`, etc.).

* * *

#### 3. **Variáveis**:

* **Variáveis locais**: Declaradas dentro de métodos e blocos.
* **Variáveis de instância (atributos)**: Declaradas dentro de uma classe, mas fora dos métodos.
* **Variáveis estáticas (de classe)**: Compartilhadas entre todos os objetos da classe.

* * *

#### 4. **Operadores**:

Java oferece vários tipos de operadores, incluindo:

* **Aritméticos**: `+`, `-`, `*`, `/`, `%`
* **Comparação**: `==`, `!=`, `>`, `<`, `>=`, `<=`
* **Lógicos**: `&&`, `||`, `!`
* **Atribuição**: `=`, `+=`, `-=`, `*=`

* * *

#### 5. **Controle de Fluxo**:

* **Condicionais**:   Código:    if (idade >= 18) {        System.out.println("Maior de idade");     } else {        System.out.println("Menor de idade");     }

* **Laços de repetição**:Código:

for (int i = 0; i < 5; i++) {    System.out.println(i);

}

while (contador < 10) {

    contador++;

}

* * *

#### 6. **Arrays**:

Um **array** é uma estrutura que armazena múltiplos valores do mesmo tipo.

Código:

int[] numeros = {1, 2, 3, 4, 5};

System.out.println(numeros[0]); // Acessa o primeiro elemento

* * *

### 🏗️ **Programação Orientada a Objetos (POO)**:

Os pilares fundamentais da POO em Java incluem:

1. **Encapsulamento**: Proteger dados usando modificadores de acesso.
2. **Herança**: Criar classes a partir de outras (reutilização de código).
3. **Polimorfismo**: Permitir que objetos de diferentes classes sejam tratados como objetos de uma superclasse.
4. **Abstração**: Esconder detalhes complexos e mostrar apenas as funcionalidades essenciais.

* * *

### 📦 **Pacotes e Importação**:

* **Pacotes**: Organizam classes relacionadas em grupos.Código`package meu.pacote;`
  
* **Importação**: Permite usar classes de outros pacotes.Código`import java.util.Scanner;`
  

* * *

### 🌐 **Biblioteca Padrão Java (API)**:

Inclui classes e métodos para tarefas comuns, como manipulação de strings, coleções (listas, conjuntos), tratamento de exceções e operações de I/O.

* **Pacote `java.lang`**: Contém classes fundamentais (ex: `String`, `Math`, `System`).
* **Pacote `java.util`**: Classes utilitárias, como coleções (`ArrayList`, `HashMap`).

* * *

### 💡 **Resumo**:

* **Java** é uma linguagem robusta, segura e orientada a objetos.
* **Fundamentos** incluem sintaxe básica, tipos de dados, variáveis, operadores e controle de fluxo.
* **POO** e a vasta biblioteca padrão são a base para o desenvolvimento em Java.

Esses conceitos formam a base para entender e desenvolver aplicações em Java! 🚀
