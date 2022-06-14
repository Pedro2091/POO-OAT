class Login {
    private Usuario usuario;
    private String email;
    private String senha;

    public Login(Usuario usuario, String email, String senha){
        this.usuario = usuario;
        this.email = email;
        this.senha = senha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}