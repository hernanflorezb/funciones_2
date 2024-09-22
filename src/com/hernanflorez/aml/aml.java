package com.hernanflorez.aml;

import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList ;
import java.util.List ;
public class aml {
    private static Object leer;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al Programa de operaciones y Funciones");
        int play;
        do {
            System.out.println("Por favor selecciones una opcion");
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicacion");
            System.out.println("3. Potencia");
            System.out.println("4. Factorial");
            System.out.println("5. Calcular area Cuadrado");
            System.out.println("6. Calcular area Circulo");
            System.out.println("7. Calcular el Volumen de un Cono");
            System.out.println("8. Mostrar los n numeros  de la serie  de Fibonacci");
            System.out.println("9. Suma de elementos en un arreglo");
            System.out.println("10. Mayor y menor");
            System.out.println("11. Multiplicacion de matrices");
            System.out.println("12. Promedio de elementos de un Arreglo");
            System.out.println("13. Rotacion de un Arreglo");
            System.out.println("14. Algoritmo de Burbuja");
            System.out.println("15. Suma de dos Vectores");
            System.out.println("16. Buscar un Elemento en una lista");
            System.out.println("17. Eliminar Duplicado en una lista");
            System.out.println("18. Transpuesta de una matriz");
            System.out.println("19. Salir");
            System.out.print("su eleccion es:");
            int list = leer.nextInt();
            switch (list) {
                case 1:
                    suma();
                    break;
                case 2:
                    multip();
                    break;
                case 3:
                    potencias();
                    break;
                case 4:
                    factori();
                    break;
                case 5:
                    area();
                    break;
                case 6:
                    circul();
                    break;
                case 7:
                    cono();
                    break;
                case 8:
                    fibonacci();
                    break;
                case 9:
                    arraysuma();
                    break;
                case 10:
                    mayormenor();
                    break;
                case 11:
                    multimatrix();
                    break;
                case 12:
                    promarreglo();
                    break;
                case 13:
                    rotarreglo();
                    break;
                case 14:
                    burbuja();
                    break;
                case 15:
                    vectores();
                    break;
                case 16:
                    buscarelemento();
                    break;
                case 17:
                    duplicado();
                    break;
                case 18:
                    transpuesta();
                    break;
                case 19:
                    System.out.println("Gracias por usar este programa");
                    break;
                default:
                    System.out.println("Opcion no Valida");
            }
            System.out.println("Quiere seguir operando, 1.SI 2.NO");
            play = leer.nextInt();
        } while (play == 1);
    }

    public static void suma() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese primer numero a sumar");
        int numerone = leer.nextInt();
        System.out.println("Por favor ingrese segundo numero a sumar");
        int numerotwo = leer.nextInt();
        int resuma = numerone + numerotwo;
        System.out.println("La suma es:" + resuma);
    }

    public static void multip() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero a multiplicar");
        int multione = leer.nextInt();
        System.out.println("Ingrese segundo numero a multiplicar");
        int multitwo = leer.nextInt();
        int resulmulti = 0;
        for (int i = 1; i <= multitwo; i++) {
            resulmulti = resulmulti + multione;
        }
        System.out.println("el numero multiplicado es:" + resulmulti);
    }

    public static void potencias() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de base");
        int base = leer.nextInt();
        System.out.println("Ingrese el numero de exponente");
        int exponente = leer.nextInt();
        int resulpotencia;
        int contador;
        contador = base;
        if (exponente == 0) {
            System.out.println("el resultado es: 1");
        } else {
            for (int i = 2; i <= exponente; i++) {
                resulpotencia = 0;
                for (int j = 1; j <= contador; j++) {
                    resulpotencia = resulpotencia + base;
                }
                base = resulpotencia;
            }
            System.out.println("el resultado es:" + base);
        }
    }

    public static void factori() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Seccion para calculo de Numero Factorial");
        System.out.println("Ingrese el numero a operar");
        int numfact = leer.nextInt();
        int fact = 1;
        for (int i = 1; i <= numfact; i++) {
            fact = fact * i;
        }
        System.out.println("El Factorial de:" + numfact + "es:" + fact);
    }

    public static void area() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor Ingrese el radio");
        int lado = leer.nextInt();
        int area = areaCuadrado(lado);
        System.out.println("El area del cuadrado es:" + area);
    }

    public static int areaCuadrado(int lado) {
        return lado * lado;
    }

    public static void circul() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo: ");
        double radio = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + areaCirculo);
    }

    public static void cono() {
        Scanner scanner = new Scanner(System.in);
        double volumenCono;
        System.out.println("Ingresa el radio del circulo: ");
        double radio = scanner.nextDouble();
        System.out.println("Ingresa la altura del cono: ");
        double alturaCono = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        volumenCono = (alturaCono * areaCirculo) / 3;
        System.out.println("El volumen del cono es: " + volumenCono);
    }

    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el valor de la serie: ");
        int serie = scanner.nextInt();
        int numb1 = 0;
        int numb2 = 1;
        int suma = 1;
        for (int i = 1; i <= serie; i++) {
            suma = numb1 + numb2;
            numb1 = numb2;
            numb2 = suma;
            System.out.println("El valor de la serie es:" + suma);
        }
        System.out.println("El valor de la serie " + serie + " es:" + suma);
    }

    public static void arraysuma() {
        Scanner scanner = new Scanner(System.in);
        int[] coutarraysuma = new int[5];
        int resultarraysuma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Por favor ingrese un numero:" + i);
            coutarraysuma[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            resultarraysuma = resultarraysuma + coutarraysuma[i];
        }
        System.out.println("La suma de los valores ingresados es:" + resultarraysuma);
    }

    public static void mayormenor() {
        Scanner scanner = new Scanner(System.in);
        int[] coutmayor = new int[10];
        int mayor = 0;
        int menor = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor ingrese un numero:" + i);
            coutmayor[i] = scanner.nextInt();
        }
        for (int i = 0; i < coutmayor.length; i++) {
            if (coutmayor[i] > mayor) {
                mayor = coutmayor[i];
            }
            if (coutmayor[i] < menor) {
                menor = coutmayor[i];
            }
        }
        System.out.println("El valor mayor es: " + mayor + " El valor menor es: " + menor);
    }

    public static void multimatrix() {
        Scanner scanner = new Scanner(System.in);
        int[][] onematrix = new int[4][4];
        int[][] twomatrix = new int[4][4];
        int[][] resulmatrix = new int[4][4];
        int i,j,k;
        Scanner sc= new Scanner(System.in);
        System.out.println("Por favor ingrese los valores de la primera matriz:");
        for (i = 0; i < onematrix.length; i++) {
            for ( j = 0; j < onematrix[i].length; j++) {
                System.out.println("Ingresa un numero:");
                onematrix[i][j] = sc.nextInt();
            }
        }
       System.out.println("Por favor ingrese los valores de la segunda matriz:");
        for (i = 0; i < twomatrix.length; i++) {
            for ( j = 0; j < twomatrix[i].length; j++) {
                System.out.println("Ingresa un numero:");
                twomatrix[i][j]=sc.nextInt();
                }
            }
        //multiplicacion matriz
        for (i = 0; i < onematrix.length; i++) {
                for ( j = 0; j < twomatrix[0].length; j++) {
                    for ( k = 0; k < onematrix[0].length; k++) {
                        resulmatrix[i][j] += onematrix[i][k] * twomatrix[k][j];
                    }
                }
        }
        for ( i = 0; i < resulmatrix.length; i++) {
            for (j = 0; j < resulmatrix[0].length; j++) {
                        System.out.print("  " +resulmatrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void promarreglo() {
        Scanner scanner = new Scanner(System.in);
        int[] promedioarray = new int[8];
        int resularray = 0;
        for (int i = 0; i < promedioarray.length; i++) {
            System.out.println("Por favor ingrese un numero:" + i);
            promedioarray[i] = scanner.nextInt();
        }
        for (int i = 0; i < promedioarray.length; i++) {
            resularray = resularray + promedioarray[i];
        }
        resularray=resularray/ promedioarray.length;
        System.out.println("El promedio de los valores ingresados es:" + resularray);
    }
    public static void rotarreglo() {
        Scanner scanner = new Scanner(System.in);
        int[] rotararray = new int[5];
        System.out.println("Por favor ingrese cinco numeros del arreglo");
        for (int i = 0; i < rotararray.length; i++) {
            System.out.println("Ingrese el numero en la posicion  " + i);
            rotararray[i] = scanner.nextInt();
        }
        int ultimo = rotararray[4];
        for (int i = 3; i>=0; i--) {
            rotararray[i+1]=rotararray[i];
        }
        rotararray[0]=ultimo;
        System.out.println("el nuevo arreglo es:");
        for (int i = 0; i < rotararray.length; i++) {
            System.out.println("posicion "+i+"  "+rotararray[i]);
        }
    }
    public static void burbuja() {
        Scanner scanner = new Scanner(System.in);
        int[] burbujarray = new int[7];
        int intercambio=0;
        System.out.println("Por favor ingrese siete numeros del arreglo");
        for (int i = 0; i < burbujarray.length; i++) {
            System.out.println("Ingrese el numero en la posicion  " + (i+1));
            burbujarray[i] = scanner.nextInt();
        }
        for (int i = 0; i<burbujarray.length-1; i++) {
            for (int j = 0; j < burbujarray.length-1; j++) {
                if(burbujarray[j]>burbujarray[j+1]){
                    intercambio=burbujarray[j];
                    burbujarray[j]=burbujarray[j+1];
                    burbujarray[j+1]=intercambio;
                }
            }
        }
        System.out.println("El arreglo ordenado es:");
        for(int i=0; i< burbujarray.length;i++){
            System.out.println("los nuevos valores ordenados en la posicion "+(i+1)+" es "+burbujarray[i]);
        }
    }
    public static void vectores() {
        Scanner scanner = new Scanner(System.in);
        int[] onevector = new int[3];
        int[] twovector= new int[3];
        int[] resultvector=new int[3];
        System.out.println("Por favor ingrese los tres numeros del primer vector");
        for (int i = 0; i < onevector.length; i++) {
            System.out.println("Ingrese el numero en la posicion  " + (i+1));
            onevector[i] = scanner.nextInt();
        }
        System.out.println("Por favor ingrese los tres numeros del segundo vector");
        for (int i = 0; i < twovector.length; i++) {
            System.out.println("Ingrese el numero en la posicion  " + (i+1));
            twovector[i] = scanner.nextInt();
        }
        System.out.println("El resultado de la suma de los vectores es:");
        for (int i = 0; i < resultvector.length; i++) {
            resultvector[i]=onevector[i]+twovector[i];
            System.out.println("El resultado   "+(i+1)+": " +resultvector[i]);
        }
    }
    public static void buscarelemento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de elementos que va a tener lista: ");
        int nNumero = scanner.nextInt();
        int Numero[] = new int[nNumero];
        boolean creciente= true;
        int BuscarNumero=0;
        do{
            System.out.println("Se van a ingresar los datos en la lista");
            for (int i = 0; i < Numero.length; i++) {
                System.out.print("Digite el numero "+(i+1)+ ": ");
                Numero[i] = scanner.nextInt();
            }
            for (int i = 0; i < Numero.length-1; i++) {
                if(Numero[i]<Numero[i+1]){
                    creciente=true;
                }
                if(Numero[i]>Numero[i+1]){
                    creciente=false;
                    break;
                }
            }
            if(creciente==false){
                System.out.println("Los numeros ingresados no estan en orden, digite nuevamente en orden");
            }
        }while(creciente==false);

        System.out.print("Por favor digite el numero a buscar en la lista: ");
        BuscarNumero=scanner.nextInt();
        int i=0;

        while(i<Numero.length&&Numero[i]<BuscarNumero){
            i++;
        }
        if(i==Numero.length){
            System.out.println("El numero no ha sido encontrado");
        }else{
            if(Numero[i]==BuscarNumero){
                System.out.println("El numero encontrado esta en la posicion "+i);
                System.out.println("El numero es "+Numero[i]);
            }else{
                System.out.println("El numero no encontrado");
            }
        }

    }
    public static void duplicado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de elementos que va a tener lista: ");
        int nNumero = scanner.nextInt();
        int Numero[] = new int[nNumero];
        boolean creciente= true;
        int DuplicadoNumero=0;
        do{
            System.out.println("Se va a ingresar los datos en la lista");
            for (int i = 0; i < Numero.length; i++) {
                System.out.print("Digite el numero "+(i+1)+ ": ");
                Numero[i] = scanner.nextInt();
            }
            for (int i = 0; i < Numero.length-1; i++) {
                if(Numero[i]<Numero[i+1]){
                    creciente=true;
                }
                if(Numero[i]>Numero[i+1]){
                    creciente=false;
                    break;
                }
            }
            if(creciente==false){
                System.out.println("Los numeros ingresados no estan en orden, digite nuevamente en orden");
            }
        }while(creciente==false);
        int j,k,l;
        for(j=0;j<Numero.length;j++){
            k=j+1;
            while(k<nNumero){
                if(Numero[j]==Numero[k]){
                    for (l=k;l<Numero.length-1;l++){
                        Numero[l]=Numero[l+1];
                    }
                    (nNumero)--;
                }else{
                    k++;
                }
            }
        }
        for (int i = 0; i < nNumero; i++) {
            System.out.println("El Nuevo Arreglo es "+(i+1)+": " +Numero[i]);
        }


    }
    public static void transpuesta() {
        Scanner scanner = new Scanner(System.in);
        int matrizt[][] = new int [3][3];
        System.out.println("Por favor ingrese los valores de la matriz:");
        for (int i = 0; i < 3; i++) {
            for ( int j = 0; j < 3; j++) {
                System.out.print("matriz["+i+"] ["+j+"]: ");
                matrizt[i][j] = scanner.nextInt();
            }
        }
        System.out.println("La matriz Original:");
        for (int i = 0; i < 3; i++) {
            for ( int j = 0; j < 3; j++) {
                System.out.print(" "+matrizt[i][j]+" ");
            }
            System.out.println("");
        }
        int auxmatriz=0;
        for (int i = 0; i < 3; i++) {
            for ( int j = 0; j < 3; j++) {
                auxmatriz=matrizt[i][j];
                matrizt[i][j]=matrizt[j][i];
                matrizt[j][i]=auxmatriz;
            }
        }
        System.out.println("La matriz Transpuesta es:");
        for (int i = 0; i < 3; i++) {
            for ( int j = 0; j < 3; j++) {
                System.out.println(" "+matrizt[i][j]+" ");
            }
        }
        System.out.println("");
    }
}

