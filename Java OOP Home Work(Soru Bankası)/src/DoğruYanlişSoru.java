public class DoğruYanlişSoru extends Soru implements Comparable<DoğruYanlişSoru>{
    String dogruSik,yanlisSik;


    public DoğruYanlişSoru(String soruMetni, int puan, String zorlukDerecesi, String cevap) {
        super(soruMetni, puan, zorlukDerecesi, cevap);
        this.dogruSik="Doğru";
        this.yanlisSik="Yanlış";
    }

    @Override
    public int compareTo(DoğruYanlişSoru o) {
        if(this.puan>o.puan){
            return 1;
        }
        else if(this.puan<o.puan){
            return -1;
        }
        else return 0;
    }
}
