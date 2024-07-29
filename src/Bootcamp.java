import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private Set<Curso> cursos = new HashSet<>();
    private Set<Mentoria> mentorias = new HashSet<>();

    public Bootcamp(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    public Set<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(Set<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", cursos=" + cursos +
                ", mentorias=" + mentorias +
                '}';
    }
}
