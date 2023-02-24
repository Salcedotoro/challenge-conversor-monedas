import javax.swing.JOptionPane;

public class EntradaCantidad {

  	public double mInput(String op) {
		ElegirMoneda ElecMoneda = new ElegirMoneda();
 		String cantMonedas;
 		boolean esNumero;
 		
        do {
        	cantMonedas = JOptionPane.showInputDialog(null, "Ingresa la Cantidad de Dinero qe Deseas Convertir ");        
            esNumero = validar(cantMonedas);        
        } while(esNumero == true);   
		
 		double cantMonNume = Double.parseDouble(cantMonedas);
 		ElecMoneda.monedas(cantMonNume);
 		return cantMonNume;
	}

  	
    public boolean validar(String valor) {
        boolean esNumero;
        
        if (valor.matches("[0-9]*")) {
           esNumero = false;
        } else {
            JOptionPane.showMessageDialog(null, "No es un número, ingreselo de nuevo");
            esNumero = true;
        }        
        return esNumero;
    }        

}

