package br.com.alura.escola.dominio.aluno;

public class CPF { // Value Object
    private String numero;

    public CPF(String numero) {
        if (numero == null || !numero.matches("^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}$")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
