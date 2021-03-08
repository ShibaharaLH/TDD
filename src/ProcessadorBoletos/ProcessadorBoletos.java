package ProcessadorBoletos;

import Boleto.Boleto;
import Fatura.Fatura;
import Pagamento.Pagamento;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author leandro
 */
public class ProcessadorBoletos {
    
    public boolean validaPagamentoFatura(List<Boleto> boletos, Fatura fatura) {
        int total = 0;
        
        for (Iterator<Boleto> i = boletos.iterator(); i.hasNext();) {
            total += i.next().getValor();
        }
        
        if (total >= fatura.getValorTotal()) {
            return true;
        } else {
            return false;
        }
    }
}
