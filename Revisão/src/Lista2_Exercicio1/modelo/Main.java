package Lista2_Exercicio1.modelo;

import Lista2_Exercicio1.modelo.modelo.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Materia poo = new Materia("Programação Orientada a Objetos");
        Materia scrum = new Materia("SCRUM");
        Materia mysql = new Materia("MySQL");
        Aula programação1 = new Aula( poo, "08:00", "17:30");
        Aula programação2 = new Aula(scrum, "10:00", "14:00");
        Aula programação3 = new Aula(mysql, "11:00", "16:00");
        Aluno luiz = new Aluno ( 123452, "Luiz", "Da Galera");
        Aluno gabriel = new Aluno( 123456, "Gabriel", "Gente Fina");
        Aluno thiago = new Aluno(123231, "Thiago", "Casa Grande");
        Professor jorge = new Professor("Jorge", 123231);


        luiz.assistirAula(programação1);
        jorge.darAula(programação2);

        Curso cursos = new Curso( "Generation", jorge);
        Turma turma = new Turma("Generation", cursos);

        cursos.adicionarAluno(gabriel);
        cursos.adicionarAluno(luiz);
        cursos.adicionarAluno(thiago);

        cursos.adicionarAula(programação1);
        cursos.adicionarAula(programação2);
        cursos.adicionarAula(programação3);



        System.out.println(cursos);
        System.out.println(turma);




    }
}
