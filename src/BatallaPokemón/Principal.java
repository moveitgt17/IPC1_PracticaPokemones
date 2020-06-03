package BatallaPokemón;

import java.util.Scanner;

public class Principal {
    
    public static void main(String args[]) {
            
       /* Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al juego :) para iniciar seleccione una de las opciones\nseleccionando la consola con el cursos luego ingrese el número de la opción que deseas realizar\npor ultimo presione enter ");
        System.out.println("\n1. Mostrar listado de pokemones");//en esta version de la practica solamente se despliega el listado de pokemones
        System.out.println("\n2. Mostrar estadisticas de juego");
        System.out.println("\n3. Salir del juego");*/
       
      MenuPokemón juego = new MenuPokemón();
              
        
            
            juego.SubirImag();
                   juego.InicioJuego(args);
              
        for(Pokemones P :juego.listadoPok ){
            if (P != null){
               
                System.out.println( P.getNombPok());
                System.out.println(P.getImaPok());
                System.out.println("vida: " + P.getVida());
                System.out.println("ataque: "+ P.getAtaque());
                System.out.println("Estado: " + P.isEstado());
                System.out.println(""); 
            }
        }    
       // System.out.println("Para continuar escoja una de las siguientes opciones escribiendo el numero que la representaseguida de enter:"); 
        //System.out.println("\n1.Editar pokemon\n2.Batallar");
        
        /*}else if(iniciar == 2){
            
        
         System.out.println("las estadisticas del juego son");
        
        }else if(iniciar == 3){
                
                System.out.println("Adios!!");
                        
            }     
        else {
         System.out.println("la opcion que elgiste no existe vuelve a iniciar");
                  
        }*/
        }         
    }
            
               
        
        






    
    
    
  
    



