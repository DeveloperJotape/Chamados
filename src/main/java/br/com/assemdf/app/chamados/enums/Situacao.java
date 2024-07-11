package br.com.assemdf.app.chamados.enums;

public enum Situacao {

    ATIVO("Ativo"),
    INVATIVO("Inativo");

    private String situacao;

    private Situacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
