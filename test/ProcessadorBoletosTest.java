import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leandro
 */
public class ProcessadorBoletosTest {
    
    public ProcessadorBoletosTest() {
    }
    
    @Test
    public void verificaPagamento() throws Exception {
        int boletoA = 500.0;
        int boletoB = 400.0;
        int boletoC = 600.0;
        int fatura = 0;
        
        assertEquals(1500.0, fatura);
    }
}
