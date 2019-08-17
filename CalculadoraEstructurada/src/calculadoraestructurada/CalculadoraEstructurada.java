
package calculadoraestructurada;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class CalculadoraEstructurada {

    public static void main(String[] args) {
        System.out.println("***Bienvenido a la Calculadora***");
        System.out.println("***Programada bajo el paradigma estrucutado***");
        System.out.println("\nIngrese el primer valor a operar: ");
        Scanner valor1 = new Scanner(System.in);
        int primervalor = valor1.nextInt();
        System.out.println("\nIngrese el segundo valor a operar: ");
        Scanner valor2 = new Scanner(System.in);
        int segundovalor = valor2.nextInt();
    
        System.out.println("\nSeleccione la operacion a realizar: ");
        System.out.println("***1 = Suma***");
        System.out.println("***2 = Resta***");
        System.out.println("***3 = Multiplicacion***");
        System.out.println("***4 = Division***");
        Scanner opcionElegida = new Scanner(System.in);
        int elegi = opcionElegida.nextInt();
        System.out.println("Opcion Elegida es: "+elegi);
        
        
        if (elegi== 1){
            int resultadoSuma;
            resultadoSuma= primervalor+segundovalor;
            System.out.println("El resultado de la suma es : "+ resultadoSuma);
        } else if(elegi==2){
           int resultadoResta;
           resultadoResta = primervalor-segundovalor;
           System.out.println("El resultado de la resta es: "+resultadoResta);
        } else if(elegi ==3){
            int resultadoMulti;
            resultadoMulti = primervalor*segundovalor;
            System.out.println("El resultado de la multiplicacion es: "+resultadoMulti);
        }else if (elegi ==4){
            int resultadoDivision;
            resultadoDivision = primervalor/segundovalor;
            System.out.println("El resutado de la division es: "+resultadoDivision);
        } else{
            System.out.println("La opcion elegida no corresponde a una valida");
        }
        
        
        
    }
    
}
