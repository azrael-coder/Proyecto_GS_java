package POO.personas;

public interface Trabajador {
    int JORNADA = 8;

    /**
     * Función que simule que el usuario está trabajando
     */
    void trabajar();

    /**
     * Debe ser una función que simule que un trabajador cobra la nómina recibiendo la
     * cantidad a cobrar.
     */
    void cobrarNomina(double cantidad);

}
