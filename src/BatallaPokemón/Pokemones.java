
package BatallaPokemón;


public class Pokemones {
    
    private String NombPok;
    private int Vida;
    int contar;
    private String Estado;
    private int ataque;
    private String ImaPok;
    
public Pokemones(){
    
}

    public Pokemones(String nombPok, int vida, int contar, String estado, int ataque, String imaPok) {
        this.NombPok = nombPok;
        this.Vida = vida;
        this.Estado = estado;
        this.ataque = ataque;
        this.ImaPok = imaPok;
        this.contar = contar;
    }

    /**
     * @return the nombPok
     */
    public String getNombPok() {
        return NombPok;
    }

    /**
     * @param nombPok the nombPok to set
     */
    public void setNombPok(String nombPok) {
        this.NombPok = nombPok;
    }
     
    public int getContar(){
        return contar;
    }
    
    public void setContar(int contar){
        this.contar = contar;
    }
    /**
     * 
     * @return the vida
     */
    public int getVida() {
        return Vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.Vida = vida;
    }

    /**
     * @return the estado
     */
    public String isEstado() {
        return Estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.Estado = estado;
    }

    /**
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the imaPok
     */
    public String getImaPok() {
        return ImaPok;
    }

    /**
     * @param imaPok the imaPok to set
     */
    public void setImaPok(String imaPok) {
        this.ImaPok = imaPok;
    }
    
    
}
