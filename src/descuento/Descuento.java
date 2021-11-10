package descuento;

import javax.swing.JOptionPane;

/**
 *
 * @author VitaminaC
 * @version 1.0
 * @since 08/11/2021
 */
public class Descuento extends Thread {

    private double cantidad;
    private int porcentaje;

    public Descuento(double cantidad, int porcentaje) {
        //Nombre del hilo
        super("Hilo-Descuento");

        //Guardando cantidad y porcentaje
        this.cantidad = cantidad;
        this.porcentaje = porcentaje + 1;
    }

    //Método del hilo
    @Override
    public void run() {
        try {
            Descuento.sleep(500);
            mostrarDescuento();
        } catch (InterruptedException e) {
            System.out.println("ERROR EN EL HILO: " + Descuento.currentThread().getName() + " " + e);
        }
    }

    //Método para mostar el descuento
    private void mostrarDescuento() {
        //Formula: porcentaje * (cantidad / 100)

        double descuento = 0.0;
        descuento = porcentaje * (cantidad / 100);

        //JOptionPane para mostrar el descuento final
        JOptionPane.showMessageDialog(null, "Cantidad original: " + cantidad
                + "\nPorcentaje a descontar: " + porcentaje
                + "\nCantidad con el porcentaje del descuento: " + descuento,
                  "Descuentos [v1.0]", JOptionPane.INFORMATION_MESSAGE);

    }

}
