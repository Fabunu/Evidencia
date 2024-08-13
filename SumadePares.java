public class SumadePares {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10} ;
        int suma = 0 ; 

        for (int num: numeros) {
            if (num % 2 == 0) {
                suma += num ;
            }
        }
        System.out.println("la suma de los numeros pares es:" + suma);
    } 
}
//queria hacer que el programa solicitara la lista de numero al usuario pero preferi que no