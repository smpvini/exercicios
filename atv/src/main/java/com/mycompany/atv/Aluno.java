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

public class Aluno {
    private Curso curso;
    ArrayList<Double> notas;
    
    public Aluno(){
        super();
    }
    
     public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
    public Double calcularMedia(){
        double soma = 0;
        for(Double nota: getNotas()){
            soma += nota;
        }
        double media = soma/notas.size();
        return 0.0;
    }
    public void imprimir(){
        System.out.println("------Dados do aluno-----");
        super.imprimir();
        getCurso().imprimirCurso();
        for(int i = 0; i< getNotas().size(); i++){
            System.out.println(getNotas().get(i).toString());
        }
        System.out.println("Media: "+CalcularMedia());
    }
  
    
}
