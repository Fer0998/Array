
package array;


public class Array {

    public static void main(String[] args) {
 
        
    Metodos mi = new Metodos();
    
//    int vector[] = new int[10];
//    mi.llenarVectorAleatoriamente(vector, 10);
//    mi.mostrarVectorPorPantalla(vector);
//    
//    int matriz[][]= mi.llenarMatrizAleatoriamenteEntreDosNumeros(4,4,0,10);
//    mi.mostrarMatrizPorPantalla(matriz);
//    System.out.println("");
//    mi.mostrarMatrizTranspuestaPorPantalla(matriz);
    
//    int antisimetrica[][]= {{0,-2,4},{2,0,2},{-4,-2,0}};
//    mi.mostrarMatrizPorPantalla(antisimetrica);
//    System.out.println("");
//    mi.mostrarMatrizTranspuestaPorPantalla(antisimetrica);
//    System.out.println("");
//    System.out.println("Esta matriz es antisimetrica ? = "+mi.matrizAntiSimetrica(antisimetrica));
    
   
    int[][] matriz = {
        {8, 1, 6},
        {3, 5, 7},
        {4, 9, 2}
    };
    int[][] cubo = {
        {8, 1, 6},
        {3, 5, 7},
        {4, 9, 2}
    };
    int[][] dos = {
        {6, 1, 8},
        {7, 5, 3},
        {2, 9, 4}
    };
    int[][] otro={
        {4, 9, 2},
        {3, 5, 7},
        {8, 1, 6}
    };
    int [][] matrizA ={{1,22,36,47,5,6,72,36,5,67},
                          {11,12,13,21,41,22,67,89,90,75},
                          {56,78,87,90,9,90,17,14,36,5},
                          {41,87,24,56,97,74,87,42,64,35},
                          {32,76,79,1,36,5,67,96,12,11},
                          {99,13,54,88,89,90,75,12,41,76},
                          {67,78,87,45,14,22,26,42,56,78},
                          {98,45,34,23,32,56,74,36,5,67},
                          {24,67,97,46,87,13,67,89,90,75},
                          {21,68,78,98,90,67,12,14,22,26}};
    int [][] matriz2={{36,5,67},
                      {89,90,75},
                      {14,22,26}};
    
    mi.mostrarMatrizPorPantalla(matrizA);
        System.out.println("tamaño = "+matrizA[0][matrizA.length-3]) ;
        System.out.println("");
    mi.mostrarMatrizPorPantalla(matriz2);
        System.out.println("La matriz esta contenida? : "+mi.matrizContenida(matrizA,matriz2));
 
    }
    
}
