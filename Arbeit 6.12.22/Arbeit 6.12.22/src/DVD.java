public class DVD extends Medien{
    boolean fullHD;


    public DVD(String titel, int FSK, int laenge, boolean fullHD){
        super(titel, FSK, laenge);
    }

    public void setFullHD(boolean fullHD) {
        this.fullHD = fullHD;
    }
    public boolean getfullHD() {
        return fullHD;
    }
    
}
