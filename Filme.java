enum FaixaEtaria {
    LIVRE,
    DOZE_ANOS,
    QUARTOZE_ANOS,
    DESESSEIS_ANOS,
    DEZOITO_ANOS;
}

public class Filme {
    private int id_filme;
    private String nome;
    private Diretor diretor;
    private String sinopse;
    private FaixaEtaria faixaEtaria;

    public Filme(int id, String nome, Diretor diretor, String sinopse, FaixaEtaria faixaEtaria){
        this.id_filme = id;
        this.nome = nome;
        this.diretor = diretor;
        this.sinopse = sinopse;
        this.faixaEtaria = faixaEtaria;
    }

    public int getId_filme() {
        return id_filme;
    }

    public String getNome() {
        return nome;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public FaixaEtaria getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setId_filme(int id_filme) {
        this.id_filme = id_filme;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
}
