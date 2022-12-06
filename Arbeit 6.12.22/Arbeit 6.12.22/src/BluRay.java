public class BluRay extends Medien{
    boolean dreiD;


    public BluRay(String titel,int FSk,int laenge, boolean dreiD){
        super(titel, FSk, laenge);
        setDreiD(dreiD);

    }

    public void setDreiD(boolean dreiD) {
        this.dreiD = dreiD;
    }
    public boolean getdreiD() {
        return dreiD;
    }
    
}
