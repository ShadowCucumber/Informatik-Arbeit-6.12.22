public class Schallplatte extends Medien {
    boolean verleibar;

    public Schallplatte(String titel,int FSK, int laenge, boolean verleibar){
        super(titel, FSK, laenge);
        setVerleibar(verleibar);
    }
    public void setVerleibar(boolean verleibar) {
        this.verleibar = verleibar;
    }
    public boolean getverleibar() {
        return verleibar;
    }
    
}
