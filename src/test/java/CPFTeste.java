import com.example.cleanarchitecture.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CPFTeste {
    @Test
    void naoDeveriaCriarCPFComNumerosInvalidos() {
        assertThrows((IllegalArgumentException.class), () -> new CPF(null));
        assertThrows((IllegalArgumentException.class), () -> new CPF(""));
        assertThrows((IllegalArgumentException.class), () -> new CPF("1234567890"));
        assertThrows((IllegalArgumentException.class), () -> new CPF("123456789"));
    }

    @Test
    void deveriaCriarCPFComNumerosValidos() {
        String numero = "123.456.789-09";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }
}
