import javax.swing.*;

public class Practica {
    public static void main(String[] args) {
        String numerostring;
        String numerosaparecen="";
        String numerosnoaparecen="";
        int i = 0;
        numerostring = JOptionPane.showInputDialog("Introduzca el número:");
        while (i<=9) {
            String valorstring = Integer.toString(i);
            boolean existe = false;

            for (int j = 0; j < numerostring.length(); j++) {
                char caracterJ = numerostring.charAt(0);
                char caracterI = valorstring.charAt(j);

                if (caracterI == caracterJ) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                numerosaparecen +=  i + ", ";
            } else {
                numerosnoaparecen += i + ", ";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null,"Los numeros " + numerosaparecen + "aparecen\n" + "Los numeros " + numerosnoaparecen + "no aparecen");
        System.exit(0);
    }
}