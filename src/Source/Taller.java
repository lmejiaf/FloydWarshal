/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author lmejiaf
 */
public class Taller {
//infinito =999999999

    static int[][] dist = {{0, 4, 9, 999999999, 15},
    {999999999, 0, 999999999, 999999999, 3},
    {999999999, 1, 0, 4, 3},
    {7, 999999999, 999999999, 0, 2},
    {999999999, 5, 999999999, 999999999, 0}};
    static String[][] cam = {{"A", "B", "C", "D", "E"},
    {"A", "B", "C", "D", "E"},
    {"A", "B", "C", "D", "E"},
    {"A", "B", "C", "D", "E"},
    {"A", "B", "C", "D", "E"}};

    public static void FW() {
        for (int k = 0; k < dist.length; k++) {
            for (int i = 0; i < dist.length; i++) {
                for (int j = 0; j < dist.length; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        cam[i][j] = cam[k][k];

                    }
                }
            }
        }
        System.out.println("Matriz de caminos");
        for (int i = 0; i < cam.length; i++) {
            for (int j = 0; j < cam.length; j++) {
                System.out.print(" {" + cam[i][j] + "} ");
            }
            System.out.println("");
        }
        System.out.println("Matriz de distancias");
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) {
                if (dist[i][j] == 999999999) {
                    System.out.print(" {" + "∞" + "} ");
                } else {
                    System.out.print(" {" + dist[i][j] + "} ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        FW();

    }
}
