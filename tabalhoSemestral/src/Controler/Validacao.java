package Controler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Validacao {



    public Validacao() {

    }

    public Boolean validarBI(String bi) {

        String aux1 = "";
        float aux2 = 0;
        
        try { 
           
            if ((bi.length() == 13) && (Character.isLetter(bi.charAt(12)))) {

                for (int i = 0; i < bi.length() - 1; i++) {
                    aux1 += bi.charAt(i) + "";
                }
                aux2 = Float.parseFloat(aux1);
            }
        } catch (NumberFormatException e1) {
            return false;
        }

        if ((bi.length() != 13) || (!Character.isLetter(bi.charAt(12))) || ((aux2 < 100000000000f) || (aux2 > 999999999999f))) {
            return false;
        }
        aux1 = "";
        aux2 = 0;
        
        return true;
    }
    
    public static Boolean validarStringObg(String data, int a, int b) {

        if (data.equals("")) {
            return false;
        } else if (data.charAt(0) == ' ') {
            return false;
        } else {
            String palavra = "";
            int j = 0;
            for (int i = 0; i < data.length(); i++) {
                if (data.charAt(i) == ' ') {
                    palavra = data.substring(j, i);
                    j = i + 1;
                    System.out.println(palavra);
                    if (((!palavra.matches("^[a-zA-Z]*$"))) || (data.length() < a || data.length() > b)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
    
    public static Boolean validarString(String data, int a, int b) {

        if (data.equals("")) {
            return true;
        }
        else {
            String palavra = "";
            int j = 0;
            for (int i = 0; i < data.length(); i++) {
                if (data.charAt(i) == ' ') {
                    palavra = data.substring(j, i);
                    j = i + 1;
                    System.out.println(palavra);
                    if (((!palavra.matches("^[a-zA-Z]*$"))) || (data.length() < a || data.length() > b)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public Boolean validarLongObg(String dado, long a, long b) {
        
        long aux;
        if ((!dado.matches("[0-9]*$")) || dado.equals("")) {
            return false;
        }
        aux = Long.parseLong(dado);
        if (aux < a || aux > b) {
            return false;
        }
        return true;
    }
    
    public Boolean validarLong(String dado, long a, long b) {
        
        long aux;
        if ((!dado.matches("[0-9]*$"))) {
            return false;
        }
        else if (dado.equals("")) {
            return true;
        }
        else if (dado.equals(null)) {
            return true;
        }
        aux = Long.parseLong(dado);
        if (aux < a || aux > b) {
            return false;
        }
        return true;
    }

    public Boolean validarFloat(String dado, float a, float b) {
        
        float aux=0;
        
        try {
            aux = Float.parseFloat(dado);
        } catch(NumberFormatException e1) {
            System.out.print("");
        }
        if (aux < a || aux > b) {
            return false;
        }
        else if (aux >= a && aux <= b) {
            return true;
        }
        else if ((!dado.matches("[0-9]*$")) || dado.equals("")) {
            return false;
        }
        return false;
    }
    
    public Boolean vazio(String data) {
        if(data.equals("")) {
            return false;
        }
        return true;
    }
}
