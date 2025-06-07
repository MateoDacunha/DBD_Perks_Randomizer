package Test;

import Model.CSVReader;
import Model.Perk;
import Model.PerkRandomizer;

public class TestPerkRandomizer {
    public static void main(String args[]){
        CSVReader c = new CSVReader("../data/Survivor.csv",true);
        Perk[] surv = c.readPerk();

        c = new CSVReader("../data/Killer.csv",false);
        Perk[] killer = c.readPerk();

        PerkRandomizer p = new PerkRandomizer(surv,killer);

        Perk[] selectedPerk = new Perk[4];

        boolean[]  alreadySelected = new boolean[killer.length];
        for (int i = 0;i<killer.length;i++){alreadySelected[i] = false;}

        for (int i = 0;i<4;i++){
            Perk tmPerk = p.selectPerk(killer, 0, false);
            while (alreadySelected[tmPerk.get_id()]){tmPerk = p.selectPerk(killer, 0, false);}
            selectedPerk[i] = tmPerk;
        }

        for (int i = 0;i<4;i++){
            System.err.println(selectedPerk[i]);
        }
    }
}
