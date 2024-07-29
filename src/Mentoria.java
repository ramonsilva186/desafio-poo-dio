import java.time.LocalDate;

public class Mentoria {

    private String nome;
    private LocalDate data;

    public Mentoria(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "nome='" + nome + '\'' +
                ", data=" + data +
                '}';
    }
}
