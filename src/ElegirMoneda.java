import javax.swing.JOptionPane;

public class ElegirMoneda {

    public double monedas(double name2) {
    	
    	String opciones[] = {"Pesos Colombianos a Dolar", "Pesos Colombianos a Euros", "Pesos Colombianos a Libras Esterlinas", "Pesos Colombianos a Yen Japones", "Pesos Colombianos a Won sul-coreano", "Dolar a Pesos Colombianos", "Euros a Pesos Colombianos", "Libras Esterlinas a Pesos Colombianos", "Yen Japones a Pesos Colombianos", "Won sul-coreano a Pesos Colombianos"};
    	String op = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);


		double cantidadMonedas = 0;
		switch (op) {

		case "Pesos Colombianos a Dolar" :
			cantidadMonedas = (name2 * 0.00020);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " Dolares");				
			break;
		case "Pesos Colombianos a Euros":
			cantidadMonedas = (name2 * 0.00019);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " Euros");				
			break;
		case "Pesos Colombianos a Libras Esterlinas":
			cantidadMonedas = (name2 * 0.00017);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " Libras");				
			break;
		case "Pesos Colombianos a Yen Japones":
			cantidadMonedas = (name2 * 0.027628318);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " Yen");				
			break;
		case "Pesos Colombianos a Won sul-coreano":
			cantidadMonedas = (name2 * 0.27);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " Won");				
			break;
		case "Dolar a Pesos Colombianos" :
			cantidadMonedas = (name2 * 4891.34);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " Pesos");				
			break;
		case "Euros a Pesos Colombianos":
			cantidadMonedas = (name2 * 5193.47);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " Pesos");				
			break;
		case "Libras Esterlinas a Pesos Colombianos":
			cantidadMonedas = (name2 * 5896.25);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " Pesos");				
			break;
		case "Yen Japones a Pesos Colombianos":
			cantidadMonedas = (name2 * 36.195);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " Pesos");				
			break;
		case "Won sul-coreano a Pesos Colombianos":
			cantidadMonedas = (name2 * 3.76);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " Pesos");				
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opcion Invalida" + op);
			break;
	}

		return name2;
    }

	
}
