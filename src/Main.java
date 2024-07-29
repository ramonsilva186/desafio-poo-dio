import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso("Curso de Java", 60);
        Curso cursoPython = new Curso("Curso de Python", 50);

        // Criar mentorias
        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", LocalDate.of(2024, 8, 1));
        Mentoria mentoriaPython = new Mentoria("Mentoria de Python", LocalDate.of(2024, 8, 2));


        Bootcamp bootcamp = new Bootcamp("Bootcamp de Desenvolvimento");


        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarCurso(cursoPython);
        bootcamp.adicionarMentoria(mentoriaJava);
        bootcamp.adicionarMentoria(mentoriaPython);


        Dev dev1 = new Dev("Ramon");
        Dev dev2 = new Dev("Leandro");


        dev1.inscreverCurso(cursoJava);
        dev1.inscreverMentoria(mentoriaJava);

        dev2.inscreverCurso(cursoPython);
        dev2.inscreverMentoria(mentoriaPython);


        System.out.println(bootcamp);
        System.out.println(dev1);
        System.out.println(dev2);
    }
}