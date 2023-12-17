import com.example.cleanarchitecture.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelefoneTest {
    @Test
    void naoDeveriaCriarTelefonesComDDDsInvalidos() {
        assertThrows((IllegalArgumentException.class), () -> new Telefone(null, "12345678"));

        assertThrows((IllegalArgumentException.class), () -> new Telefone("", "12345678"));

        assertThrows((IllegalArgumentException.class), () -> new Telefone("1", "12345678"));
    }
    @Test
    void naoDeveriaCriarTelefonesComNumerosInvalidos() {
        assertThrows((IllegalArgumentException.class), () -> new Telefone("11", null));

        assertThrows((IllegalArgumentException.class), () -> new Telefone("11", ""));

        assertThrows((IllegalArgumentException.class), () -> new Telefone("11", "1234567"));

        assertThrows((IllegalArgumentException.class), () -> new Telefone("11", "1234567890"));
    }

    @Test
    void deveriaCriarTelefonesComDDDsENumerosValidos() {
        String ddd = "11";
        String numero = "997261599";
        Telefone telefone = new Telefone(ddd, numero);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }
}
