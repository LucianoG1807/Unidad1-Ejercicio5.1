public class TanqueAgua {

    /*
    5 — Monitoreo de Tanque de Agua

Contexto

Los sistemas de almacenamiento hídrico en edificios residenciales necesitan sensores
que controlen el nivel de llenado para evitar desbordes o faltantes en el suministro.

Consigna

Programar una clase que modele un tanque de agua inteligente con capacidad máxima y volumen actual medido en litros.

Desarrollo requerido

Definir la clase TanqueAgua con los atributos capacidadMaximaLitros (double) y nivelActualLitros (double).

Incorporar un constructor que inicialice el tanque asegurando que el nivel actual nunca supere la capacidad máxima.

Implementar un método llenar(double litros) (que detenga o limite el llenado al llegar al máximo)
y un método consumir(double litros) (verificando que haya suficiente agua).

En el método main, instanciar el tanque, realizar operaciones de carga y consumo de agua,
y mostrar el estado porcentual de llenado por consola.
     */

    double capacidadMaximaLts;
    double nivelActualLts;

    TanqueAgua (double capacidadMaximaLts, double nivelActualLts) {

        if (nivelActualLts < capacidadMaximaLts && nivelActualLts > 0) {

            this.capacidadMaximaLts = capacidadMaximaLts;
            this.nivelActualLts = nivelActualLts;
        }
    }

    void llenar (double litros) {

        nivelActualLts += litros;

        if (nivelActualLts == capacidadMaximaLts) {
            System.out.println("TANQUE DE AGUA LLENO.");
        }
        else if (nivelActualLts <= capacidadMaximaLts) {
            System.out.println("Llenando... Capacidad restante: " + (capacidadMaximaLts - nivelActualLts) + " litros.");
        }
        else {
            System.out.println("Ingrese una menor cantidad de agua para evitar desbordamiento.");
            nivelActualLts -= litros;
        }
    }

    void consumir (double litros) {

        nivelActualLts -= litros;

        if (nivelActualLts > 0) {
            System.out.println("AGUA RESTANTE: " + nivelActualLts + " litros.");
        }
        else {
            System.out.println("Agua insuficiente. Debe iniciar llenado de tanque.");
            nivelActualLts += litros;
        }

        if(nivelActualLts <= 10 && nivelActualLts > 0) {
            System.out.println("Esta utilizando la reserva de agua del tanque. Debe iniciar llenado de tanque." + nivelActualLts);
        }
    }
}
