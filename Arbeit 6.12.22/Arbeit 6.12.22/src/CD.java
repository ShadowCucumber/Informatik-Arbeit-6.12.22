public class CD extends Medien {
    String SP;
    String Lp;

    public CD(String titel,int FSK,int laenge,String SP,String Lp){
        super(titel, FSK, laenge);
        setLp(Lp);
        setSP(SP);
    }
        

    public void setLp(String lp) {
        Lp = lp;
    }
    public String getLp() {
        return Lp;
    }
    public void setSP(String sP) {
        SP = sP;
    }
    public String getSP() {
        return SP;
    }


    
}
