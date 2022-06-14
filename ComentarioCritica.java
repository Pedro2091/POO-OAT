class ComentarioCritica{
    private Usuario usuario;
    private Critica critica;
    private String comentario;

    public ComentarioCritica(Usuario usuario, Critica critica, String comentario){
        this.usuario = usuario;
        this.critica = critica;
        this.comentario = comentario;
    }

    public Usuario getId_usuario() {
        return usuario;
    }

    public Critica getId_critica() {
        return critica;
    }

    public String getComentario() {
        return comentario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setCritica(Critica critica) {
        this.critica = critica;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
