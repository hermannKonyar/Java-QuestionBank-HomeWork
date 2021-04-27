import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kaynak {
    static Kaynak k;
    static ArrayList<CoktanSecmeliSoru> coktanSecmeli = new ArrayList<>();
    static ArrayList<DoğruYanlişSoru> dogruYanlis = new ArrayList<>();
    static ArrayList<KlasikSoru> klasik = new ArrayList<>();
    static ArrayList<BoslukDoldurmaSoru> boslukDoldurma = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    private Kaynak() {

    }

    public static Kaynak getInstance() {
        return k = new Kaynak();
    }


    public void coktanSecmelisoruEkle(CoktanSecmeliSoru soru) {
        coktanSecmeli.add(soru);
    }

    public void coktanSecmelisoruCikar(String metin) {
        boolean soruVarmi = false;
        for (int i = 0; i < coktanSecmeli.size(); i++) {
            if (coktanSecmeli.get(i).soruMetni.contains(metin)) {
                System.out.println("*********************");
                System.out.println(i + ". indexte " + coktanSecmeli.get(i).soruMetni);
                System.out.println("A." + coktanSecmeli.get(i).aSikki);
                System.out.println("B." + coktanSecmeli.get(i).bSikki);
                System.out.println("C." + coktanSecmeli.get(i).cSikki);
                System.out.println("D." + coktanSecmeli.get(i).dSikki);
                System.out.println("Doğru Cevap: " + coktanSecmeli.get(i).cevap);
                System.out.println("*********************");
                soruVarmi = true;
            }
        }
        if (!soruVarmi) {
            System.out.println("Aradığınız soru bulunamadı...");
        } else {
            while (soruVarmi) {
                try {
                    System.out.println("Silmek istediğiniz sorunun indexini veya çıkmak için (-1)'i tuşlayınız...");
                    int kullanSecim = input.nextInt();

                    if (kullanSecim == -1) {
                        break;
                    }
                    coktanSecmeli.remove(kullanSecim);
                    break;
                } catch (Exception e) {
                    System.out.println("Yanlış bir tuşlama yaptınız...");
                }

            }
        }
    }

    public void coktanSecmeliSoruCumlesineGoreSirala(String metin) {
        Collections.sort(coktanSecmeli);
        boolean soruVarMi = false;
        for (int i = 0; i < coktanSecmeli.size(); i++) {
            if (coktanSecmeli.get(i).soruMetni.contains(metin)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + coktanSecmeli.get(i).soruMetni);
                System.out.println("A." + coktanSecmeli.get(i).aSikki);
                System.out.println("B." + coktanSecmeli.get(i).bSikki);
                System.out.println("C." + coktanSecmeli.get(i).cSikki);
                System.out.println("D." + coktanSecmeli.get(i).dSikki);
                System.out.println("Doğru Cevap: " + coktanSecmeli.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void coktanSecmeliDoğruSikkaGoreSirala(String c) {
        Collections.sort(coktanSecmeli);
        boolean soruVarMi = false;
        for (int i = 0; i < coktanSecmeli.size(); i++) {
            if (coktanSecmeli.get(i).cevap.contains(c)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + coktanSecmeli.get(i).soruMetni);
                System.out.println("A." + coktanSecmeli.get(i).aSikki);
                System.out.println("B." + coktanSecmeli.get(i).bSikki);
                System.out.println("C." + coktanSecmeli.get(i).cSikki);
                System.out.println("D." + coktanSecmeli.get(i).dSikki);
                System.out.println("Doğru Cevap: " + coktanSecmeli.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void coktanSecmeliZorlugaGoreSirala(String zorlukDuzeyi) {
        Collections.sort(coktanSecmeli);
        boolean soruVarMi = false;
        for (int i = 0; i < coktanSecmeli.size(); i++) {
            if (coktanSecmeli.get(i).cevap.contains(zorlukDuzeyi)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + coktanSecmeli.get(i).soruMetni);
                System.out.println("A." + coktanSecmeli.get(i).aSikki);
                System.out.println("B." + coktanSecmeli.get(i).bSikki);
                System.out.println("C." + coktanSecmeli.get(i).cSikki);
                System.out.println("D." + coktanSecmeli.get(i).dSikki);
                System.out.println("Doğru Cevap: " + coktanSecmeli.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void coktanSecmeliPuanaGoreSirala(int sayi) {
        boolean soruVarMi = false;
        Collections.sort(coktanSecmeli);
        for (int i = 0; i < coktanSecmeli.size(); i++) {
            if (coktanSecmeli.get(i).puan == sayi) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + coktanSecmeli.get(i).soruMetni);
                System.out.println("A." + coktanSecmeli.get(i).aSikki);
                System.out.println("B." + coktanSecmeli.get(i).bSikki);
                System.out.println("C." + coktanSecmeli.get(i).cSikki);
                System.out.println("D." + coktanSecmeli.get(i).dSikki);
                System.out.println("Doğru Cevap: " + coktanSecmeli.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void coktanSecmeliSikkaGoreSirala(String a) {
        Collections.sort(coktanSecmeli);
        boolean soruVarMi = false;
        for (int i = 0; i < coktanSecmeli.size(); i++) {
            if (coktanSecmeli.get(i).aSikki.contains(a) || coktanSecmeli.get(i).bSikki.contains(a) || coktanSecmeli.get(i).cSikki.contains(a) || coktanSecmeli.get(i).dSikki.contains(a)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + coktanSecmeli.get(i).soruMetni);
                System.out.println("A." + coktanSecmeli.get(i).aSikki);
                System.out.println("B." + coktanSecmeli.get(i).bSikki);
                System.out.println("C." + coktanSecmeli.get(i).cSikki);
                System.out.println("D." + coktanSecmeli.get(i).dSikki);
                System.out.println("Doğru Cevap: " + coktanSecmeli.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void coktanSecmeliSinavYap() {
        while (true) {
            if (coktanSecmeli.size() < 10) {
                System.out.println("Sınav için yeterli soru yoktur!");
                break;
            }
            int toplam = 0, puan = 0, sayac = 0, rastgele;
            boolean sinavTamamlandiMi = false;
            for (int i = 0; i < coktanSecmeli.size(); i++) {
                toplam += coktanSecmeli.get(i).puan;
            }
            if (toplam > 100) {
                try (BufferedWriter yazici = new BufferedWriter(new FileWriter("Sınav.txt", true))) {
                    while (true) {

                        rastgele = (int) (Math.random() * coktanSecmeli.size());

                        sayac += coktanSecmeli.get(rastgele).puan;
                        if (sayac + coktanSecmeli.get(rastgele).puan > 110) {
                            continue;
                        }
                        System.out.println("*********************");
                        System.out.println(rastgele + ". indexte " + coktanSecmeli.get(rastgele).soruMetni);
                        System.out.println("A." + coktanSecmeli.get(rastgele).aSikki);
                        System.out.println("B." + coktanSecmeli.get(rastgele).bSikki);
                        System.out.println("C." + coktanSecmeli.get(rastgele).cSikki);
                        System.out.println("D." + coktanSecmeli.get(rastgele).dSikki);
                        String kullCevap = input.next();

                        yazici.write("*********************\n");
                        yazici.write(rastgele + ". indexte " + coktanSecmeli.get(rastgele).soruMetni + "\n");
                        yazici.write("A." + coktanSecmeli.get(rastgele).aSikki + "\n");
                        yazici.write("B." + coktanSecmeli.get(rastgele).bSikki + "\n");
                        yazici.write("C." + coktanSecmeli.get(rastgele).cSikki + " \n");
                        yazici.write("D." + coktanSecmeli.get(rastgele).dSikki + "\n");
                        yazici.write("Cevap: " + kullCevap + "\n");
                        yazici.write("*********************\n");
                        if (coktanSecmeli.get(rastgele).cevap.equals(kullCevap)) {
                            puan += coktanSecmeli.get(rastgele).puan;
                        }
                        System.out.println("*********************");
                        sinavTamamlandiMi = true;
                        if (sayac >= 100 && sayac <= 110) {
                            break;
                        }
                    }
                    yazici.write("Aldığınız Puan: " + puan + "\n");
                    System.out.println("Aldığınız Puan: " + puan);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("Yeterli Soru Bulunamadı...");
                break;
            }
            if (sinavTamamlandiMi) {
                break;
            }
        }
    }


    public void dogruYanlisSoruEkle(DoğruYanlişSoru soru) {
        dogruYanlis.add(soru);
    }

    public void dogruYanlisSoruCikar(String metin) {
        boolean soruVarmi = false;
        for (int i = 0; i < dogruYanlis.size(); i++) {
            if (dogruYanlis.get(i).soruMetni.contains(metin)) {
                System.out.println("*********************");
                System.out.println(i + ". indexte " + dogruYanlis.get(i).soruMetni);
                System.out.println("A." + dogruYanlis.get(i).dogruSik);
                System.out.println("B." + dogruYanlis.get(i).yanlisSik);
                System.out.println("Doğru Cevap: " + dogruYanlis.get(i).cevap);
                System.out.println("*********************");
                soruVarmi = true;
            }
        }
        if (!soruVarmi) {
            System.out.println("Aradığınız soru bulunamadı...");
        } else {
            while (soruVarmi) {
                try {
                    System.out.println("Silmek istediğiniz sorunun indexini veya çıkmak için (-1)'i tuşlayınız...");
                    int kullanSecim = input.nextInt();

                    if (kullanSecim == -1) {
                        break;
                    }
                    dogruYanlis.remove(kullanSecim);
                    break;
                } catch (Exception e) {
                    System.out.println("Yanlış bir tuşlama yaptınız...");
                }

            }
        }
    }

    public void dogruYanlisDogruSikkaGoreSirala(String metin) {
        Collections.sort(dogruYanlis);
        boolean soruVarMi = false;
        for (int i = 0; i < dogruYanlis.size(); i++) {
            if (dogruYanlis.get(i).cevap.equals(metin)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + dogruYanlis.get(i).soruMetni);
                System.out.println("A." + dogruYanlis.get(i).dogruSik);
                System.out.println("B." + dogruYanlis.get(i).yanlisSik);
                System.out.println("Doğru Cevap: " + dogruYanlis.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void dogruYanlisZorlugaGoreSirala(String zorlukDuzeyi) {
        Collections.sort(dogruYanlis);
        boolean soruVarMi = false;
        for (int i = 0; i < dogruYanlis.size(); i++) {
            if (dogruYanlis.get(i).zorlukDerecesi.contains(zorlukDuzeyi)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + dogruYanlis.get(i).soruMetni);
                System.out.println("A." + dogruYanlis.get(i).dogruSik);
                System.out.println("B." + dogruYanlis.get(i).yanlisSik);
                System.out.println("Doğru Cevap: " + dogruYanlis.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void dogruYanlisPuanaGoreSirala(int sayi) {
        boolean soruVarMi = false;
        Collections.sort(dogruYanlis);
        for (int i = 0; i < dogruYanlis.size(); i++) {
            if (dogruYanlis.get(i).puan == sayi) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + dogruYanlis.get(i).soruMetni);
                System.out.println("A." + dogruYanlis.get(i).dogruSik);
                System.out.println("B." + dogruYanlis.get(i).yanlisSik);
                System.out.println("Doğru Cevap: " + dogruYanlis.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void dogruYanlisSoruCumlesineGoreSirala(String metin) {
        Collections.sort(dogruYanlis);
        boolean soruVarMi = false;
        for (int i = 0; i < dogruYanlis.size(); i++) {
            if (dogruYanlis.get(i).soruMetni.contains(metin)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + dogruYanlis.get(i).soruMetni);
                System.out.println("A." + dogruYanlis.get(i).dogruSik);
                System.out.println("B." + dogruYanlis.get(i).yanlisSik);
                System.out.println("Doğru Cevap: " + dogruYanlis.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }


    public void klasikSoruEkle(KlasikSoru soru) {
        klasik.add(soru);
    }

    public void klasikSoruCikar(String metin) {
        boolean soruVarmi = false;
        for (int i = 0; i < klasik.size(); i++) {
            if (klasik.get(i).soruMetni.contains(metin)) {
                System.out.println("*********************");
                System.out.println(i + ". indexte " + klasik.get(i).soruMetni);
                System.out.println("Doğru Cevap: " + klasik.get(i).cevap);
                System.out.println("*********************");
                soruVarmi = true;
            }
        }
        if (!soruVarmi) {
            System.out.println("Aradığınız soru bulunamadı...");
        } else {
            while (soruVarmi) {
                try {
                    System.out.println("Silmek istediğiniz sorunun indexini veya çıkmak için (-1)'i tuşlayınız...");
                    int kullanSecim = input.nextInt();

                    if (kullanSecim == -1) {
                        break;
                    }
                    klasik.remove(kullanSecim);
                    break;
                } catch (Exception e) {
                    System.out.println("Yanlış bir tuşlama yaptınız...");
                }
            }
        }
    }

    public void klasikCevabaGoreSirala(String metin) {
        Collections.sort(klasik);
        boolean soruVarMi = false;
        for (int i = 0; i < klasik.size(); i++) {
            if (klasik.get(i).cevap.equals(metin)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + dogruYanlis.get(i).soruMetni);
                System.out.println("Doğru Cevap: " + dogruYanlis.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void klasikZorlugaGoreSirala(String zorlukDuzeyi) {
        Collections.sort(klasik);
        boolean soruVarMi = false;
        for (int i = 0; i < klasik.size(); i++) {
            if (klasik.get(i).zorlukDerecesi.contains(zorlukDuzeyi)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + klasik.get(i).soruMetni);
                System.out.println("Doğru Cevap: " + klasik.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void klasikPuanaGoreSirala(int sayi) {
        boolean soruVarMi = false;
        Collections.sort(klasik);
        for (int i = 0; i < klasik.size(); i++) {
            if (klasik.get(i).puan == sayi) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + klasik.get(i).soruMetni);
                System.out.println("Doğru Cevap: " + klasik.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void klasikSinavYap() {
        while (true) {
            if (klasik.size() < 10) {
                System.out.println("Sınav için yeterli soru yoktur!");
                break;
            }
            int toplam = 0, puan = 0, sayac = 0, rastgele;
            boolean sinavTamamlandiMi = false;
            for (int i = 0; i < klasik.size(); i++) {
                toplam += klasik.get(i).puan;
            }
            if (toplam > 100) {
                try (BufferedWriter yazici = new BufferedWriter(new FileWriter("Sınav.txt", true))) {
                    while (true) {

                        rastgele = (int) (Math.random() * klasik.size());

                        sayac += klasik.get(rastgele).puan;
                        if (sayac + klasik.get(rastgele).puan > 110) {
                            continue;
                        }
                        System.out.println("*********************");
                        System.out.println(rastgele + ". indexte " + klasik.get(rastgele).soruMetni);
                        String kullCevap = input.next();

                        yazici.write("*********************\n");
                        yazici.write(rastgele + ". indexte " + klasik.get(rastgele).soruMetni + "\n");
                        yazici.write("Cevap: " + kullCevap + "\n");
                        yazici.write("*********************\n");
                        if (klasik.get(rastgele).cevap.equals(kullCevap)) {
                            puan += klasik.get(rastgele).puan;
                        }
                        System.out.println("*********************");

                        if (sayac >= 100 && sayac <= 110) {
                            sinavTamamlandiMi = true;
                            break;
                        }
                    }
                    yazici.write("Aldığınız Puan: " + puan + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("Yeterli Soru Bulunamadı...");
                break;
            }
            if (sinavTamamlandiMi) {
                break;
            }
        }
    }

    public void klasikSoruCumlesineGoreSirala(String metin) {
        Collections.sort(klasik);
        boolean soruVarMi = false;
        for (int i = 0; i < klasik.size(); i++) {
            if (klasik.get(i).soruMetni.contains(metin)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + klasik.get(i).soruMetni);
                System.out.println("Doğru Cevap: " + klasik.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }


    public void boslukDoldurmaSoruEkle(BoslukDoldurmaSoru soru) {
        boslukDoldurma.add(soru);
    }

    public void boslukDoldurmaSoruCikar(String metin) {
        boolean soruVarmi = false;
        for (int i = 0; i < boslukDoldurma.size(); i++) {
            if (boslukDoldurma.get(i).soruMetni.contains(metin)) {
                System.out.println("*********************");
                System.out.println(i + ". indexte " + boslukDoldurma.get(i).soruMetni);
                System.out.println("Doğru Cevap: " + boslukDoldurma.get(i).cevap);
                System.out.println("*********************");
                soruVarmi = true;
            }
        }
        if (!soruVarmi) {
            System.out.println("Aradığınız soru bulunamadı...");
        } else {
            while (soruVarmi) {
                try {
                    System.out.println("Silmek istediğiniz sorunun indexini veya çıkmak için (-1)'i tuşlayınız...");
                    int kullanSecim = input.nextInt();

                    if (kullanSecim == -1) {
                        break;
                    }
                    boslukDoldurma.remove(kullanSecim);
                    break;
                } catch (Exception e) {
                    System.out.println("Yanlış bir tuşlama yaptınız...");
                }
            }
        }
    }

    public void boslukDoldurmaCevabaGoreSirala(String metin) {
        Collections.sort(boslukDoldurma);
        boolean soruVarMi = false;
        for (int i = 0; i < boslukDoldurma.size(); i++) {
            if (boslukDoldurma.get(i).cevap.equals(metin)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + boslukDoldurma.get(i).soruMetni);
                System.out.println("Doğru Cevap: " + boslukDoldurma.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void boslukDoldurmaZorlugaGoreSirala(String zorlukDuzeyi) {
        Collections.sort(boslukDoldurma);
        boolean soruVarMi = false;
        for (int i = 0; i < boslukDoldurma.size(); i++) {
            if (boslukDoldurma.get(i).zorlukDerecesi.contains(zorlukDuzeyi)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + boslukDoldurma.get(i).soruMetni);
                System.out.println("Doğru Cevap: " + boslukDoldurma.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void boslukDoldurmaPuanaGoreSirala(int sayi) {
        boolean soruVarMi = false;
        Collections.sort(boslukDoldurma);
        for (int i = 0; i < boslukDoldurma.size(); i++) {
            if (boslukDoldurma.get(i).puan == sayi) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + boslukDoldurma.get(i).soruMetni);
                System.out.println("Doğru Cevap: " + boslukDoldurma.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void boslukDoldurmaSoruCumlesineGoreSirala(String metin) {
        Collections.sort(boslukDoldurma);
        boolean soruVarMi = false;
        for (int i = 0; i < boslukDoldurma.size(); i++) {
            if (boslukDoldurma.get(i).soruMetni.contains(metin)) {
                soruVarMi = true;
                System.out.println("*********************");
                System.out.println(i + ". indexte " + boslukDoldurma.get(i).soruMetni);
                System.out.println("Doğru Cevap: " + boslukDoldurma.get(i).cevap);
                System.out.println("*********************");
            }
        }
        if (!soruVarMi) {
            System.out.println("Aradığınız soru bulunamadı...");
        }
    }

    public void karisikSinavYap() {

        if (coktanSecmeli.size() > 0 && klasik.size() > 0 && dogruYanlis.size() > 0 && boslukDoldurma.size() > 0) {
            ArrayList<Integer> dizi = new ArrayList<>();
            dizi.add(1);
            dizi.add(2);
            dizi.add(3);
            dizi.add(4);
            int toplam = 0, puan = 0, sayac = 0, rastgele;
            boolean sinavTamamlandiMi = false;
            while (true) {
                if (dizi.size() > 0) {
                    int sayi = (int) (Math.random() * dizi.size());
                    int sayi2 = dizi.get(sayi);
                    switch (sayi2) {
                        case 1:
                            try (BufferedWriter yazici = new BufferedWriter(new FileWriter("Sınav.txt", true))) {
                                rastgele = (int) (Math.random() * coktanSecmeli.size());
                                sayac += coktanSecmeli.get(rastgele).puan;
                                System.out.println("*********************");
                                System.out.println(rastgele + ". indexte " + coktanSecmeli.get(rastgele).soruMetni);
                                System.out.println("A." + coktanSecmeli.get(rastgele).aSikki);
                                System.out.println("B." + coktanSecmeli.get(rastgele).bSikki);
                                System.out.println("C." + coktanSecmeli.get(rastgele).cSikki);
                                System.out.println("D." + coktanSecmeli.get(rastgele).dSikki);
                                String kullCevap = input.next();

                                yazici.write("*********************\n");
                                yazici.write(rastgele + ". indexte " + coktanSecmeli.get(rastgele).soruMetni + "\n");
                                yazici.write("A." + coktanSecmeli.get(rastgele).aSikki + "\n");
                                yazici.write("B." + coktanSecmeli.get(rastgele).bSikki + "\n");
                                yazici.write("C." + coktanSecmeli.get(rastgele).cSikki + " \n");
                                yazici.write("D." + coktanSecmeli.get(rastgele).dSikki + "\n");
                                yazici.write("Cevap: " + kullCevap + "\n");
                                yazici.write("*********************\n");
                                if (coktanSecmeli.get(rastgele).cevap.equals(kullCevap)) {
                                    puan += coktanSecmeli.get(rastgele).puan;
                                }
                                System.out.println("*********************");
                                dizi.remove(sayi);
                                break;

                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        case 2:
                            try (BufferedWriter yazici = new BufferedWriter(new FileWriter("Sınav.txt", true))) {
                                rastgele = (int) (Math.random() * klasik.size());
                                sayac += klasik.get(rastgele).puan;
                                System.out.println("*********************");
                                System.out.println(rastgele + ". indexte " + klasik.get(rastgele).soruMetni);
                                String kullCevap = input.next();

                                yazici.write("*********************\n");
                                yazici.write(rastgele + ". indexte " + klasik.get(rastgele).soruMetni + "\n");
                                yazici.write("Cevap: " + kullCevap + "\n");
                                yazici.write("*********************\n");
                                if (klasik.get(rastgele).cevap.equals(kullCevap)) {
                                    puan += klasik.get(rastgele).puan;
                                }
                                System.out.println("*********************");
                                dizi.remove(sayi);
                                break;

                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        case 3:
                            try (BufferedWriter yazici = new BufferedWriter(new FileWriter("Sınav.txt", true))) {
                                rastgele = (int) (Math.random() * boslukDoldurma.size());
                                sayac += boslukDoldurma.get(rastgele).puan;
                                System.out.println("*********************");
                                System.out.println(rastgele + ". indexte " + boslukDoldurma.get(rastgele).soruMetni);
                                String kullCevap = input.next();

                                yazici.write("*********************\n");
                                yazici.write(rastgele + ". indexte " + boslukDoldurma.get(rastgele).soruMetni + "\n");
                                yazici.write("Cevap: " + kullCevap + "\n");
                                yazici.write("*********************\n");
                                if (boslukDoldurma.get(rastgele).cevap.equals(kullCevap)) {
                                    puan += boslukDoldurma.get(rastgele).puan;
                                }
                                System.out.println("*********************");
                                dizi.remove(sayi);
                                break;

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        case 4:
                            try (BufferedWriter yazici = new BufferedWriter(new FileWriter("Sınav.txt", true))) {
                                rastgele = (int) (Math.random() * dogruYanlis.size());
                                sayac += dogruYanlis.get(rastgele).puan;
                                System.out.println("*********************");
                                System.out.println(rastgele + ". indexte " + dogruYanlis.get(rastgele).soruMetni);
                                System.out.println("A." + dogruYanlis.get(rastgele).dogruSik);
                                System.out.println("B." + dogruYanlis.get(rastgele).yanlisSik);
                                String kullCevap = input.next();

                                yazici.write("*********************\n");
                                yazici.write(rastgele + ". indexte " + dogruYanlis.get(rastgele).soruMetni + "\n");
                                yazici.write("A." + dogruYanlis.get(rastgele).dogruSik + "\n");
                                yazici.write("B." + dogruYanlis.get(rastgele).yanlisSik + "\n");
                                yazici.write("Cevap: " + kullCevap + "\n");
                                yazici.write("*********************\n");
                                if (dogruYanlis.get(rastgele).cevap.equals(kullCevap)) {
                                    puan += dogruYanlis.get(rastgele).puan;
                                }
                                System.out.println("*********************");
                                dizi.remove(sayi);
                                break;

                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                    }

                } else {
                    int sayi = (int) (Math.random() * 4);
                    if (sayi == 1) {
                        try (BufferedWriter yazici = new BufferedWriter(new FileWriter("Sınav.txt", true))) {
                            rastgele = (int) (Math.random() * coktanSecmeli.size());
                            if (sayac + coktanSecmeli.get(rastgele).puan > 110) {
                                continue;
                            }

                            sayac += coktanSecmeli.get(rastgele).puan;
                            System.out.println("*********************");
                            System.out.println(rastgele + ". indexte " + coktanSecmeli.get(rastgele).soruMetni);
                            System.out.println("A." + coktanSecmeli.get(rastgele).aSikki);
                            System.out.println("B." + coktanSecmeli.get(rastgele).bSikki);
                            System.out.println("C." + coktanSecmeli.get(rastgele).cSikki);
                            System.out.println("D." + coktanSecmeli.get(rastgele).dSikki);
                            String kullCevap = input.next();

                            yazici.write("*********************\n");
                            yazici.write(rastgele + ". indexte " + coktanSecmeli.get(rastgele).soruMetni + "\n");
                            yazici.write("A." + coktanSecmeli.get(rastgele).aSikki + "\n");
                            yazici.write("B." + coktanSecmeli.get(rastgele).bSikki + "\n");
                            yazici.write("C." + coktanSecmeli.get(rastgele).cSikki + " \n");
                            yazici.write("D." + coktanSecmeli.get(rastgele).dSikki + "\n");
                            yazici.write("Cevap: " + kullCevap + "\n");
                            yazici.write("*********************\n");
                            if (coktanSecmeli.get(rastgele).cevap.equals(kullCevap)) {
                                puan += coktanSecmeli.get(rastgele).puan;
                            }
                            System.out.println("*********************");
                            if (sayac >= 100 && sayac <= 110) {
                                sinavTamamlandiMi = true;
                                System.out.println(puan);
                                System.out.println(sayac);
                                break;
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else if (sayi == 2) {
                        try (BufferedWriter yazici = new BufferedWriter(new FileWriter("Sınav.txt", true))) {
                            rastgele = (int) (Math.random() * klasik.size());
                            if (sayac + klasik.get(rastgele).puan > 110) {
                                continue;
                            }
                            sayac += klasik.get(rastgele).puan;
                            System.out.println("*********************");
                            System.out.println(rastgele + ". indexte " + klasik.get(rastgele).soruMetni);
                            String kullCevap = input.next();

                            yazici.write("*********************\n");
                            yazici.write(rastgele + ". indexte " + klasik.get(rastgele).soruMetni + "\n");
                            yazici.write("Cevap: " + kullCevap + "\n");
                            yazici.write("*********************\n");
                            if (klasik.get(rastgele).cevap.equals(kullCevap)) {
                                puan += klasik.get(rastgele).puan;
                            }
                            System.out.println("*********************");
                            if (sayac >= 100 && sayac <= 110) {
                                sinavTamamlandiMi = true;
                                System.out.println(puan);
                                System.out.println(sayac);
                                break;
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else if (sayi == 3) {
                        try (BufferedWriter yazici = new BufferedWriter(new FileWriter("Sınav.txt", true))) {
                            rastgele = (int) (Math.random() * boslukDoldurma.size());
                            if (sayac + boslukDoldurma.get(rastgele).puan > 110) {
                                continue;
                            }
                            sayac += boslukDoldurma.get(rastgele).puan;
                            System.out.println("*********************");
                            System.out.println(rastgele + ". indexte " + boslukDoldurma.get(rastgele).soruMetni);
                            String kullCevap = input.next();

                            yazici.write("*********************\n");
                            yazici.write(rastgele + ". indexte " + boslukDoldurma.get(rastgele).soruMetni + "\n");
                            yazici.write("Cevap: " + kullCevap + "\n");
                            yazici.write("*********************\n");
                            if (boslukDoldurma.get(rastgele).cevap.equals(kullCevap)) {
                                puan += boslukDoldurma.get(rastgele).puan;
                            }
                            System.out.println("*********************");
                            if (sayac >= 100 && sayac <= 110) {
                                sinavTamamlandiMi = true;
                                System.out.println(puan);
                                System.out.println(sayac);
                                break;
                            }


                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try (BufferedWriter yazici = new BufferedWriter(new FileWriter("Sınav.txt", true))) {
                            rastgele = (int) (Math.random() * dogruYanlis.size());
                            if (sayac + dogruYanlis.get(rastgele).puan > 110) {
                                continue;
                            }
                            sayac += dogruYanlis.get(rastgele).puan;
                            System.out.println("*********************");
                            System.out.println(rastgele + ". indexte " + dogruYanlis.get(rastgele).soruMetni);
                            System.out.println("A." + dogruYanlis.get(rastgele).dogruSik);
                            System.out.println("B." + dogruYanlis.get(rastgele).yanlisSik);
                            String kullCevap = input.next();

                            yazici.write("*********************\n");
                            yazici.write(rastgele + ". indexte " + dogruYanlis.get(rastgele).soruMetni + "\n");
                            yazici.write("A." + dogruYanlis.get(rastgele).dogruSik + "\n");
                            yazici.write("B." + dogruYanlis.get(rastgele).yanlisSik + "\n");
                            yazici.write("Cevap: " + kullCevap + "\n");
                            yazici.write("*********************\n");
                            if (dogruYanlis.get(rastgele).cevap.equals(kullCevap)) {
                                puan += dogruYanlis.get(rastgele).puan;
                            }
                            System.out.println("*********************");
                            if (sayac >= 100 && sayac <= 110) {
                                System.out.println(puan);
                                sinavTamamlandiMi = true;
                                System.out.println(sayac);
                                break;
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
                if (sinavTamamlandiMi) {
                    break;
                }
            }
        } else {
            System.out.println("Karışık Sınav için havuzda yeterli soru bulunmamaktadır...");
        }
    }
}
