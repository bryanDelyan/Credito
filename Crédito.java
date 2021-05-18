public class Credito 
{
 //entradas
  double montoCredito;
  double tasaInteres;
  double plazoMeses;
  //salidas 1
  double valorTotalInteres=0;
  //Ingresar algoritmo
  void algoritmo()
  {
    int variable=1;
    double valorMensualCapital=(montoCredito/plazoMeses);
    while(variable<=plazoMeses){
    valorTotalInteres =valorTotalInteres+(montoCredito*tasaInteres)/100; 
    montoCredito = montoCredito - valorMensualCapital;
     variable++;
    }  
  }
}