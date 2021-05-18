public class MainCredito
{
    public static void main(String [] args)

    {
        //Crear objeto del modelo
        Credito o = new Credito();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        o.montoCredito= c.leerDouble("Escriba el Monto del crédito: ");
        o.tasaInteres= c.leerDouble("Escriba el % de interés del credito: ");
        o.plazoMeses= c.leerDouble("Escriba la cantidad de cuotas: ");
        
        //invocar el algoritmo o los algoritmos, usando el Modelo
        o.algoritmo();

        // imprimir los datos de salida
        c.imprimir("El total a pagar por interes es: "+o.valorTotalInteres);
        
 
    }   
}