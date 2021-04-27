public class KlasikSoru extends Soru implements Comparable<KlasikSoru>{
    public KlasikSoru(String soruMetni, int puan, String zorlukDerecesi, String cevap) {
        super(soruMetni, puan, zorlukDerecesi, cevap);
    }

    @Override
    public int compareTo(KlasikSoru o) {
        if(this.puan>o.puan){
            return 1;
        }
        else if(this.puan<o.puan){
            return -1;
        }
        else return 0;
    }
}
