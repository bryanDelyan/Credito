

class MainCrédito
{
    
    public static void main(String [] args)
    {
        //Crear objeto del modelo "M" o negocio
        Crédito cr = new Crédito();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        cr.montoCredito= c.leerLong("Monto del Credito");
        cr.tasaInteres= c.leerLong("Tasa de Interes");
        cr.plazoMeses= c.leerLong("Plazo en Meses");

        //invocar el algoritmo o los algoritmos, usando el Modelo
        cr.algoritmo();

        //mostrar / imprimir los datos de salida
        c.imprimir("El total a pagar por intereses es: " + cr.valorTotalInteres);
    } 
    
}//fin class MainTienda
