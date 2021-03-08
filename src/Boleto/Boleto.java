package Boleto;

/**
 *
 * @author leandro
 */
public class Boleto {
    private String codigo;
    private String data;
    private int valor;

    public Boleto(String codigo, String data, int valor) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public int getValor() {
        return valor;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
