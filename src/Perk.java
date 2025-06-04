public class Perk{
    private String name;
    private String description;
    private int tag;
    private boolean isSurv;

    

    Perk(String name,String description,int tag,boolean isSurv){
        this.name = name;
        this.description =description;
        this.tag = tag;
        this.isSurv = isSurv;

    }

    public String get_name(){
        return name;
    }

    public String get_description(){
        return description;
    }

    public int get_tag(){
        return tag;
    }

    private String transform_tag(){
        String res = "";

        if (isSurv){
            if ((tag & 1)  != 0) res += "\n\t-Chase";
            if ((tag & 2)  != 0) res += "\n\t-Healing";
            if ((tag & 4)  != 0) res += "\n\t-Aura&Info";
            if ((tag & 8)  != 0) res += "\n\t-Utility";
            if ((tag & 16) != 0) res += "\n\t-Generator";
            if ((tag & 32) != 0) res += "\n\t-Annoy the Killer";
            if ((tag & 64) != 0) res += "\n\t-Boon";
        }
        return res;
    }

    public String toString(){
        String res = name+"\n Tag : "+tag+transform_tag();
        return res;
    }
}