package avaliacao;

public class Médico extends Funcionário{
    
    private String CRM;

    public Médico() {
    }

    public Médico(String CRM, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, int idade, String telefone, Genero genero, Endereço endereço) {
        super(cpf, rg, matricula, setor, salario, id, nome, idade, telefone, genero, endereço);
        this.CRM = CRM;
    }

    @Override
    public String toString() {
        return "CRM: " + this.CRM +
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

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }
      
}
