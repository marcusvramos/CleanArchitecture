package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

import java.sql.SQLException;

public class MatricularAlunoPorLinhaDeComando {
    public static void main(String[] args) throws SQLException {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "email@email.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.executa(new MatricularAlunoDto(nome, cpf, email));
    }
}
