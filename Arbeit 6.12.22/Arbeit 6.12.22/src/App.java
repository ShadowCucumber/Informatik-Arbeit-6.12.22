public class App {
    public static void main(String[] args) throws Exception {
        Kunde k1 = new Kunde(23, 15, "Diter", "Henzel");
        DVD d1 = new DVD("Matrix 4 ", 16, 200, false);
        Schallplatte scp1 = new Schallplatte("Baum", 0, 20, false);
        Schallplatte scp2 = new Schallplatte("Baum2", 0, 21, true);
        Kunde k2 = new Kunde(12, 78, "Henrik", "Henzel");
        Kunde k3 = new Kunde(28, 19, "Mattis", "Henzel");




        if (k1.getAlter() >= 16) {
            System.out.println("kunde 1 darf die DVD ausleihen");
        } else {
            System.out.println("kunde 1 darf die DVD nicht ausleihen");
        }
        if (k2.getAlter() >= 16) {
            System.out.println("kunde 2 darf die DVD ausleihen");
        } else {
            System.out.println("Kunde 2 darf die DVD nicht ausleihen");
        }


      
    }
}
