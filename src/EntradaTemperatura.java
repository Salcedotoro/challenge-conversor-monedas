import javax.swing.JOptionPane;

public class EntradaTemperatura {

	
  	public double tempInput(String op) {
		ElegirTemperatura ElecMoneda = new ElegirTemperatura();
		EntradaCantidad valida = new EntradaCantidad();
 		String cantMonedas;
 		boolean esNumero;
 		
        do {
        	cantMonedas = JOptionPane.showInputDialog(null, "Ingresa la Temperatura qe Deseas Convertir ");        
            esNumero = valida.validar(cantMonedas);        
        } while(esNumero == true);   
		
 		double cantMonNume = Double.parseDouble(cantMonedas);
 		ElecMoneda.temperatura(cantMonNume);
 		return cantMonNume;
	}


}
