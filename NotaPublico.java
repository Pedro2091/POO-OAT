class NotaPublico{
    private Usuario usuario;
    private Filme filme;
    private float nota;

    public NotaPublico(Usuario usuario, Filme filme, float nota){
        this.usuario = usuario;
        this.filme = filme;
        this.nota = nota;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Filme getFilme() {
        return filme;
    }

    public float getNota() {
        return nota;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}