package avaliacao;

public enum UnidadeFederativa {
    ACRE ("ACRE", "AC"),
    ALAGOAS ("ALAGOAS", "AL"),
    AMAPA ("AMAPÁ", "AP"),
    AMAZONAS ("AMAZONAS", "AM"),
    BAHIA ("BAHIA", "BA"),
    CEARA ("CEARÁ", "CE"),
    DISTRITO_FEDERAL ("DISTRITO FEDERAL", "DF"),
    ESPIRITO_SANTO ("ESPÍRITO SANTO", "ES"),
    GOIAS ("GOIÁS", "GO"),
    MARANHAO ("MARANHÃO", "MA"),
    MATO_GROSSO ("MATO GROSSO", "MT"),
    MATO_GROSSO_DO_SUL ("MATO GROSSO DO SUL", "MS"),
    MINAS_GERAIS ("MINAS GERAIS", "MG"),
    PARA ("PARÁ", "PA"),
    PARAIBA ("PARAÍBA", "PB"),
    PARANA ("PARANÁ", "PR"),
    PERNAMBUCO ("PERNAMBUCO", "PE"),
    PIAUI ("PIAUÍ", "PI"),
    RIO_DE_JANEIRO ("RIO DE JANEIRO", "RJ"),
    RIO_GRANDE_DO_NORTE ("RIO GRANDE DO NORTE", "RN"),
    RIO_GRANDE_DO_SUL ("RIO GRANDE DO SUL", "RS"),
    RONDONIA ("RONDÔNIA", "RO"),
    RORAIMA ("RORAIMA", "RR"),
    SANTA_CATARINA ("SANTA CATARINA", "SC"),
    SAO_PAULO ("SÃO PAULO", "SP"),
    SERGIPE ("SERGIPE", "SE"),
    TOCANTINS ("TOCANTINS", "TO");

    
    protected String nome;
    protected String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
}
