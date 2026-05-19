public class CalculadoraSalaRetangular implements CalculoGeometrico{
    
    
    @Override
    public double calcularArea(double altura, double largura){
        return altura * largura;
    }

    public double calcularPerimetro(double altura, double largura){
        return (altura + largura) * 2;
    }
}
