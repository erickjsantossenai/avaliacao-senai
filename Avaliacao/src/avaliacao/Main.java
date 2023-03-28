package avaliacao;

public class Main {
    
    public static void main(String[] args) {
        
        Médico medico = new Médico("154", "54856963295", "58465932551", "2516435", Setor.SAUDE, 3500, 584675, "James", 27, "(11)992568452", Genero.MASCULINO, 
                new Endereço("Liberdade", "265", "Edifício", "52456000", "São Paulo", UnidadeFederativa.SAO_PAULO));
        System.out.println(medico.toString());
        
        Engenheiro engenheiro = new Engenheiro("154", "54856963295", "58465932551", "2516435", Setor.SAUDE, 3500, 584675, "James", 27, "(11)992568452", Genero.MASCULINO, 
                new Endereço("Liberdade", "265", "Edifício", "52456000", "São Paulo", UnidadeFederativa.SAO_PAULO));
        System.out.println(medico.toString());
        
        Advogado advogado = new Advogado("154", "54856963295", "58465932551", "2516435", Setor.SAUDE, 3500, 584675, "James", 27, "(11)992568452", Genero.MASCULINO, 
                new Endereço("Liberdade", "265", "Edifício", "52456000", "São Paulo", UnidadeFederativa.SAO_PAULO));
        System.out.println(medico.toString());
        
        Juridica juridica = new Juridica("65488211387854", "587426", 4587245, "EmpreenD+/Juliana", 34, "(71)993652514", Genero.FEMININO, 
                new Endereço("Liberdade", "265", "Edifício", "52456000", "São Paulo", UnidadeFederativa.SAO_PAULO));
        System.out.println(juridica.toString());
 }
}
