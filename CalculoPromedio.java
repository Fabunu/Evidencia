import java.util.Scanner; 

public class CalculoPromedio {
    public static void main(String[] args) {
        Scanner owo = new Scanner(System.in);
        //pedir a la persona que coloque la nota
        System.out.print("Por favor, ingrese la cantidad de notas =) :");
        int cantidad_nota = owo.nextInt();
        double[] notas = new double[cantidad_nota];//Para decimales

        //ingresar la nota
        for (int i = 0; i < cantidad_nota; i++) {
            System.out.print("Ingrese la nota " + (i+1) +": ");
            notas[i] = owo.nextDouble();
        }
        //calcular el promedio juju
        double promedio = calcularPromedio(notas);
        mostrarResultado(promedio);
    }
    //metodo para sacar el promedio
    public static double calcularPromedio(double[] notas) {
        double sumaNotas = 0;

        for (double nota : notas) {
            sumaNotas += nota;
        }
        return sumaNotas / notas.length;
    }
    //mostrar resultado
    public static void mostrarResultado(double promedio) {
        if (promedio >= 4.0) {
            System.out.println("Has aprobado :]");
        } else if (promedio < 3.6) {
            System.out.println("Reprobaste pipipi :[");
        } else {
            System.out.println("Te vas a examen :7");
        }
    }
}
//cambie algunas cosas, algunas un poco sutiles y otras para que se vea algo mas entretenido