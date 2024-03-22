public class Usuario{
    private String nome;
    private String email;
    private String senha;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getNome(){
        return this.nome;
    }

}
