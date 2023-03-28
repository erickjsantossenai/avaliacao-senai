package avaliacao;

public class Engenheiro extends Funcionário{
    
    private String CREA;

    public Engenheiro() {
    }

    public Engenheiro(String CREA, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, int idade, String telefone, Genero genero, Endereço endereço) {
        super(cpf, rg, matricula, setor, salario, id, nome, idade, telefone, genero, endereço);
        this.CREA = CREA;
    }

    @Override
    public String toString() {
        return "CREA: " + this.CREA +
               "\nID: " + super.id +
               "\nMatrícula: " + super.matricula +
               "\nNome: " + super.nome +
               "\nTelefone: " + super.telefone +
               "\nRG: " + super.rg +
               "\nIdade: " + super.idade +
               "\nGênero: " + super.genero +
               "\nCPF: " + super.cpf +
               "\nSalário: " + super.salario +
               "\nSetor: " + super.setor +
               "\nLogradouro: " + super.endereço.logradouro +
               "\nNumero: " + super.endereço.numero +
               "\nComplemento: " + super.endereço.complemento +
               "\nCEP: " + super.endereço.cep +
               "\nCidade: " + super.endereço.cidade +
               "\nUF: " + super.endereço.uf;
    }

    public String getCREA() {
        return CREA;
    }

    public void setCREA(String CREA) {
        this.CREA = CREA;
    }
    
    
}
