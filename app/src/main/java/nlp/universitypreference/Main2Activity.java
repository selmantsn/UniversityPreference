package nlp.universitypreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tw1 = (TextView) findViewById(R.id.tw1);
        TextView tw2 = (TextView) findViewById(R.id.tw2);
        TextView tw3 = (TextView) findViewById(R.id.tw3);


        String text = " Bölüm , Taban Puanı \n" +
                "\n" +
                " İngilizce Öğretmenliği , 394.09560 \n" +
                " Mütercim-Tercümanlık (İngilizce) , 395.92011 \n" +
                " Matematik (İngilizce) , 238.81964 \n" +
                " Bahçe Bitkileri , - \n" +
                " Bitki Koruma , 228.78690 \n" +
                " Fen Bilgisi Öğretmenliği , 259.16387 \n" +
                " Fizik (İngilizce) , 211.03235 \n" +
                " Kimya (İngilizce) , 224.42515 \n" +
                " Diş Hekimliği Fakültesi (KKTC Uyruklu) , - \n" +
                " Ka tlı Hayvan Yetiştiriciliği , - \n" +
                " Tarla Bitkileri , - \n" +
                " Bilgisayar Mühendisliği , 319.63819 \n" +
                " Çevre Mühendisliği , - \n" +
                " Gıda Mühendisliği , 260.28242 \n" +
                " Makine Mühendisliği , 311.95197  \n" +
                " İktisat , 267.08787 \n" +
                " İktisat (İÖ) , 242.07477 \n" +
                " İşletme (İÖ) , 235.31683 \n" +
                " Maliye , 310.48158 \n" +
                " Maliye (İÖ) , 282.24725 \n" +
                " Sınıf Öğretmenliği , 367.23194 \n" +
                " Kamu Yönetimi , 332.41096 \n" +
                " Psikoloji , 419.35765 \n" +
                " Sosyoloji (İÖ) , 308.89939 \n" +
                " Uluslararası İlişkiler , 324.45252 \n" +
                " Uluslararası İlişkiler (İÖ) , 292.96681 \n" +
                " Gazetecilik , 326.77802 \n" +
                " Tarih , 337.30854 \n" +
                " Tarih (İÖ) , 317.88095 \n" +
                " Türk Dili ve Edebiyatı , 370.44720 \n" +
                " Türk Dili ve Edebiyatı (İÖ) , 347.14204 \n" +
                " Bilgisayar Programcılığı , 238.25957 \n" +
                " Bilgisayar Programcılığı , 212.66995 \n" +
                " Bilgisayar Programcılığı (İÖ) , 207.88283 \n" +
                " Bilgisayar Programcılığı (İÖ) , 173.81392 \n" +
                " Bilgisayar ve Öğretim Teknolojileri Öğretmenliği , 298.91338 \n" +
                " Elektrik , 210.30133 \n" +
                " Elektrik (İÖ) (Bk.371) , 168.19542 \n" +
                " Elektronik Teknolojisi , 200.24281 \n" +
                " Elektronik Teknolojisi (İÖ) (Bk.371) , 170.88964 \n" +
                " İnşaat Teknolojisi , 244.45774 \n" +
                " Makine (İÖ) (Bk.371) , 171.97806 \n" +
                " Makine, Resim ve Konstrüksiyon , 170.86218 \n" +
                " Makine, Resim ve Konstrüksiyon (İÖ) , - \n" +
                " Otomotiv Teknolojisi , 199.65046 \n" +
                " Otomotiv Teknolojisi , 184.03294 \n" +
                " Otomotiv Teknolojisi (İÖ) , 205.47331 \n" +
                " Otomotiv Teknolojisi (İÖ) , 179.74049 \n" +
                " Tekstil Teknolojisi , 183.94437 \n" +
                " Tekstil Teknolojisi (İÖ) (Bk.372) , - \n" +
                " Tıbbi Görüntüleme Teknikleri , 318.58475 \n" +
                " Ağız ve Diş Sağlığı , 306.39754 \n" +
                " Ayakkabı Tasarım ve Üretimi , 190.28739 \n" +
                " Deri Teknolojisi , 178.44036 \n" +
                " Fizyoterapi ve Rehabilitasyon , 451.21125 \n" +
                " Gıda Kalite Kontrolü ve A lizi , 214.48071 \n" +
                " Hemşirelik , 364.91641 \n" +
                " İş Sağlığı ve Güvenliği , 268.12525 \n" +
                " Kimya Teknolojisi , 204.49809 \n" +
                " Aşçılık , 333.90884 \n" +
                " Aşçılık (İÖ) , 310.82008 \n" +
                " Gastronomi ve Mutfak Sa tları , 370.35761 \n" +
                " İlahiyat , 371.00714 \n" +
                " İlahiyat (İÖ) , 351.65087 \n" +
                " Özel Eğitim Öğretmenliği , 399.59688 \n" +
                " Grafik Tasarımı (İÖ) (Bk.372) , 256.22418 \n" +
                " İç Mekan Tasarımı (İÖ) , 266.26220 \n" +
                " Kooperatifçilik , 195.91406 \n" +
                " Mimari Restorasyon , 275.43402 \n" +
                " Moda Tasarımı , 252.13054 \n" +
                " Moda Tasarımı (İÖ) , 220.23564 \n" +
                " Okul Öncesi Öğretmenliği , 373.62423 \n" +
                " Posta Hizmetleri , 273.34984 \n" +
                " Posta Hizmetleri (İÖ) , 246.17308 \n" +
                " Sosyal Güvenlik , 303.04454 \n" +
                " Sosyal Hizmetler , 335.51949 \n" +
                " Bahçe Tarımı , - \n" +
                " Bankacılık ve Fi ns , 289.54346 \n" +
                " Bankacılık ve Fi ns (İÖ) , 264.74637 \n" +
                " Bankacılık ve Sigortacılık , 260.97927 \n" +
                " Bankacılık ve Sigortacılık (İÖ) , 227.45663 \n" +
                " Dış Ticaret , 220.27333 \n" +
                " İşletme Yönetimi , 198.51747 \n" +
                " İşletme Yönetimi , 211.18198 \n" +
                " İşletme Yönetimi , 218.39177 \n" +
                " İşletme Yönetimi (İÖ) , 168.55079 \n" +
                " Kümes Hayvanları Yetiştiriciliği , - \n" +
                " Lojistik , 237.56586 \n" +
                " Muhasebe ve Vergi Uygulamaları , 228.43875 \n" +
                " Muhasebe ve Vergi Uygulamaları , 215.00833 \n" +
                " Muhasebe ve Vergi Uygulamaları (İÖ) , 172.11857 \n" +
                " Organik Tarım , - \n" +
                " Ormancılık ve Orman Ürünleri , 258.74910 \n" +
                " Pazarlama , 241.72671 \n" +
                " Pazarlama (İÖ) , 220.25440 \n" +
                " Peyzaj ve Süs Bitkileri , 197.72711 \n" +
                " Tıbbi ve Aromatik Bitkiler , 176.57174 \n" +
                " Turizm ve Otel İşletmeciliği , 196.90550 \n" +
                " Turizm ve Otel İşletmeciliği , 225.55955 \n" +
                " Turizm ve Otel İşletmeciliği (İÖ) , 180.91013 \n" +
                " Uluslararası Ticaret ve Lojistik , 281.55004 \n" +
                " Uluslararası Ticaret ve Lojistik (İÖ) , 259.30746 \n"
                +"\n";
        try {
            InputStream is = getAssets().open("abant.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        tw3.setText(text);


        tw1.setText(getIntent().getStringExtra("Üniversite Adı"));
        tw2.setText(getIntent().getStringExtra("Compound Value"));



    }



}

