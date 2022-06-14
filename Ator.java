import java.util.ArrayList;

public class Ator {
    private int id_ator;
    private String nome;
    private String nascimento;
    private ArrayList<Filme> filmesFeitos = new ArrayList<>();

    public Ator(int id, String nome, String nascimento){
        this.id_ator = id;
        this.nome = nome;
        this.nascimento = nascimento;
    }
    public Ator(int id, String nome, String nascimento, ArrayList<Filme> filmes){
        this.id_ator = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.filmesFeitos.addAll(filmes);
    }

    public void adicionarFilme(Filme filme){
        this.filmesFeitos.add(filme);
    }

    public int getId_ator() {
        return id_ator;
    }

    public String getNome() {
        return nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setId_ator(int id_ator) {
        this.id_ator = id_ator;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setFilmesFeitos(ArrayList<Filme> filmesFeitos) {
        this.filmesFeitos = filmesFeitos;
    }
}
