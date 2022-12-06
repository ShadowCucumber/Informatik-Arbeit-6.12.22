public class Kunde extends Mensch {
    int kundennummer;
    int alter;



    public Kunde(int kundennummer,int alter,String vorname,String nachname){
        super(vorname, nachname);
        setAlter(alter);
        setKundennummer(kundennummer);

    }
    
    public void setAlter(int alter) {
        this.alter = alter;
    }   
    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }   
    public int getAlter() {
        return alter;
    }   
    public int getKundennummer() {
        return kundennummer;
    }   

    

    
}
