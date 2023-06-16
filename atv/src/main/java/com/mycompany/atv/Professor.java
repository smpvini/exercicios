/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv;

/**
 *
 * @author vinicius.moura
 */
import java.util.ArrayList;

public class Professor extends Pessoa{
    private String titulacao;
    private Double salario;
    private Arraylist<Curso> cursos;

   public Professor(){
       super();
   }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
 public <any> getCursos() {
        return cursos;
    }

    public void setCursos(<any> cursos) {
        this.cursos = cursos;
    }
    public void imprimir(){
        System.out.println("-----Dados do Professor-----");
        super().imprimir();
        System.out.println("Salario: R$"+getSalario());
        System.out.println("Titulação: "+getTitulacao());
        getCursos().get(i).imprimirCurso();
    }
    
}
