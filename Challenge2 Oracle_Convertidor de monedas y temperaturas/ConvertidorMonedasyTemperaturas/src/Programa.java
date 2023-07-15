import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class Programa {
        // autor Maky Odair Sorto Rodriguez
        public static void main(String[] args) {
        boolean sigue = true;
        while(sigue){
            String[] opciones = {"Conversor de monedas", "Conversor de temperatura"};
            String combo = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            DecimalFormat formatdiv = new DecimalFormat("#.##");
            // conversor de monedas 
            if (combo.equals("Conversor de monedas")) {
                String valor; 
                String[] opciones2 = {"Lempiras a Dolares", "Lempiras a Euros","Lempiras a Libras Esterlinas","Lempiras a Yen Japonés","Lempiras a Won sul-coreano","Dolares a Lempira","Euros a Lempira","Libras Esterlinas a lempiras","Yen Japones a Lempira","Won sul-coreano a Lempira"};
                String combo2 = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor", JOptionPane.QUESTION_MESSAGE, null, opciones2, opciones2[0]);
                valor = (JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir", "Convertidor de moneda", JOptionPane.QUESTION_MESSAGE));
                double[] total = new double [10];
                double lempiras=0;
                try{
                    lempiras= Double.parseDouble(valor);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Dato no valido");
                }
                    if (combo2.equals("Lempiras a Dolares")){
                            total[0] = (lempiras / 24.56);
                            JOptionPane.showMessageDialog(null, "La conversión de Lempiras a Dolares es: " + formatdiv.format(total[0]), combo2, JOptionPane.INFORMATION_MESSAGE);
                    }else if (combo2.equals("Lempiras a Euros")) {
                            total[1] = (lempiras / 27.58);
                            JOptionPane.showMessageDialog(null, "La conversión de Lempiras a Euros es: " + formatdiv.format(total[1]), combo2, JOptionPane.INFORMATION_MESSAGE);
                    }else if (combo2.equals("Lempiras a Libras Esterlinas")){
                            total[2] = (lempiras / 32.15);
                            JOptionPane.showMessageDialog(null, "La conversión de Lempiras a Euros es: " + formatdiv.format(total[2]), combo2, JOptionPane.INFORMATION_MESSAGE);
                    }else if(combo2.equals("Lempiras a Yen Japonés")){
                            total[3] = (lempiras / 0.18);
                            JOptionPane.showMessageDialog(null, "La conversión de Lempiras a Euros es: " + formatdiv.format(total[3]), combo2, JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(combo2.equals("Lempiras a Won sul-coreano")){
                            total[4] = (lempiras / 0.019);
                            JOptionPane.showMessageDialog(null, "La conversión de Lempiras a Euros es: " + formatdiv.format(total[4]), combo2, JOptionPane.INFORMATION_MESSAGE);
                    }
                    // cambios
                    else if(combo2.equals("Dolares a Lempira")){
                            total[5] = (lempiras * 24.56);
                            JOptionPane.showMessageDialog(null, "La conversión de Dolar a Lempira " + formatdiv.format(total[5]), combo2, JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(combo2.equals("Euros a Lempira")){
                            total[6] = (lempiras * 27.58);
                            JOptionPane.showMessageDialog(null, "La conversión de Dolar a Lempira " + formatdiv.format(total[6]), combo2, JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(combo2.equals("Libras Esterlinas a lempiras")){
                            total[7] = (lempiras * 32.15);
                            JOptionPane.showMessageDialog(null, "La conversión de Dolar a Lempira " + formatdiv.format(total[7]), combo2, JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(combo2.equals("Yen Japones a Lempira")){
                            total[8] = (lempiras * 0.18);
                            JOptionPane.showMessageDialog(null, "La conversión de Dolar a Lempira " + formatdiv.format(total[8]), combo2, JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(combo2.equals("Won sul-coreano a Lempira")){
                            total[9] = (lempiras * 0.019);
                            JOptionPane.showMessageDialog(null, "La conversión de Dolar a Lempira " + formatdiv.format(total[9]), combo2, JOptionPane.INFORMATION_MESSAGE);
                    }
                    int confirmacion = JOptionPane.showConfirmDialog(null,"Desea Continuar con el programa?","Seleccione una opcion",JOptionPane.YES_NO_CANCEL_OPTION);
                        if(confirmacion ==JOptionPane.NO_OPTION||confirmacion==JOptionPane.CANCEL_OPTION){
                        sigue=false;
                        JOptionPane.showMessageDialog(null, "El programa a terminado");
                        }else if (confirmacion==JOptionPane.YES_OPTION){
                                sigue = true;    
                        }
                    //conversor de temperatura
            } else if (combo.equals("Conversor de temperatura")) {
                String valor2;
                double dato=0;
                double[] total2 = new double[2];
                String[] opciones3 = {"Celcius a Fahrenheit","Fahrenheit a Celcius"};
                String combo3 = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor", JOptionPane.QUESTION_MESSAGE, null, opciones3, opciones3[0]);
                valor2 = (JOptionPane.showInputDialog(null, "Ingrese la temperatura", "Convertidor de temperatura", JOptionPane.QUESTION_MESSAGE));  
                try{
                    dato= Double.parseDouble(valor2);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Dato no valido");
                }
                        if (combo3.equals("Celcius a Fahrenheit")){
                        total2[0] = (dato *1.8)+32;
                        JOptionPane.showMessageDialog(null, "La conversión de Celcius a Fahrenheit es: " + total2[0], combo3, JOptionPane.INFORMATION_MESSAGE);
                        }else if(combo3.equals("Fahrenheit a Celcius")){
                        total2[1] = (dato-32)/1.8;
                         JOptionPane.showMessageDialog(null, "La conversión de Fahrenheit a Celcius es: " + total2[1], combo3, JOptionPane.INFORMATION_MESSAGE);
                  }
                  int confirmacion = JOptionPane.showConfirmDialog(null,"Desea Continuar con el programa?","Seleccione una opcion",JOptionPane.YES_NO_CANCEL_OPTION);
                        if(confirmacion ==JOptionPane.NO_OPTION||confirmacion==JOptionPane.CANCEL_OPTION){
                                sigue=false;
                                JOptionPane.showMessageDialog(null, "El programa a terminado");
                        }else if (confirmacion==JOptionPane.YES_OPTION){
                                 sigue=true;
                        }
             }
        }
    }
}
