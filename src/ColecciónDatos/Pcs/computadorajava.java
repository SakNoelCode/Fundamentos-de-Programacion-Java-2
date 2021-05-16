
package ColecciónDatos.Pcs;


public class computadorajava {
    
    private final String NMAC;
    private final String procesador;
    private final int NRAM;
    private final int CDISCO;
    
    public computadorajava(String NM, String procesador,int NR,int CD){
        this.NMAC=NM;
        this.NRAM=NR;
        this.procesador=procesador;
        this.CDISCO=CD;
    }
    
/*
    public String getNMAC() {
        return NMAC;
    }

    public void setNMAC(String NMAC) {
        this.NMAC = NMAC;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getNRAM() {
        return NRAM;
    }

    public void setNRAM(int NRAM) {
        this.NRAM = NRAM;
    }

    public int getCDISCO() {
        return CDISCO;
    }

    public void setCDISCO(int CDISCO) {
        this.CDISCO = CDISCO;
    }
 */  

    @Override
   public String toString(){
       return "Numero de MAC :"+ NMAC +"\nProcesador: "+ procesador+"\nMemoria RAM: "+ NRAM+ "\nCapacidad de disco: "+
               CDISCO;
   }
    
}
