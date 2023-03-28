package avaliacao;

public class Advogado extends Funcionário{
    
    private String OAB;

    public Advogado() {
    }

    public Advogado(String OAB, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, int idade, String telefone, Genero genero, Endereço endereço) {
        super(cpf, rg, matricula, setor, salario, id, nome, idade, telefone, genero, endereço);
        this.OAB = OAB;
    }

    @Override
    public String toString() {
        return "OAB: " + this.OAB +
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

    public String getOAB() {
        return OAB;
    }

    public void setOAB(String OAB) {
        this.OAB = OAB;
    }

}
