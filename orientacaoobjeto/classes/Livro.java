package orientacaoobjeto.classes;

public class Livro {
    private String título;
    private String nomeLeitor;
    private int qtPgTotal;
    private int qtPgLidas;

    public double percentualLeitura(int qtPgTotal, int qtPgLidas) {
        double percentual;
        return percentual = (qtPgLidas * 100) / qtPgTotal;
    }

    public String getTítulo() {
        return this.título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getNomeLeitor() {
        return this.nomeLeitor;
    }

    public void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }

    public int getQtPgTotal() {
        return this.qtPgTotal;
    }

    public void setQtPgTotal(int qtPgTotal) {
        this.qtPgTotal = qtPgTotal;
    }

    public int getQtPgLidas() {
        return this.qtPgLidas;
    }

    public void setQtPgLidas(int qtPgLidas) {
        this.qtPgLidas = qtPgLidas;
    }
}
