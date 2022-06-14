import java.util.Date;

class Critico {
    private int id_critico;
    private String nascimento;
    private String nome;

    public Critico (int id, String nome, String nascimento){
        this.id_critico = id;
        this.nascimento = nascimento;
        this.nome = nome;
    }

    public int getId_critico() {
        return id_critico;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setId_critico(int id_critico) {
        this.id_critico = id_critico;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}