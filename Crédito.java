

public class Crédito
{
    long montoCredito;
    long tasaInteres;
    long plazoMeses;
    
    long valorcuotaMensual;
    long valormensualCapital;
    long valormensualInteres;
    long gananciaTotal;
    
    void algoritmo(){
    
           valormensualCapital=(montoCredito/plazoMeses);
           valormensualInteres=(montoCredito*tasaInteres)/100;
           valorcuotaMensual=(valormensualCapital+valormensualInteres);
           gananciaTotal= (valormensualInteres*plazoMeses*100) /montoCredito;
         
        
    }
    
}
