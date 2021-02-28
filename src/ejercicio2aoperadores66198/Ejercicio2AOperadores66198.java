
package ejercicio2aoperadores66198;

public class Ejercicio2AOperadores66198 {

    public static void main(String[] args) {
        
        int [][] matriz= new int [3][3] ;
        
        int determinante;
        
        matriz [0][0]=1;
        matriz [0][1]=6;
        matriz [0][2]=2;
        matriz [1][0]=3;
        matriz [1][1]=2;
        matriz [1][2]=2;
        matriz [2][0]=1;
        matriz [2][1]=1;
        matriz [2][2]=2;
        
        determinante = (matriz [0][0]* matriz [1][1]* matriz [2][2])-(matriz [0][2]* matriz [1][1]* matriz [2][0]);
        
        System.out.println( "La determinante es " + determinante );

        
    }
    
}
