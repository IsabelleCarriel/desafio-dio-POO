import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIsabelle = new Dev();
        devIsabelle.setNome("Isabelle");
        devIsabelle.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Isabelle: " + devIsabelle.getConteudosInscritos());
        devIsabelle.progredir();
        devIsabelle.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Isabelle: " + devIsabelle.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Isabelle: " + devIsabelle.getConteudosConcluidos());
        System.out.println("XP:" + devIsabelle.calcularTotalXp());

        System.out.println("--------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
