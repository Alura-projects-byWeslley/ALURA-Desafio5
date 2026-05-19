public class TabuadaMultiplicacao implements Tabuada{
    private int valor;

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    @Override
    public void mostrarTabuada(int tab){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%dx%d = %d\n", tab, i, tab * i);
        }
    }
}
