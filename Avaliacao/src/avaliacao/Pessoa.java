package avaliacao;


public abstract class Pessoa {
    
    protected int id;
    protected String nome;
    protected int idade;
    protected String telefone;
    protected Genero genero;
    protected Endereço endereço;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, int idade, String telefone, Genero genero, Endereço endereço) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.genero = genero;
        this.endereço = endereço;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    
    
}
