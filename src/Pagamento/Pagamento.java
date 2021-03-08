package Pagamento;

/**
 *
 * @author leandro
 */
public class Pagamento {
    private int valorPago;
    private String data;
    private String tipo;

    public Pagamento(int valorPago, String data, String tipo) {
        this.valorPago = valorPago;
        this.data = data;
        this.tipo = tipo;
    }

    public int getValorPago() {
        return valorPago;
    }

    public String getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
