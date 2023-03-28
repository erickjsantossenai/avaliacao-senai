package avaliacao;

public class Juridica extends Pessoa{
    
    protected String CNPJ;
    protected String InscriçãoEstadual;

    public Juridica() {
    }

    public Juridica(String CNPJ, String InscriçãoEstadual, int id, String nome, int idade, String telefone, Genero genero, Endereço endereço) {
        super(id, nome, idade, telefone, genero, endereço);
        this.CNPJ = CNPJ;
        this.InscriçãoEstadual = InscriçãoEstadual;
    }

    @Override
    public String toString() {
        return "\nID: " + super.id +
               "\nNome: " + super.nome +
               "\nIdade: " + super.idade +
               "\nGênero: " + super.genero +
               "\nTelefone: " + super.telefone +
               "\nCNPJ: " + this.CNPJ +
               "\nInscrição Estadual: " + this.InscriçãoEstadual +
               "\nLogradouro: " + super.endereço.logradouro +
               "\nNumero: " + super.endereço.numero +
               "\nComplemento: " + super.endereço.complemento +
               "\nCEP: " + super.endereço.cep +
               "\nCidade: " + super.endereço.cidade +
               "\nUF: " + super.endereço.uf;
    }   

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscriçãoEstadual() {
        return InscriçãoEstadual;
    }

    public void setInscriçãoEstadual(String InscriçãoEstadual) {
        this.InscriçãoEstadual = InscriçãoEstadual;
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
