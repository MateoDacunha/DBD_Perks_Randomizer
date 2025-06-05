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
            if ((tag & 8)  != 0) res += "\n\t-Item";
            if ((tag & 16)  != 0) res += "\n\t-Utility";
            if ((tag & 32) != 0) res += "\n\t-Endurance";
            if ((tag & 64) != 0) res += "\n\t-Generator";
            if ((tag & 128) != 0) res += "\n\t-Annoy the Killer";
            if ((tag & 256) != 0) res += "\n\t-Boon";
        }
        else{
            // Gen Control,Aura reading,Hex,Undectable&Oblivious,Speed&Hast,Exposed,Utility,Windows&Pallet
            if ((tag & 1)  != 0) res += "\n\t-Gen Control";
            if ((tag & 2)  != 0) res += "\n\t-Aura reading";
            if ((tag & 4)  != 0) res += "\n\t-Hex";
            if ((tag & 8)  != 0) res += "\n\t-Undectable&Oblivious";
            if ((tag & 16)  != 0) res += "\n\t-Speed&Hast";
            if ((tag & 32) != 0) res += "\n\t-Exposed";
            if ((tag & 64) != 0) res += "\n\t-Utility";
            if ((tag & 128) != 0) res += "\n\t-Windows&Pallet";
        }
        return res;
    }

    public String toString(){
        String res = name+"\n Tag : "+transform_tag();
        return res;
    }
}