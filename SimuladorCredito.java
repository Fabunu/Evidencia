public class SimuladorCredito {
    public static void main(String[] args) {

        simularCredito(1000000.0, 10);
        simularCredito(500000.0, 25);
        simularCredito(2500000.0, 20);

    }

    public static void simularCredito(double montoCredito, int cuotas) {
        double tasaInteres = obtenerTasaInteres(montoCredito, cuotas);

        double montoTotalaPagar = montoCredito * (1 + tasaInteres);

        double cuotaMensual = montoTotalaPagar/cuotas;

        //mostrar el resultado
        System.out.println("monto total a pagar: " + String.format("%.0f", montoTotalaPagar));
        System.out.println("cuota mensual: " + String.format("%.0f", cuotaMensual));
        
    }

    public static double obtenerTasaInteres(double montoCredito, int cuotas) {
        if (montoCredito <= 1000000) {
            if (cuotas <= 12) {
                return 0.25;
            } else if (cuotas <= 23) {
                return 0.3;
            } else {
                return 0.35;
            }
        } else {
            if (cuotas <= 12) {
                return 0.15;
            } else if (cuotas <= 23) {
                return 0.2;
            } else {
                return 0.25;
            }
        }
    }
        
    }
