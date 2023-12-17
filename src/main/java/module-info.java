module com.example.cleanarchitecture {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens br.com.alura.escola to javafx.fxml;
    exports br.com.alura.escola;
    exports br.com.alura.escola.dominio.aluno;
    opens br.com.alura.escola.dominio.aluno to javafx.fxml;
    exports br.com.alura.escola.dominio.indicacao;
    opens br.com.alura.escola.dominio.indicacao to javafx.fxml;
    exports br.com.alura.escola.infra.aluno;
    exports br.com.alura.escola.aplicacao.aluno.matricular;
}