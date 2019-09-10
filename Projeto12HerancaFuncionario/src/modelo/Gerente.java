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
public class Gerente extends Funcionario {
    
    //ATRIBUTOS
    private String setor;
    private String senha;
    
    //CONSTRUTORES
    //VAZIO
    public Gerente() {
    }
    
    //CHEIO
    public Gerente(String setor, String senha, String nome, double salario, String cpf) {
        //Palavra reservada SUPER
        //this.nome = nome;
        //this.salario = salario;
        //this.cpf = cpf;
        super(nome, salario, cpf);
        this.setor = setor;
        this.senha = senha;
    }
    
    //GETTERS E SETTERS
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /*public String getNome() {
        return nome;
    }*/
    
    //Sobrecarga (OVERRIDE) permite o uso
    //do conceito de POLIMORFISMO de Orientação a Objetos
    //usando para isso a anotação @Override
    @Override
    public String getInformacao() {
        return "Gerente: " + this.nome +
               " Recebe: " + this.salario;
    }
    
    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }
    
    public boolean getAutenticacao(String senha) {
        //Comparação de Strings usamos equals
        //Comparaçao de inteiros usamos ==
        if(this.senha.equals(senha)){
            System.out.println("Acesso Permitido!");
            return true;
        }
        else{
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
}
