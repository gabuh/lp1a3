Suponha que você esteja criando um sistema de gerenciamento de funcionários de uma
empresa organizados em departamentos. 

- [x] Cada funcionário tem um nome, um ID, um salário, hora de entrada e hora de saída. 


Sua tarefa é criar uma classe Departamento que permita adicionar e listar funcionários.

- [x] Para isso, crie uma classe Funcionario que represente um funcionário da empresa. Crie três classes que herdam de funcionários: Gerente, Programador e Analista.

- [x] Crie um interface que define os métodos entrada e saída que recebam a hora de entrada e saída do funcionário, 

- [x] implemente essa interface para as classes Programador e Analista, mas não para Gerente, fazendo a atribuição da hora de entrada e hora de saída ao funcionário.

- [ ] Além disso, você deve implementar o método equals na classe Funcionario para que ele compare dois funcionários com base em seus IDs. Para isso, você pode usar a classe Object, já que todos os objetos em Java herdam dela.


- [ ] Em seguida, crie uma classe Departamento que use Generics para permitir que ela manipule um lista de qualquer tipo de Funcionário que implemente Ponto e outra lista que permita apenas gerente. 

- [ ] A classe Departamento deve ter um método adicionarFuncionario que aceite um objeto do tipo Funcionario e um do tipo Gerente um método listarFuncionarios que retorne uma lista de objetos do tipo Funcionario e um listarAtrasados que retorne uma lista de objetos que tem hora de entrada maior que uma especificada.

- [ ] Por fim, crie algumas classes concretas que estendem Funcionario, como Gerente, Programador e Analista. Crie alguns objetos dessas classes e adicione-os à lista da empresa. Em seguida, liste os funcionários para verificar se a empresa está armazenando e manipulando corretamente os diferentes tipos de funcionários, adicione entradas no Ponto e liste os atrasados.

Dica: Para usar Generics, utilize <T> na declaração da classe Departamento, e use
List<T> para permitir que a empresa possa manipular qualquer tipo de funcionário.


```mermaid
classDiagram

class Funcionario{
  <<Abstract>>
  - nome : String
  - id : int
  - salario : double
  - horaEntrada : Date
  - horaSaida: Date

  + hashCode() int
  + equals(Object obj) boolean
}

class Gerente{
  
}

class Programador{
  
}

class Analista{
  
}

class Ponto{
  <<Interface>>
  + entradaFuncionario() void
  + saidaFuncionario() void
}

class Departamento{
  - funcionarios : List<>
  - gerentes: List
  
  + adicionarFuncionario<U>() : void 
  + listarFuncionarios() : void
  + listarAtrasados(): void
  
}

Funcionario <|-- Gerente : extends
Funcionario <|-- Programador : extends
Funcionario <|-- Analista : extends

Programador <|-- Ponto : implements
Analista <|-- Ponto : implements


```