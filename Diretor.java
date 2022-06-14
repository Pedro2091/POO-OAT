class Diretor {
    private int id;
    private String nascimento;
    private String nome;

    public Diretor (int id, String nascimento, String nome){
        this.id = id;
        this.nascimento = nascimento;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}