public class BoslukDoldurmaSoru extends Soru implements Comparable<BoslukDoldurmaSoru>{
    public BoslukDoldurmaSoru(String soruMetni, int puan, String zorlukDerecesi, String cevap) {
        super(soruMetni, puan, zorlukDerecesi, cevap);
    }

    @Override
    public int compareTo(BoslukDoldurmaSoru o) {
        if(this.puan>o.puan){
            return 1;
        }
        else if(this.puan<o.puan){
            return -1;
        }
        else return 0;
    }
}
