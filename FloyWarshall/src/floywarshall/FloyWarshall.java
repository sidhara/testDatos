/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floywarshall;

/**
 *
 * @author sidhara
 */
public class FloyWarshall {

    static void FloyWarshall(int grafo[][])
     {
     int distancia[][]=getMatrix(0,grafo),caminos[][]=getMatrix(1,grafo),tmp,n=grafo.length;
      print("matriz de distancia ",distancia);
      print("matriz de caminos ",caminos);
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                 tmp=distancia[i][k]+distancia[k][j];
                    if(tmp<distancia[i][j])
                     {
                     distancia[i][j]=tmp;
                     caminos[i][j]=k;
                     }
                 }
             }
         }
      print("matriz de distancia final ",distancia);
      print("matriz de caminos final ",caminos);
     }
    
    static void print(String mensaje, int M[][])
     {
     System.out.println(mensaje);
         for (int i = 0; i < M.length; i++) {
             for (int j = 0; j < M.length; j++) {
                 System.out.print(M[i][j]+"  ");
             }
             System.out.println();
         }
     }
    
    static int[][] getMatrix(int tipo, int grafo[][])
     {
     int n=grafo.length, M[][]=new int[n][n];
        if(tipo==1)
         {
             for (int i = 0; i < n; i++) {
                 for (int j = 0; j < n; j++) {
                     M[i][j]=j;
                 }
             }
         }else{
         int inf=999;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i!=j && grafo[i][j]==0) {
                     M[i][j]=inf;
                     }else{
                     M[i][j]=grafo[i][j];
                     }
                }
            }
         }
     return M;   
     }
    
    public static void main(String[] args) {
      
     int grafo[][]={
                    
                        {0,1,0,3,0},
                        {8,0,4,0,0},
                        {0,0,0,0,2},
                        {0,7,0,0,9},
                        {4,0,6,0,0}
                    };
        
        FloyWarshall(grafo);
    }
    
}
