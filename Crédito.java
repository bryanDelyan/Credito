

public class Crédito
{
    long montoCredito;
    long tasaInteres;
    long plazoMeses;
    
    long valorcuotaMensual;
    long valormensualCapital;

    double valorTotalInteres;
    
    void algoritmo(){
      valormensualCapital=(montoCredito/plazoMeses);

      while(montoCredito!=0){
        valorTotalInteres+=(montoCredito*tasaInteres)/100;
        valorcuotaMensual=(valormensualCapital+((montoCredito*tasaInteres)/100));
        montoCredito-=valorcuotaMensual;
      }
    }
}
