public class Main {

    public static void main(String[] args) {
       Vtm amo = new Vtm("Amoxacillin","C4H3CH", "Nausia, Diarrhoea");

       Atm amoFromSPC = new Atm("Amoxil", "SPC");
       amoFromSPC.vtm = amo;

       Vmp amo500 = new Vmp("Amoxacillin 500mg tab", 500, "Capsule", "mg" );
       amo500.vtm = amo;

       Amp decamox500 = new Amp("Decamox-500", "Cipla");
       decamox500.vmp = amo500;

       System.out.println( decamox500.manufacturer);

    }
}
