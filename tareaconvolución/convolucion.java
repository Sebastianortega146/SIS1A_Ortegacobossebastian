import java.util.Scanner; 

public class convolucion{
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in); 
        int vector[] = new int[4]; 
        int vector2[] = new int[4]; 
        int vector3[] = new int[100]; 

        System.out.println("\n\n\t\t CONVOLUCION DISCRETA \n\n"); 

        for(int i=0; i<vector.length; i++){
            System.out.print("Ingresa los elemntos del vector : "); 
            vector[i] = entrada.nextInt(); 
        }
        for (int i=0; i<vector2.length; i++ ){
            System.out.print("ingresa los elementos del segundo vector : "); 
            vector2[i] = entrada.nextInt(); 
        }
        int j=0; 
        for(int i=0; i<1 ; i++){

            vector3[0] = (vector[0]*vector2[0]); 
            j++;
            vector3[j] = (vector[1]*vector2[1]);
            j++;
            vector3[1] = (vector3[0]+vector3[1]);
            j++; 
            vector3[j] = (vector[0]*vector2[2]);
            j++; 
            vector3[j] = (vector[1]*vector2[1]); 
            j++; 
            vector3[j] = (vector[2]*vector2[0]); 
            j++; 
            vector3[2] = (vector3[3]+vector3[4]+vector3[5]);
            
            vector3[j] = (vector[0]*vector2[3]); 
            j++;
            vector3[j] = (vector[1]*vector2[2]); 
            j++;
            vector3[j] = (vector[2]*vector2[1]); 
            j++;
            vector3[j] = (vector[3]*vector2[0]); 
            j++;
            vector3[3] = (vector3[6]+vector3[7]+vector3[8]+vector3[9]);
            
            vector3[j] = (vector[1]*vector2[3]); 
            j++;
            vector3[j] = (vector[2]*vector2[2]); 
            j++;
            vector3[j] = (vector[3]+vector3[1]);
            
            vector3[4] = (vector3[10]+vector3[11]+vector3[12]);
           
            vector3[j] = (vector[2]*vector2[3]); 
            j++;
            vector3[j] = (vector[3]*vector2[2]); 
            j++;

            vector3[5] = (vector3[13]+vector3[14]);
            vector3[6] = (vector[3]*vector3[3]);




         }

        System.out.println("\n\n\t\tLa combinacion de arreglos es : \n"); 
        for (int i=0 ; i<6; i++){
            System.out.println( vector3[i]); 
        }


    }
}
