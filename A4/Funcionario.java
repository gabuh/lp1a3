package A4;

import java.util.Date;

public class Funcionario{
  
  private String nome;
  private int id;
  private double salario;
  private Date horaEntrada;
  private Date horaSaida;

  

  public Funcionario(String nome, int id, double salario, Date horaEntrada, Date horaSaida) {
    this.nome = nome;
    this.id = id;
    this.salario = salario;
    this.horaEntrada = horaEntrada;
    this.horaSaida = horaSaida;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Funcionario other = (Funcionario) obj;
    if (id != other.id)
      return false;
    return true;
  }


  public String getNome() {
    return nome;
  }


  public void setNome(String nome) {
    this.nome = nome;
  }


  public int getId() {
    return id;
  }


  public void setId(int id) {
    this.id = id;
  }


  public double getSalario() {
    return salario;
  }


  public void setSalario(double salario) {
    this.salario = salario;
  }


  public Date getHoraEntrada() {
    return horaEntrada;
  }


  public void setHoraEntrada(Date horaEntrada) {
    this.horaEntrada = horaEntrada;
  }


  public Date getHoraSaida() {
    return horaSaida;
  }


  public void setHoraSaida(Date horaSaida) {
    this.horaSaida = horaSaida;
  }
  
}


//nome, um ID, um salário, hora de entrada e hora de saída. Sua tarefa é criar uma classe Departamento que permita adicionar e listar funcionários.