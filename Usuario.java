class Usuario {
    private int id;
    private String foto;
    private String apelido;

    public Usuario (int id, String foto, String apelido) {
        this.id = id;
        this.foto = foto;
        this.apelido = apelido;
    }

    public int getId() {
        return id;
    }

    public String getFoto() {
        return foto;
    }

    public String getApelido() {
        return apelido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}