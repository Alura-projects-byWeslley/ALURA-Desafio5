public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private double temp;

    public void setTemp(double temp){
        this.temp = temp;
    }

    public double getTemp(){
        return temp;
    }

    @Override
    public int fahrenheitParaCelsius(int f){
        return f * (5/9) - 32;
    }

    @Override
    public int celsiusParaFahreinheit(int c){
        return c * (9/5) + 32;
    }
}
