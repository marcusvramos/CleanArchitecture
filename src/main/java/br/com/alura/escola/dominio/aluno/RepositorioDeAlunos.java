package br.com.alura.escola.dominio.aluno;

import java.sql.SQLException;
import java.util.List;

public interface RepositorioDeAlunos { // Repository - Dependency Inversion Principle
    // RepositorioDeAlunos é uma interface que define um contrato para que outras classes possam implementar
    // outras camadas vão implementar essa interface, logo inverti a dependência
    void matricular(Aluno aluno);
    Aluno buscarPorCPF(CPF cpf);
    List<Aluno> listarTodosAlunosMatriculados();
}
