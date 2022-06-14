public class Critica {
    private int idCritica;
    private Filme filme;
    private int notaCritico;
    private String critica;
    private Critico critico;

    public Critica(int id, Filme filme, int notaCritico, String critica, Critico critico){
        this.idCritica = id;
        this.filme = filme;
        this.notaCritico = notaCritico;
        this.critica = critica;
        this.critico = critico;
    }

    public int getIdCritica() {
        return idCritica;
    }

    public Filme getFilme() {
        return filme;
    }

    public int getNotaCritico() {
        return notaCritico;
    }

    public String getCritica() {
        return critica;
    }

    public Critico getCritico() {
        return critico;
    }

    public void setIdCritica(int idCritica) {
        this.idCritica = idCritica;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setNotaCritico(int notaCritico) {
        this.notaCritico = notaCritico;
    }

    public void setCritica(String critica) {
        this.critica = critica;
    }

    public void setCritico(Critico critico) {
        this.critico = critico;
    }
}
