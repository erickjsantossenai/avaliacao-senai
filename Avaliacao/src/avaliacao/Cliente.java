package avaliacao;

public class Cliente extends Fisica{
    
    private int protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(int protocoloAtendimento, int id, String nome, int idade, String telefone, Genero genero, Endereço endereço) {
        super(id, nome, idade, telefone, genero, endereço);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\nID: " + super.id +
               "\nNome: " + super.nome +
               "\nTelefone: " + super.telefone +
               "\nIdade: " + super.idade +
               "\nGênero: " + super.genero +
               "\nLogradouro: " + super.endereço.logradouro +
               "\nNumero: " + super.endereço.numero +
               "\nComplemento: " + super.endereço.complemento +
               "\nCEP: " + super.endereço.cep +
               "\nCidade: " + super.endereço.cidade +
               "\nUF: " + super.endereço.uf;
    }
 
}
