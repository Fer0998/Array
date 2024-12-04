
package array;

import java.util.concurrent.ThreadLocalRandom;


public class Metodos {
    
    
public Metodos(){}

//-------------------------------------------------------------------------
    public void mostrarVectorPorPantalla(int aux[]) {
// Método para mostrar el contenido de un vector (arreglo unidimensional)

        System.out.print("[ ");
        // Se imprime cada elemento del vector
        for (int nro : aux) {
            System.out.print(nro + " ");
        }
        System.out.println("]");
    }

//-------------------------------------------------------------------------
    public int[] llenarVectorAleatoriamente(int vec[], int nroRandom) {
// Método para llenar un vector con números aleatorios entre 1 y nroRandom

        for (int i = 0; i < vec.length; i++) {
            // Asignación de un valor aleatorio al vector  
            vec[i] = (int) (Math.random() * nroRandom) + 1;
        }
        return vec;

    }

//-------------------------------------------------------------------------
    public int[][] llenarMatrizAleatoriamente(int fila, int columna, int nroRandom) {
// Método para llenar una matriz con números aleatorios entre 1 y nroRandom    
        int mat[][] = new int[fila][columna];

        // Se llena la matriz con números aleatorios
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat1.length; j++) {
                mat1[j] = (int) (Math.random() * nroRandom) + 1;
            }
        }
        return mat;
    }

//---------------------------------------------------------------------------
    public void mostrarMatrizPorPantalla(int mat[][]) {
// Método para mostrar una matriz en consola

        for (int[] mat1 : mat) {
            System.out.print("[ ");
            for (int j = 0; j < mat1.length; j++) {
                System.out.print(mat1[j] + " ");
            }
            System.out.println("]");
        }
    }

//---------------------------------------------------------------------------
    public void mostrarMatrizTranspuestaPorPantalla(int mat[][]) {
// Método para mostrar la matriz transpuesta (intercambia filas y columnas)  

        for (int i = 0; i < mat.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < mat[i].length; j++) {
                // Se imprime la transposición de la matriz
                System.out.print((mat[j][i]) + " ");
            }
            System.out.println("]");
        }
    }
//---------------------------------------------------------------------------

    public int[][] llenarMatrizAleatoriamenteEntreDosNumeros(int fila, int columna, int inferior, int superior) {
// Método para llenar una matriz con números aleatorios entre un rango definido (inferior y superior)    
        int mat[][] = new int[fila][columna];

        // Llenado de la matriz con valores aleatorios dentro del rango
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat1.length; j++) {
                mat1[j] = ThreadLocalRandom.current().nextInt(inferior, superior);

            }
        }
        return mat;
    }

//---------------------------------------------------------------------------
    public boolean matrizAntiSimetrica(int mat[][]) {
// Método que verifica si una matriz es anti simétrica (matriz[i][j] == -matriz[j][i])
// Compara cada elemento de la matriz con su opuesto en la posición simétrica

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != (mat[j][i] * -1)) {
                    return false;// Si no es anti simétrica, devuelve false
                }
            }
        }
        return true;// Si todas las condiciones se cumplen, es anti simétrica
    }

//---------------------------------------------------------------------------
    public boolean esMagico(int mat[][]) {
// Método que verifica si una matriz es mágica (la suma de las filas, columnas y diagonales es constante)

        int nroMagico = 0;
        int fila, colum, diag;

        // Calcula la suma de la primera diagonal como referencia
        for (int i = 0; i < mat.length; i++) {
            nroMagico += mat[i][(mat.length - i) - 1];
        }

        // Compara las sumas de filas, columnas y diagonales con la referencia
        for (int i = 0; i < mat.length; i++) {
            fila = 0;
            colum = 0;
            diag = 0;

            // Suma fila, columna y diagonal
            for (int j = 0; j < mat[i].length; j++) {
                fila += mat[i][j];
                colum += mat[j][i];
                diag += mat[j][j];
            }

            // Si alguna suma no coincide con la referencia, la matriz no es mágica
            if ((nroMagico != fila) && (nroMagico != colum) && (nroMagico != diag)) {
                return false;
            }
        }
        return true;// Si todas las sumas son iguales, la matriz es mágica
    }
//------------------------------------------------------------------------------

    public boolean matrizContenida(int mat[][], int matContenida[][]) {
// Método que verifica si una matriz pequeña (submatriz) está contenida dentro de una matriz mayor

        int nroABuscar = matContenida[0][0];

        // Recorre la matriz mayor buscando el primer elemento de la submatriz
        for (int i = 0; i < mat.length - 3; i++) {
            for (int j = 0; j < mat[i].length - 3; j++) {

                if (mat[i][j] == nroABuscar) {
                    boolean coincide = true;

                    // Compara la submatriz con la parte de la matriz mayor
                    for (int x = 0; x < matContenida.length && coincide; x++) {
                        for (int y = 0; y < matContenida[x].length; y++) {

                            if (mat[i + x][j + y] != matContenida[x][y]) {
                                coincide = false;
                                break;
                            }
                        }
                        if (!coincide) {
                            break;
                        }
                    }
                    // Si coincide, imprime los índices y devuelve true    
                    if (coincide) {
                        System.out.println("los sub indices son[" + i + "] y [" + j + "]");
                        return true;
                    }
                }
            }
        }
        return false;// Si no encuentra la submatriz, devuelve false
    }
}//fin class
