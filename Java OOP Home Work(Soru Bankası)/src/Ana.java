import java.util.Scanner;

public class Ana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Soru Bankasına Hoşgeldiniz :)\n" +
                    "1.Soru Ekle\n" +
                    "2.Soru Çıkar\n" +
                    "3.Soru Listele\n" +
                    "4.Sınav Yap\n" +
                    "0.Çıkış Yap\n" +
                    "Lütfen Seçiminizi yapınız...");
            int kullaniciGiris = input.nextInt();
            if (kullaniciGiris == 1) {
                while (true) {
                    System.out.println("1.Çoktan Seçmeli Soru Ekle\n" +
                            "2.Klasik Soru Ekle\n" +
                            "3.Doğru Yanlış Sorusu Ekle\n" +
                            "4.Boşluk Doldurma Sorusu Ekle\n");
                    System.out.println("Üst menüye dönmek için 0'ı tuşlayınız...");
                    kullaniciGiris = input.nextInt();
                    input.nextLine();
                    if (kullaniciGiris == 0) {
                        break;
                    } else if (kullaniciGiris == 1) {
                        while (true) {
                            try {
                                System.out.println("Soruyu yazınız...");
                                String soru = input.nextLine();

                                System.out.println("Doğru Cevabı Giriniz...");
                                String dogruCevap = input.nextLine();

                                System.out.println("A şıkkını giriniz...");
                                String aSikki = input.nextLine();

                                System.out.println("B şıkkını giriniz...");
                                String bSikki = input.nextLine();

                                System.out.println("C şıkkını giriniz...");
                                String cSikki = input.nextLine();

                                System.out.println("D şıkkını giriniz...");
                                String dSikki = input.nextLine();

                                System.out.println("Puanı giriniz...");
                                kullaniciGiris = input.nextInt();
                                input.nextLine();

                                System.out.println("Zorluk derecesini giriniz...");
                                String zorlukDerecesi = input.nextLine();

                                Kaynak.getInstance().coktanSecmelisoruEkle(new CoktanSecmeliSoru(soru, kullaniciGiris, zorlukDerecesi, dogruCevap, aSikki, bSikki, cSikki, dSikki));
                                System.out.println("Bir soru daha eklemek için herhangi bir tuşa,üst menüye dönmek için 0'ı tuşlayınız...");
                                kullaniciGiris = input.nextInt();
                                input.nextLine();

                                if (kullaniciGiris == 0) {
                                    break;
                                }
                            } catch (Exception e) {
                                System.out.println("Yanlış parametre girdiniz...");
                                continue;
                            }
                        }
                    } else if (kullaniciGiris == 2) {
                        while (true) {
                            try {

                                System.out.println("Soruyu yazınız...");
                                String soru = input.nextLine();

                                System.out.println("Doğru Cevabı Giriniz...");
                                String dogruCevap = input.nextLine();

                                System.out.println("Puanı giriniz...");
                                kullaniciGiris = input.nextInt();
                                input.nextLine();

                                System.out.println("Zorluk derecesini giriniz...");
                                String zorlukDerecesi = input.nextLine();

                                Kaynak.getInstance().klasikSoruEkle(new KlasikSoru(soru, kullaniciGiris, zorlukDerecesi, dogruCevap));
                                System.out.println("Bir soru daha eklemek için herhangi bir tuşa,üst menüye dönmek için 0'ı tuşlayınız...");

                                kullaniciGiris = input.nextInt();
                                input.nextLine();

                                if (kullaniciGiris == 0) {
                                    break;
                                }
                            } catch (Exception e) {
                                System.out.println("Yanlış parametre girdiniz...");
                                continue;
                            }
                        }
                    } else if (kullaniciGiris == 3) {
                        while (true) {
                            try {

                                System.out.println("Soruyu yazınız...");
                                String soru = input.nextLine();

                                System.out.println("Doğru Cevabı Giriniz...");
                                String dogruCevap = input.nextLine();

                                System.out.println("Puanı giriniz...");
                                kullaniciGiris = input.nextInt();
                                input.nextLine();

                                System.out.println("Zorluk derecesini giriniz...");
                                String zorlukDerecesi = input.nextLine();

                                Kaynak.getInstance().dogruYanlisSoruEkle(new DoğruYanlişSoru(soru, kullaniciGiris, zorlukDerecesi, dogruCevap));
                                System.out.println("Bir soru daha eklemek için herhangi bir tuşa,üst menüye dönmek için 0'ı tuşlayınız...");

                                kullaniciGiris = input.nextInt();
                                input.nextLine();
                                if (kullaniciGiris == 0) {
                                    break;
                                }
                            } catch (Exception e) {
                                System.out.println("Yanlış parametre girdiniz...");
                                continue;
                            }
                        }
                    } else if (kullaniciGiris == 4) {
                        while (true) {
                            try {
                                System.out.println("Soruyu yazınız...");
                                String soru = input.nextLine();

                                System.out.println("Doğru Cevabı Giriniz...");
                                String dogruCevap = input.nextLine();

                                System.out.println("Puanı giriniz...");
                                kullaniciGiris = input.nextInt();
                                input.nextLine();

                                System.out.println("Zorluk derecesini giriniz...");
                                String zorlukDerecesi = input.nextLine();

                                Kaynak.getInstance().boslukDoldurmaSoruEkle(new BoslukDoldurmaSoru(soru, kullaniciGiris, zorlukDerecesi, dogruCevap));
                                System.out.println("Bir soru daha eklemek için herhangi bir tuşa,üst menüye dönmek için 0'ı tuşlayınız...");

                                kullaniciGiris = input.nextInt();
                                input.nextLine();

                                if (kullaniciGiris == 0) {
                                    break;
                                }
                            } catch (Exception e) {
                                System.out.println("Yanlış parametre girdiniz...");
                                continue;
                            }
                        }
                    } else {
                        System.out.println("Yanlış tuşlama yaptınız...");
                        continue;
                    }
                }
            }
            else if (kullaniciGiris == 2) {
                while (true) {
                    System.out.println("1.Çoktan Seçmeli Soru Çıkar\n" +
                            "2.Klasik Soru Çıkar\n" +
                            "3.Doğru Yanlış Sorusu Çıkar\n" +
                            "4.Boşluk Doldurma Sorusu Çıkar\n");
                    System.out.println("Üst menüye dönmek için 0'ı tuşlayınız...");
                    kullaniciGiris = input.nextInt();
                    if (kullaniciGiris == 0) {
                        break;
                    } else if (kullaniciGiris == 1) {
                        System.out.println("Çıkaracağınız soru için aratılacak kelime giriniz...");
                        String arat = input.next();
                        Kaynak.getInstance().coktanSecmelisoruCikar(arat);
                    }
                    else if(kullaniciGiris==2){
                        System.out.println("Çıkaracağınız soru için aratılacak kelime giriniz...");
                        String arat = input.next();
                        Kaynak.getInstance().klasikSoruCikar(arat);
                    }
                    else if(kullaniciGiris==3){
                        System.out.println("Çıkaracağınız soru için aratılacak kelime giriniz...");
                        String arat = input.next();
                        Kaynak.getInstance().dogruYanlisSoruCikar(arat);
                    }
                    else if(kullaniciGiris==4){
                        System.out.println("Çıkaracağınız soru için aratılacak kelime giriniz...");
                        String arat = input.next();
                        Kaynak.getInstance().boslukDoldurmaSoruCikar(arat);
                    }
                    else{
                        System.out.println("Yanlış tuşlama yaptınız...");
                    }
                }
            }
            else if(kullaniciGiris==3){
                while (true){
                    System.out.println("1.Çoktan Seçmeli Soru Sırala\n" +
                            "2.Klasik Soru Sırala\n" +
                            "3.Doğru Yanlış Sorusu Sırala\n" +
                            "4.Boşluk Doldurma Sorusu Sırala\n");
                    System.out.println("Üst menüye dönmek için 0'ı tuşlayınız...");
                    kullaniciGiris = input.nextInt();
                    if(kullaniciGiris==0){
                        break;
                    }
                    else if(kullaniciGiris==1){
                        while (true){
                            System.out.println("1.Çoktan Seçmeli Doğru Şıkka Göre Sırala\n" +
                                    "2.Çoktan Seçmeli Şıkka Göre Sırala\n" +
                                    "3.Çoktan Seçmeli Zorluğa Göre Sırala\n" +
                                    "4.Çoktan Seçmeli Puana Göre Sırala\n" +
                                    "5.Çoktan Seçmeli Soruya Göre Sırala\n");
                            System.out.println("Üst menüye dönmek için 0'ı tuşlayınız...");
                            kullaniciGiris = input.nextInt();
                            if(kullaniciGiris==1){
                                System.out.println("Aratılacak dogru şıkkı giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().coktanSecmeliDoğruSikkaGoreSirala(metin);
                            }
                            else if(kullaniciGiris==2){
                                System.out.println("Aratılacak şıkkı giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().coktanSecmeliSikkaGoreSirala(metin);
                            }
                            else if(kullaniciGiris==3){
                                System.out.println("Aratılacak zorluk seviyesini giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().coktanSecmeliZorlugaGoreSirala(metin);
                            }
                            else if(kullaniciGiris==4){
                                System.out.println("Aratılacak soruların puanını giriniz...");
                                kullaniciGiris= input.nextInt();
                                Kaynak.getInstance().coktanSecmeliPuanaGoreSirala(kullaniciGiris);
                            }
                            else if(kullaniciGiris==5){
                                System.out.println("Aratılacak soru cümlesini giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().coktanSecmeliSoruCumlesineGoreSirala(metin);
                            }
                            else if(kullaniciGiris==0){
                                break;
                            }
                            else{
                                System.out.println("Yanlış bir giriş yaptınız...");
                                continue;
                            }
                        }
                    }
                    else if(kullaniciGiris==2){
                        while (true){
                            System.out.println("1.Klasik Doğru Şıkka Göre Sırala\n" +
                                    "2.Klasik Zorluğa Göre Sırala\n" +
                                    "3.Klasik Puana Göre Sırala\n" +
                                    "4.Klasik Soru Cümlesine Göre Sırala\n");
                            System.out.println("Üst menüye dönmek için 0'ı tuşlayınız...");
                            kullaniciGiris = input.nextInt();
                            if(kullaniciGiris==1){
                                System.out.println("Aratılacak dogru şıkkı giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().klasikCevabaGoreSirala(metin);
                            }
                            else if(kullaniciGiris==2){
                                System.out.println("Aratılacak zorluk seviyesini giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().klasikZorlugaGoreSirala(metin);
                            }
                            else if(kullaniciGiris==3){
                                System.out.println("Aratılacak soruların puanını giriniz...");
                                kullaniciGiris= input.nextInt();
                                Kaynak.getInstance().klasikPuanaGoreSirala(kullaniciGiris);
                            }
                            else if(kullaniciGiris==4){
                                System.out.println("Aratılacak soru cümlesini giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().klasikSoruCumlesineGoreSirala(metin);
                            }
                            else if(kullaniciGiris==0){
                                break;
                            }
                            else{
                                System.out.println("Yanlış bir giriş yaptınız...");
                                continue;
                            }
                        }
                    }
                    else if(kullaniciGiris==3){
                        while (true){
                            System.out.println("1.Doğru Yanlış Cevaba Göre Sırala\n" +
                                    "2.Doğru Yanlış Zorluğa Göre Sırala\n" +
                                    "3.Doğru Yanlış Puana Göre Sırala\n" +
                                    "4.Dogru Yanlış Soru Cümlesine Göre Sırala\n");
                            System.out.println("Üst menüye dönmek için 0'ı tuşlayınız...");
                            kullaniciGiris = input.nextInt();
                            if(kullaniciGiris==1){
                                System.out.println("Aratılacak dogru şıkkı giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().dogruYanlisDogruSikkaGoreSirala(metin);
                            }
                            else if(kullaniciGiris==2){
                                System.out.println("Aratılacak zorluk seviyesini giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().dogruYanlisZorlugaGoreSirala(metin);
                            }
                            else if(kullaniciGiris==3){
                                System.out.println("Aratılacak soruların puanını giriniz...");
                                kullaniciGiris= input.nextInt();
                                Kaynak.getInstance().dogruYanlisPuanaGoreSirala(kullaniciGiris);
                            }
                            else if(kullaniciGiris==4){
                                System.out.println("Aratılacak soru cümlesini giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().dogruYanlisSoruCumlesineGoreSirala(metin);
                            }
                            else if(kullaniciGiris==0){
                                break;
                            }
                            else{
                                System.out.println("Yanlış bir giriş yaptınız...");
                                continue;
                            }
                        }
                    }
                    else if(kullaniciGiris==4){
                        while (true){
                            System.out.println("1.Boşluk Doldurma Cevaba Göre Sırala\n" +
                                    "2.Boşluk Doldurma Zorluğa Göre Sırala\n" +
                                    "3.Boşluk Doldurma Puana Göre Sırala\n" +
                                    "4.Boşluk Doldurma Soru Cümlesine Göre Sırala\n");
                            System.out.println("Üst menüye dönmek için 0'ı tuşlayınız...");
                            kullaniciGiris = input.nextInt();
                            if(kullaniciGiris==1){
                                System.out.println("Aratılacak dogru şıkkı giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().boslukDoldurmaCevabaGoreSirala(metin);
                            }
                            else if(kullaniciGiris==2){
                                System.out.println("Aratılacak zorluk seviyesini giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().boslukDoldurmaZorlugaGoreSirala(metin);
                            }
                            else if(kullaniciGiris==3){
                                System.out.println("Aratılacak soruların puanını giriniz...");
                                kullaniciGiris= input.nextInt();
                                Kaynak.getInstance().boslukDoldurmaPuanaGoreSirala(kullaniciGiris);
                            }
                            else if(kullaniciGiris==4){
                                System.out.println("Aratılacak soru cümlesini giriniz...");
                                String metin= input.next();
                                Kaynak.getInstance().boslukDoldurmaSoruCumlesineGoreSirala(metin);
                            }
                            else if(kullaniciGiris==0){
                                break;
                            }
                            else{
                                System.out.println("Yanlış bir giriş yaptınız...");
                                continue;
                            }
                        }
                    }
                }
            }
            else if(kullaniciGiris==4){
                while(true){
                    System.out.println("Sınav Otomasyonuna Hoşgeldiniz...\n" +
                            "1.Çoktan Seçmeli Sınav Yap\n" +
                            "2.Klasik Sınav Yap\n" +
                            "3.Karışık Sınav Yap\n");
                    System.out.println("Lütfen Seçiminizi yapınız.Çıkmak için 0'ı tuşlayınız...");
                    kullaniciGiris= input.nextInt();
                    if(kullaniciGiris==1){
                        Kaynak.getInstance().coktanSecmeliSinavYap();
                    }
                    else if(kullaniciGiris==2){
                        Kaynak.getInstance().klasikSinavYap();
                    }
                    else if(kullaniciGiris==3){
                        Kaynak.getInstance().karisikSinavYap();
                    }
                    else if(kullaniciGiris==0){
                        break;
                    }
                    else{
                        System.out.println("Yanlış bir tuşlama yaptınız..");
                        continue;
                    }
                }
            }
            else if(kullaniciGiris==0){
                break;
            }
            else {
                System.out.println("Yanlış bir giriş yaptınız...");
                continue;
            }
        }
    }
}
