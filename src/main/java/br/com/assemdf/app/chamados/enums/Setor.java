package br.com.assemdf.app.chamados.enums;

public enum Setor {

    ADMIN("Administrador"),
    COMERCIAL("Comercial"),
    CONTABILIDADE("Contabilidade"),
    JURIDICO("Juridico"),
    MARKETING("Marketing");

    private String setor;

    private Setor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }   

}
