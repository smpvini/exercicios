/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv;

/**
 *
 * @author vinicius.moura
 */
import java.util.ArrayList;

public class Atv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Curso cursos;
        ArrayList<Curso> cursos;
        
        Aluno aluno = new Aluno();
        ArrayList<Double> notas = new ArrayList<>();
        
        Telefone telefone;
        ArrayList<telefone> telefones;
        
        Professor novoProf = new Professor();
        Endereco endereco;
        
        System.out.println("------Cadastro do Professor-------");
        System.out.println("Digite o nome do professor: ");
        novoProf.setNome(sc.nextline());
        System.out.println("Digite o email do professor: ");
        novoProf.setEmail(sc.nextline());
        System.out.println("Digite o Cpf do professor: ");
        novoProf.setCpf(sc.nextline());
        
        endereco = new Endereco();
        System.out.println("Digite a Rua: ");
        endereco.setRua(sc.nextLine());
        System.out.println("Digite a Cidade: ");
        endereco.setCidade(sc.nextLine());
        System.out.println("Digite a Estado: ");
        endereco.setEstado(sc.nextLine());
        novoProf.setEndereco(endereco);
        
        telefones = new ArrayList<>();       
        System.out.println("Digite os telefones do professor - máximo 2");
        for(int i = 0 ; i < 2; i++){
            telefone = new telefone();
            System.out.println("Digite o tipo do telefone: ");
            telefone.setTipo(sc.nextLine());
            System.out.println("Digite o DDD do telefone: ");
            telefone.setDdd(sc.nextLine());
            System.out.println("Digite o número do segundo telefone: ");
            telefone.setNumero(sc.nextLine());
            telefones.add(telefone);
            
        }
        novoProf.setTelefones(telefones);
        
        System.out.println("Digite a titulação: ");
        novoProf.setTitulacao(sc.nextLine());
        
        System.out.println("Digite o salário: ");
        novoProf.setSalario(sc.nextDouble());
        
        sc.nextLine();
        cursos = new ArrayList<>();
         System.out.println("Digite os cursos do professor - máximo 2");
        for(int i = 0 ; i < 2; i++){
            curso = new Curso();
            System.out.println("Digite o nome do curso: ");
            curso.setNome(sc.nextLine());
            cursos.add(cursos);
           
        }
        
        novoProf.setCursos(cursos);
        
         System.out.println("------Cadastro do Aluno-------");
        System.out.println("Digite o nome do aluno: ");
        Aluno.setNome(sc.nextline());
        System.out.println("Digite o email do aluno: ");
        Aluno.setEmail(sc.nextline());
        System.out.println("Digite o Cpf do aluno: ");
        Aluno.setCpf(sc.nextline());
        
         endereco = new Endereco();
        System.out.println("Digite a Rua: ");
        endereco.setRua(sc.nextLine());
        System.out.println("Digite a Cidade: ");
        endereco.setCidade(sc.nextLine());
        System.out.println("Digite a Estado: ");
        endereco.setEstado(sc.nextLine());
        Aluno.setEndereco(endereco);
        
         telefones = new ArrayList<>();       
        System.out.println("Digite os telefones do aluno - máximo 2");
        for(int i = 0 ; i < 2; i++){
            telefone = new telefone();
            System.out.println("Digite o tipo do telefone: ");
            telefone.setTipo(sc.nextLine());
            System.out.println("Digite o DDD do telefone: ");
            telefone.setDdd(sc.nextLine());
            System.out.println("Digite o número do segundo telefone: ");
            telefone.setNumero(sc.nextLine());
            telefones.add(telefone);
            
        }
        Aluno.setTelefones(telefones);
        
        curso = new Curso();
        System.out.println("Digite o curso: ");
        curso.setNome(sc.nextLine);
        
        aluno.setCurso(curso);
        
        System.out.println("Digite as notas: ");
        for(int i = 0 ; i < 2; i++){
            notas.add(sc.nextDouble());
        }
        
        aluno.setNotas(notas);
        
        
        novoProf.imprimir();
        aluno.imprimir();
    }
}
