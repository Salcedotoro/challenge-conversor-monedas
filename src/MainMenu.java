import javax.swing.JOptionPane;

public class MainMenu {

	public static void main(String[] args) {

		SALIR: while (true) {

			EntradaCantidad CantMoneda = new EntradaCantidad();
			EntradaTemperatura NivelTemp = new EntradaTemperatura();
			String opciones[] = { "Conversor de Monedas", "Conversor de Temperatura" };
			
			try {
			String op = (String) JOptionPane.showInputDialog(null, "Seleccione una Opción de Conversión", "Menu",
					JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
		
			switch (op) {
			case "Conversor de Monedas":
				CantMoneda.mInput(op);
				break;
			case "Conversor de Temperatura":
				NivelTemp.tempInput(op);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion Invalida" + op);
				break SALIR;
			}

			} catch (Exception e) { 
			}
			
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea Continar", "Select an Option",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			switch (resp) {
			case 0:
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Programa Terminado");
				break SALIR;
			case 2:
				JOptionPane.showMessageDialog(null, "Programa Terminado");
				break SALIR;
			}

			

		}
	}

}
