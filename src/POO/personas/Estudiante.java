package POO.personas;

import java.util.Random;

public class Estudiante extends Persona implements Beca {
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICACION = 3;
    public static final int DIVISION = 4;

    public Estudiante() {}

    public Estudiante(String nombre, String apellidos,double ahorros ) {
        super(nombre,apellidos, ahorros);
    }


    /**
     * Compruba si es o no becable el estudiante
     * @return resultado
     */
    @Override
    public boolean esBecable() {
        boolean resultado = false;
        if (super.getAhorros() < MAX) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * Metodo que asigna el importe de la beca a los ahorros de la persona
     */
    @Override
    public void pagarbeca() {
        if (esBecable())
            setAhorros(super.getAhorros() + IMPORTE_BECA);
    }

    /**
     * Permite a un estudiante responder preguntas
     * o Cada 2 horas de estudio permiten al estudiante responder a una pregunta
     * @param horas las horas
     */
    public void estudiar(int horas){
        Random r = new Random();
        String respuesta = "";
        if (horas > 0){

            for (int i = 1; i <= horas/2; i++) {
                int op1 = r.nextInt(11);
                int op2 = r.nextInt(11);
                int operador = r.nextInt(4)+1;

                respuesta = responderPregunta(op1, op2, operador);
                System.out.println("Pregunta: " + i);
                System.out.println("--------------");

                switch (operador) {
                    case SUMA -> System.out.println(op1 + " + " + op2 + " ?");
                    case RESTA -> System.out.println(op1 + " - " + op2 + " ?");
                    case MULTIPLICACION -> System.out.println(op1 + " * " + op2 + " ?");
                    case DIVISION -> System.out.println(op1 + " / " + op2 + " ?");
                }

                System.out.println("Respuesta: " + respuesta);
            }
        }
    }

    /**
     * Permite al estudiante dar respuesta a una pregunta
     * Recibirá el primer y el segundo operador como números decimales
     * Además, recibirá la operación como un número entero, cada operación se corresponde con el entero definido en su constante (suma=1, resta=2,multiplicación=3 y división=4)
     * Una vez recibidos los parámetros el estudiante responderá a la pregunt realizando el cálculo que correspondiente y devolviendo el resultado en
     * formato cadena
     * Si hubiera algún error que impidiera realizar el cálculo, se devolverá la explicación del error dentro de la cadena
     * @param operador1 operadores
     * @param operador2 operadores
     * @param operacion operando
     * @return
     */
    private String responderPregunta(double operador1, double operador2, int operacion) {
        double resultado = 0;
        String respuesta = "";
        boolean problema = false;

        switch (operacion) {
            case SUMA -> resultado = operador1 + operador2;
            case RESTA -> resultado = operador1 - operador2;
            case MULTIPLICACION -> resultado = operador1 * operador2;
            case DIVISION -> resultado = operador1 / operador2;
            default -> problema = true;
        }

        if (!problema)
            respuesta = Double.toString(resultado);
        else
            respuesta = "Ha ocurrido un problema";

        return respuesta;
    }

    public String toString(){
        return super.toString();
    }
}
