package br.rafael;

import java.time.LocalDate;

import br.rafael.dominio.Bootcamp;
import br.rafael.dominio.Conteudo;
import br.rafael.dominio.Curso;
import br.rafael.dominio.Dev;
import br.rafael.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Java Mod1");
        curso.setDescricao("1° parte o curso");
        curso.setCargaHoraria(3);
        
        Curso curso2 = new Curso();

        curso2.setTitulo("Java Mod2");
        curso2.setDescricao("2° parte do curso");
        curso2.setCargaHoraria(4);

        Mentoria men1 = new Mentoria();

        men1.setTitulo("Mentoria a1");
        men1.setDescricao("Ajudar");
        men1.setData(LocalDate.of(2024, 3, 5));

    
        Conteudo men2 = new Mentoria();
        men2.setTitulo("Mentoria a2");
        men2.setDescricao("segunda");
        men2.setData(LocalDate.of(2024, 3, 15));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Estudar java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(men1);
        bootcamp.getConteudos().add(men2);

        // System.out.println(bootcamp.getConteudos());

        Dev dev1 = new Dev();
        dev1.setNome("Rafael Sartório");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Os conteudos inscritos são :\n " + dev1.getConteudosInscritos());
        System.out.println("Os conteudos concluidos são :\n " + dev1.getConteudosConcluidos());
        System.out.println("O xp total nesse momento é de: " + dev1.calcular_Xp());
        dev1.progredir();
        dev1.progredir();
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Os conteudos inscritos são :\n " + dev1.getConteudosInscritos());
        System.out.println("Os conteudos concluidos são :\n " + dev1.getConteudosConcluidos());
        System.out.println("O xp total nesse momento é de: " + dev1.calcular_Xp());



        // Dev dev2 = new Dev();
        // dev2.setNome("Gabriel Sartório");
        
        
    }

    
}
