public class ConversorMoeda implements ConversaoFinanceira{
    private double pay;
    private double dolar;
    
    public void setPay(double pay){
        this.pay = pay;
    }

    public double getPay(){
        return pay;
    }

    //funcao da interface
    @Override
    public void converterDolarParaReal(double dolar){
        this.dolar = dolar * 5.04;
    }

}
