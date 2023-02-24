import javax.swing.JOptionPane;

public class ElegirTemperatura {

    public double temperatura(double nivel) {
    	
    	String opciones[] = {"°Celsius a °Fahrenheit", "°Fahrenheit a °Celsius", "°Celsius a Kelvin", "Kelvin a °Celsius", "°Fahrenheit a Kelvin", "Kelvin a °Fahrenheit"};
    	String op = (String) JOptionPane.showInputDialog(null, "Elije la temperatura a la que deseas convertir", "Temperaturas", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);


		double cantidadMonedas = 0;
		switch (op) {

		case "°Celsius a °Fahrenheit" :
			cantidadMonedas = ((nivel * 1.8) + 32);
        	JOptionPane.showMessageDialog(null, "Son:  " + cantidadMonedas + " °F");				
			break;
		case "°Fahrenheit a °Celsius":
			cantidadMonedas = ((nivel - 32) / 1.8);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " °C");				
			break;
		case "°Celsius a Kelvin":
			cantidadMonedas = (nivel + 273.15);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " K");				
			break;
		case "Kelvin a °Celsius":
			cantidadMonedas = (nivel - 273.15);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " °C");				
			break;
		case "°Fahrenheit a Kelvin":
			cantidadMonedas = (0.55 * (nivel - 32) + 273.15);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " K");				
			break;
		case "Kelvin a °Fahrenheit":
			cantidadMonedas = (1.8 * (nivel - 273.15) + 32);
        	JOptionPane.showMessageDialog(null, "Tienes: " + cantidadMonedas + " °F");				
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opcion Invalida" + op);
			break;
	}

		return nivel;
    }

	
	
}


