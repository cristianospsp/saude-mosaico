package br.com.saudemosaico.domain;

public enum Cargo {
    MEDICO("Médico"),
    ENFERMEIRO("Enfermeiro"),
    PSICOLOGO("Psicólogo"),
    NUTRICIONISTA("Nutricionista"),
    ASSISTENTE_SOCIAL("Assistente Social");

    private String descricao;

    Cargo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
