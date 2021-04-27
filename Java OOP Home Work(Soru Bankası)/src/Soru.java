public abstract class Soru{
    String soruMetni;
    int puan;
    String zorlukDerecesi;
    String cevap;

    public Soru(String soruMetni, int puan, String zorlukDerecesi, String cevap) {
        this.soruMetni = soruMetni;
        this.puan = puan;
        this.zorlukDerecesi = zorlukDerecesi;
        this.cevap = cevap;
    }
}
