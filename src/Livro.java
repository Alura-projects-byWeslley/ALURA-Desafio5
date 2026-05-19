public class Livro implements Calculavel{
    private int desconto = 7;
    private double preco;

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public double calcularPrecoFinal(double precof){
        precof = precof * ((100 - this.desconto) / 100);
        return precof;
    }
}
