import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> cursos = new HashSet<>();
    private Set<Mentoria> mentorias = new HashSet<>();

    public Dev(String nome) {
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

    public void inscreverCurso(Curso curso) {
        cursos.add(curso);
    }

    public void inscreverMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", cursos=" + cursos +
                ", mentorias=" + mentorias +
                '}';
    }
}
