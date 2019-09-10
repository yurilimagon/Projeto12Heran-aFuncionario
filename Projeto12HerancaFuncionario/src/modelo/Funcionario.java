/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Funcionario {
    
    //Inicialmente os ATRIBUTOS serão PRIVATE
    //Mudar os modificadores dos atributos
    //para PROTECTED de modo que esses atributos
    //da classe Funcionario (PAI) tenham
    //visibilidade dentro da hierarquia de Herança
    //na classe Gerente
    protected String nome;
    protected double salario;
    protected String cpf;

    //CONSTRUTORES
    //VAZIO
    public Funcionario() {
    }
    
    //CHEIO
    public Funcionario(String nome, double salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }
    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getInformacao() {
        return "Funcionário: " + this.nome +
               " Recebe: " + this.salario;
    }
    
    public double getBonificacao() {
        return this.salario * 0.10;
    }
    
}
