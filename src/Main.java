import Model.CSVReader;
import Model.Perk;
import View.Window;

public class Main{
    public static void main(String args[]){
        //Get Surv Perks
        CSVReader c = new CSVReader("../data/Survivor.csv",true);
        Perk[] surv = c.readPerk();
        // for (Perk p : surv){if (p!=null) System.out.println(p);}

        c = new CSVReader("../data/Killer.csv",false);
        Perk[] killer = c.readPerk();
        // for (Perk p : killer){if (p!=null) System.out.println(p);}

        

        Window.demarrer();
    }
}