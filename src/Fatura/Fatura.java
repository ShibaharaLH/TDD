package Fatura;

/**
 *
 * @author leandro
 */
public class Fatura {
    private String data;
    private int valorTotal;
    private String nomeCliente;

    public Fatura(String data, int valorTotal, String nomeCliente) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
    }

    public String getData() {
        return data;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
