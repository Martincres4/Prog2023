package tridimensionales;
import java.util.Random;
public class galaxiaPrueba {
    public static void main(String[] args) {
        int dimension = 10;
        int[][][] universo = new int[dimension][dimension][dimension];
        Random random = new Random();

        // Inicializar el universo con pesos aleatorios
        for (int x = 0; x < dimension; x++) {
            for (int y = 0; y < dimension; y++) {
                for (int z = 0; z < dimension; z++) {
                    universo[x][y][z] = random.nextInt(100); // Peso aleatorio entre 0 y 99
                }
            }
        }

        // Simulación de movimiento y colisión
        int numIteraciones = 100; // Número de iteraciones de la simulación
        for (int iteracion = 0; iteracion < numIteraciones; iteracion++) {
            for (int x = 0; x < dimension; x++) {
                for (int y = 0; y < dimension; y++) {
                    for (int z = 0; z < dimension; z++) {
                        int pesoActual = universo[x][y][z];
                        int xDestino = x;
                        int yDestino = y;
                        int zDestino = z;
                        int pesoMax = -1;

                        // Buscar la galaxia más cercana con peso mayor
                        for (int i = -1; i <= 1; i++) {
                            for (int j = -1; j <= 1; j++) {
                                for (int k = -1; k <= 1; k++) {
                                    int nuevoX = x + i;
                                    int nuevoY = y + j;
                                    int nuevoZ = z + k;

                                    if (nuevoX >= 0 && nuevoX < dimension &&
                                        nuevoY >= 0 && nuevoY < dimension &&
                                        nuevoZ >= 0 && nuevoZ < dimension &&
                                        (i != 0 || j != 0 || k != 0)) {
                                        int pesoVecino = universo[nuevoX][nuevoY][nuevoZ];
                                        if (pesoVecino > pesoMax) {
                                            pesoMax = pesoVecino;
                                            xDestino = nuevoX;
                                            yDestino = nuevoY;
                                            zDestino = nuevoZ;
                                        }
                                    }
                                }
                            }
                        }

                        // Mover la galaxia hacia la más cercana con peso mayor
                        if (pesoMax > pesoActual) {
                            universo[xDestino][yDestino][zDestino] += pesoActual;
                            universo[x][y][z] = 0;
                        }
                    }
                }
            }
        }

        // Imprimir el estado final del universo
        for (int x = 0; x < dimension; x++) {
            for (int y = 0; y < dimension; y++) {
                for (int z = 0; z < dimension; z++) {
                    System.out.println("Galaxia en (" + x + "," + y + "," + z + ") - Peso: " + universo[x][y][z]);
                }
            }
        }
    }
}
