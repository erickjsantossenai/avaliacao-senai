package avaliacao;

public abstract class Funcionário extends Pessoa{
    
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected double salario;

    public Funcionário() {
    }

    public Funcionário(String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, int idade, String telefone, Genero genero, Endereço endereço) {
        super(id, nome, idade, telefone, genero, endereço);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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


    @Override
    public String toString() {
        return "Nome: " + super.nome +
               "\nID: " + super.id +
               "\nIdade: " + super.idade +
               "\nRG: " + this.rg +
               "\nCPF: " + this.cpf +
               "\nTelefone: " + super.telefone +
               "\nGênero: " + super.genero +
               "\nMatrícula: " + this.matricula +
               "\nSetor: " + this.setor +
               "\nSalário: " + this.salario +
               "\nLogradouro: " + super.endereço.logradouro +
               "\nComplemento: " + super.endereço.complemento +
               "\nN°: " + super.endereço.numero +
               "\nCEP: " + super.endereço.cep +
               "\nCidade: " + super.endereço.cidade +
               "\nUF: " + super.endereço.uf;
    }
    
}
