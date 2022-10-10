Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.


public class Main {
    public static void main(String[] arg){
        //creamos una variable adicional para que almacene el retorno de la funcion suma
        var resultado = suma(10,2,3);
        //imprime la suma de a,b y c
        System.out.println(resultado);

        //instancia de la clase COCHE
        Coche miCoche = new Coche();
        //accedemos al metodo incrementarPuertas pasando un valor X como parametro e informo la cantidad de puertas que tiene miCoche
        miCoche.incrementarPuertas(3);
        System.out.println(miCoche.puertas);
    }
    
    //function de suma con retorno
    public static int suma(int a,int b,int c){
        return a + b + c;
    }

    //Clase Coche 
    public static class Coche{
        int puertas ;

        //Metodo incrementarPuerta
        int incrementarPuertas(int incrementar){
            return puertas += incrementar;
        };
    };
};
