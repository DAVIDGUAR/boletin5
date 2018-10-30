package boletin5;

/**
 *
 * @author drodriguezguardiola
 */
public class Boletin5 {

    public static void main(String[] args) {

        //declaro e intancio objeto
        Conta contaOrigen = new Conta("David Rodriguez", "ESS00201555980015641216", 1200.20);
        Conta contaDestino = new Conta();

        //System.out.println("salso=" +contaOrigen.getsaldo());
        contaOrigen.mostrarDatos();

        //contaDestino.setingreso(1500.00);
        contaDestino.mostrarDatos();
        // System.out.println("transferencia="+ saldoConta.getsaldo());
        
        
       contaOrigen.ingreso();
    }
}   