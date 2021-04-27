import java.util.ArrayList;

public class CoktanSecmeliSoru extends Soru implements Comparable<CoktanSecmeliSoru> {
    String aSikki, bSikki, cSikki, dSikki;
    static ArrayList<Soru> coktanSecmeli = new ArrayList<>();

    public CoktanSecmeliSoru(String soruMetni, int puan, String zorlukDerecesi, String cevap, String aSikki, String bSikki, String cSikki, String dSikki) {
        super(soruMetni, puan, zorlukDerecesi, cevap);
        this.aSikki = aSikki;
        this.bSikki = bSikki;
        this.cSikki = cSikki;
        this.dSikki = dSikki;
    }

    @Override
    public int compareTo(CoktanSecmeliSoru o) {
        if(this.puan>o.puan){
            return 1;
        }
        else if(this.puan<o.puan){
            return -1;
        }
        else return 0;
    }


}
