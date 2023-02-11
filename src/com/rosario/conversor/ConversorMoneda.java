package com.rosario.conversor;

import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorMoneda {
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        double pesos=0;
        DecimalFormat decimalFormato=new DecimalFormat("#.##");
        int opMenuConvertir=0;
        String conversion="";
        String menu= """
                Seleccionar alguna opción
                ************************************************
                1.	Ingresar cantidad en pesos mexicanos
                2.	Dólar
                3.	Euro
                4.	Franco
                5.	Bolivar
                6. Peso Colombiano
                7.	Salir                             
                """;

        //proceso
        //menu de aplicacion
        while (opMenuConvertir!=7){

            opMenuConvertir = Integer.parseInt(JOptionPane.showInputDialog(
                    null,menu,"Conversor de Monedas",
                    JOptionPane.INFORMATION_MESSAGE));

            switch (opMenuConvertir){

                case 1:
                    pesos=Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Ingresa la cantidad en pesos mexicanos",
                            "Entrada de datos",JOptionPane.INFORMATION_MESSAGE));

                    if (pesos>=0)
                        JOptionPane.showMessageDialog(null,"Seleccionar moneda a convertir ",
                                "Informacion Importante ",JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null,"La cantidad debe ser mayor o igual a 0 ",
                                "Cantidad Invalida",JOptionPane.WARNING_MESSAGE);
                    break;
                case 2:
                    conversion = "" + pesos + " Pesos Mexicanos es igual a " + decimalFormato.format(convertirDolar(pesos)) + " Dolares " ;
                    JOptionPane.showMessageDialog(null,conversion," Conversion a Dolares",JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 3:
                    conversion = "" + pesos + " Pesos Mexicanos es igual a " + decimalFormato.format(convertirEuro(pesos)) + " Euros " ;
                    JOptionPane.showMessageDialog(null,conversion, " Conversion a Euros ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    conversion = "" + pesos + " Pesos Mexicanos es igual a " + decimalFormato.format(convertirFranco(pesos)) + " Franco " ;
                    JOptionPane.showMessageDialog(null,conversion," Conversion a franco ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    conversion = "" + pesos + " Pesos Mexicanos es igual a " + decimalFormato.format(convertirBolivar(pesos)) + " Bolivar ";
                    JOptionPane.showMessageDialog(null,conversion," Conversion a bolivar ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                    conversion = "" + pesos + " Pesos Mexicanos es igual a " + decimalFormato.format(convertirP_Colombiano(pesos)) + " Peso Colombiano";
                    JOptionPane.showMessageDialog(null,conversion, " Conversion a bolivar ",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"Gracias por usar la aplicacion ", " Salida ",JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        }
        System.exit(0);

    }
    //creacion de funciones para convertir a diferentes monedas

    public static double convertirDolar(double pesos){
        final double P_DOLAR=0.053;
        return pesos*P_DOLAR;
    }
    public static double convertirEuro(double pesos){
        final double P_EURO=0.049;
        return pesos*P_EURO;
    }
    public static double convertirFranco(double pesos){
        final double P_FRANCO=56.85;
        return pesos*P_FRANCO;
    }
    public static double convertirBolivar(double pesos){
        final double P_BOLIVAR=1.25;
        return pesos*P_BOLIVAR;
    }
    public static double convertirP_Colombiano(double pesos){
        final double P_COLOMBIANO=0.004;
        return pesos*P_COLOMBIANO;
    }

}
