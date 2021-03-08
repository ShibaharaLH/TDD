import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author leandro
 */
public class ProcessadorBoletosTest {
    
    private ProcessadorBoletos processadorBoletos;
    
    @BeforeAll
    public static void inicializa() {
        processadorBoletos = new ProcessadorBoletos();
    }
    
    @Test
    public void verificaFaturaPaga() {
        List<Boleto> boletos = new ArrayList<Boletos>();
        Boleto boletoA = new Boleto("12345", "08-03-21", 300);
        Boleto boletoB = new Boleto("54321", "08-03-21", 300);
        Boleto boletoC = new Boleto("12367", "08-03-21", 300);
        boletos.add(boletoA);
        boletos.add(boletoB);
        boletos.add(boletoC);
        Pagamento pagamento = new Pagamento("08-03-21", 900, "Leandro Shibahara");
        
        boolean pagamentoEfetuado = processadorBoletos.validaPagamentoFatura(boletos, pagamento);
        assertEquals(true, pagamentoEfetuado);
    }
    
    @Test
    public void verificaFaturaNaoPaga() {
        List<Boleto> boletos = new ArrayList<Boletos>();
        Boleto boletoA = new Boleto("12345", "08-03-21", 300);
        Boleto boletoB = new Boleto("54321", "08-03-21", 300);
        Boleto boletoC = new Boleto("12367", "08-03-21", 300);
        boletos.add(boletoA);
        boletos.add(boletoB);
        boletos.add(boletoC);
        Pagamento pagamento = new Pagamento("08-03-21", 1000, "Leandro Shibahara");
        
        boolean pagamentoEfetuado = processadorBoletos.validaPagamentoFatura(boletos, pagamento);
        assertEquals(false, pagamentoEfetuado);
    }
}
