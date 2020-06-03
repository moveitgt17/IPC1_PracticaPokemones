
package BatallaPokemón;

import java.util.Random; 
import java.util.Scanner;

    
public class MenuPokemón {
    
    Scanner entradaDos = new Scanner(System.in);
    String dibujoPok [] = new String [9];
    Pokemones listadoPok [] = new Pokemones [9];
    Pokemones ObjetoPokemon = new Pokemones();
 
    
    
    public void SubirImag(){
       this.dibujoPok[0] = "`;-.          ___,\n" +
"  `.`\\_...._/`.-\"`\n" +
"    \\        /      ,\n" +
"    /()   () \\    .' `-._\n" +
"   |)  .    ()\\  /   _.'\n" +
"   \\  -'-     ,; '. <\n" +
"    ;.__     ,;|   > \\\n" +
"   / ,    / ,  |.-'.-'\n" +
"  (_/    (_/ ,;|.<`\n" +
"    \\    ,     ;-`\n" +
"     >   \\    /\n" +
"    (_,-'`> .'\n" +
"         (_,'";
  
        this.dibujoPok[1] = "               `;,;.;,;.;.'\n" +
"              ..:;:;::;: \n" +
"        ..--''' '' ' ' '''--.  \n" +
"      /' .   .'        '.   .`\\\n" +
"     | /    /            \\   '.|\n" +
"     | |   :             :    :|\n" +
"   .'| |   :             :    :|\n" +
" ,: /\\ \\.._\\ __..===..__/_../ /`.\n" +
"|'' |  :.|  `'          `'  |.'  ::.\n" +
"|   |  ''|    :'';          | ,  `''\\\n" +
"|.:  \\/  | /'-.`'   ':'.-'\\ |  \\,   |\n" +
"| '  /  /  | / |...   | \\ |  |  |';'|\n" +
" \\ _ |:.|  |_\\_|`.'   |_/_|  |.:| _ |\n" +
"/,.,.|' \\__       . .      __/ '|.,.,\\\n" +
"     | ':`.`----._____.---'.'   |\n" +
"      \\   `:\"\"\"-------'\"\"' |   |\n" +
"       ',-,-',             .'-=,=,";
        
        this.dibujoPok[2] = "       ;-.               ,\n" +
"        \\ '.           .'/\n" +
"         \\  \\ .---. .-' /\n" +
"          '. '     `\\_.'\n" +
"            |(),()  |     ,\n" +
"            (  __   /   .' \\\n" +
"           .''.___.'--,/\\_,|\n" +
"          {  /     \\   }   |\n" +
"           '.\\     /_.'    /\n" +
"            |'-.-',  `; _.'\n" +
"            |  |  |   |`\n" +
"            `\"\"`\"\"`\"\"\"`  ";
        
        this.dibujoPok[3] = "               .-. \\_/ .-.\n" +
"               \\.-\\/=\\/.-/\n" +
"            '-./___|=|___\\.-'\n" +
"           .--| \\|/`\"`\\|/ |--.\n" +
"          (((_)\\  .---.  /(_)))\n" +
"           `\\ \\_`-.   .-'_/ /`_\n" +
"             '.__       __.'(_))\n" +
"                 /     \\     //\n" +
"                |       |__.'/\n" +
"                \\       /--'`\n" +
"            .--,-' .--. '----.\n" +
"           '----`--'  '--`----'";
        
          this.dibujoPok[4] = "                 _.---._\n" +
"               .'       '.\n" +
"              /           \\\n" +
"             / /'-.   .-'\\ \\\n" +
"             '.`\"\"\"` `\"\"\"`.'\n" +
"              /'-._   _.-'\\\n" +
"             /_.--\\`-`/--._\\\n" +
"             ;    |'-'|    ;\n" +
"             |  .'/ | \\'.  |\n" +
"             |  | \\ | / |  |\n" +
"              \\  \\/\\|/\\/  /\n" +
"               \\_/  _  \\_/\n" +
"                |-'` `'-|\n" +
"                |.-\"\"\"-.|\n" +
"                \\ .---. /\n" +
"                 '._ _.'\n" +
"                    `";
          
          this.dibujoPok[5] = "                 |            .~~-.      _.    |\n" +
"                 |  .''..    (_~)  ) _.-'. ;   |\n" +
"                 |  '.'..'..-(_~ _-'*. .'.'    |\n" +
"                 |    ''.'.. _ ~~  _  ';'      |\n" +
"                 |     .''. (_)   (_)  '.      |\n" +
"                 |     ;      \"...\"     '.     |\n" +
"                 | .''.'.   .''`-'''.    '.''. |\n" +
"                 | '.  '   ;         ;    ;  ; |\n" +
"                 |   '.   ;           ;   ' ;  |\n" +
"                 |    '.  ;           ;    ;   |\n" +
"                 |     '.  ;         ;   .'    |\n" +
"                 |     .'...:..___..:..':.     |\n" +
"                 |  .''     ..'    '...   ~)   |\n" +
"                 | (.....'''           ''''    |";
          
    }
    
   
    public void InicioJuego(String []Args){
        int medidor = 0;
        Random aleatorio = new Random();
        int vida = 0;
        int ataque = 0;
        String estad; 
                   
        
        for(int i = 0; i < Args.length; i +=2){
            for(int j=0; j<7; j++){
                vida  =(aleatorio.nextInt(160-120+1)+120);
                ataque = (aleatorio.nextInt(35-30+1)+30);
            }
            if(vida>0){
                estad = "El pokemon esta vivo :)";
               
            }else {
                estad = "El pokemon esta muerto :( ";
                }
            
            
            String nombreP = Args[i];
            int posicion = Integer.parseInt( Args[i + 1]);
            
            if (posicion < dibujoPok.length && medidor<10) {
                String Imagen = dibujoPok[Integer.parseInt(Args[i + 1])];
               
                
                ObjetoPokemon.setNombPok(nombreP); 
                ObjetoPokemon.setImaPok(Imagen);
                ObjetoPokemon.setVida(vida);
                ObjetoPokemon.setAtaque(ataque);
                ObjetoPokemon.setEstado(estad);
                listadoPok[medidor] = ObjetoPokemon; 
                medidor++;
            
        
            }
        }
    }
    
    /*public void Modificar(){
        
 
    String nuevoNombre = "";
    int con;
    int i = 0;
    switch(i = 0){
        case 1: System.out.println("Escriba el numero del pokemon que desea editar");
        con = entradaDos.nextInt();
        if(con ==1){
            System.out.println(listadoPok[0]);
            
        }
        
            break;
            
           
        
    }
    */
    

    
   
    }


  
        
        
    
    
    
    
   
    
        
    
    
        
      
        
    

    
   
        
    
    
    

