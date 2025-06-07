package Model;

import java.util.Random;


public class PerkRandomizer {
    Perk[] surv;Perk[] killer;

    public PerkRandomizer(Perk[] surv,Perk[] killer){
        this.surv = surv;
        this.killer = killer;
    }

    public Perk selectPerk(Perk[] perkList,int tag,boolean isSurv){
        
        Random r = new Random();

        if (tag == 0){
            return perkList[r.nextInt(perkList.length)];
        }

        return null;

    }
    
}
