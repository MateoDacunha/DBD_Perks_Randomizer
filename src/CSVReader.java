import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class CSVReader{
    Scanner scanner;
    private boolean isSurv;
    private int NBPERKS;
    private int NBTYPEOFPERKS;

    CSVReader(String filename,boolean isSurv){
        this.isSurv = isSurv;
        if (isSurv){
            NBPERKS = 152;
            NBTYPEOFPERKS = 9;
        }
        else{
            NBPERKS = 133;
            NBTYPEOFPERKS = 8;
        }
        try {
            scanner = new Scanner(new File(filename));
            scanner.useDelimiter("[\\n]");
        }
        catch (Exception e){
            System.err.println(e);
            return;
        }
    }

    public Perk[] readPerk(){
        Perk[] perksTab = new Perk[NBPERKS];
        int counter = 0;
        int i = 0;
        int tag = 0;

        String line,character,name;
        String[] tab;

        try{
            while (scanner.hasNext()) {
                tag = 0;
                line = scanner.next();
                line = line.substring(0, line.length() - 1);
                tab = line.split(",");
                name = tab[0];
                character = tab[1];

                for (i = 0;i<NBTYPEOFPERKS;i++){
                    if (tab[2+i].equals("TRUE")){
                        tag += Math.pow(2,i);
                    }
                }
                perksTab[counter] = new Perk(name,null,tag,isSurv);
                counter ++;
            }
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        scanner.close();
        return perksTab;
    }
}