public class Main{
    public static void main(String args[]){
        CSVReader c = new CSVReader("../data/Survivor.csv",true);
        Perk[] surv = c.readPerk();
        for (Perk p : surv){
            if (p!=null)
            System.out.println(p);
        }
    }
}