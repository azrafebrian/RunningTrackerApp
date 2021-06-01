package com.example.runningtrackerapp;

import com.example.runningtrackerapp.DataItemArtikel;

import java.util.ArrayList;

public class DataArtikel {

    private static final String[] tanggalBerita = {
            "11 Mei 2018",
            "31 Juli 2017"
    };

    private static final String[] judulBerita = {
            "Lima Manfaat Lari yang Sayang untuk Dilewatkan",
            "Yuk, Intip Semua Fakta, Mitos, dan Manfaat Olahraga Lari"
    };

    private static final String[] deskripsiBerita = {
            //Berita1
            "Beberapa manfaat lari untuk kesehatan tubuh, yaitu dapat memperlancar aliran darah, serta meningkatkan kesehatan dan kebugaran tubuh. Di samping itu, lari juga dapat memicu pengeluaran hormon dan enzim yang merangsang jantung dan otot bekerja lebih baik. Tak hanya itu, simak manfaat lari lainnya berikut ini.\n" +
                    "\n" +
                    "Di samping memperlancar aliran darah dalam tubuh, lari juga memiliki manfaat lain yang secara langsung dapat memengaruhi beberapa bagian tubuh. Berikut ini adalah beberapa manfaat lari bagi tubuh.\n" +
                    "\n" +
                    "Mengurangi berat badan\n" +
                    "Olahraga lari dapat memicu pembakaran kalori dalam tubuh Anda. Berlari atau jogging juga termasuk jenis olahraga yang baik untuk mengecilkan perut. Banyaknya kalori yang dibakar dipengaruhi oleh seberapa cepat dan seberapa jauh jarak lari Anda, serta berat badan Anda.\n" +
                    "\n" +
                    "Baik bagi kesehatan lutut\n" +
                    "Melakukan olahraga lari dapat memelihara kesehatan lutut, bahkan pada penderita arthritis sekalipun. Studi menunjukkan bahwa olahraga lari dapat menurunkan risiko arthritis pada lutut dan pinggul, serta merangsang pertumbuhan tulang rawan pada lutut. Namun apabila Anda memiliki masalah pada sendi, sebaiknya konsultasikan dengan dokter terlebih dahulu, sebelum memulai olahraga lari sebagai aktivitas rutin.\n" +
                    "\n" +
                    "Mencegah osteoporosis\n" +
                    "Olahraga lari dapat memicu pembentukan sel-sel tulang baru. Hal ini yang membuat tulang Anda menjadi lebih kuat dan dapat menurunkan risiko terkena osteoporosis di kemudian hari.\n" +
                    "\n" +
                    "Mengurangi risiko jantung koroner\n" +
                    "Penelitian menunjukkan bahwa mereka yang melakukan olahraga lari teratur dan lebih dari 50 menit dalam seminggu dapat menurunkan risiko penyakit kardiovaskular. Selain melakukan olahraga teratur, Anda perlu menunjangnya dengan makanan dan gaya hidup yang sehat.\n" +
                    "\n" +
                    "Memperbaiki suasana hati\n" +
                    "Seseorang yang rutin melakukan olahraga lari, akan merasa hari-harinya lebih baik dan bahagia. Hal ini mampu meningkatkan suasana hati Anda, dan berdampak baik pada kualitas hidup Anda.",

            //Berita2
            "Meski terbilang mudah dan dapat dilakukan semua kalangan, ternyata masih banyak orang yang belum paham betul mengenai dunia lari. Penasaran? Yuk, cek dan ricek kembali mitos dan fakta mengenai olahraga ini.\n" +
                    "\n" +
                    "Fakta: Lari beda dengan jogging\n" +
                    "Berlari mengharuskan Anda bergerak lebih cepat, menggunakan lebih banyak energi, dan menuntut jantung, paru, dan otot bekerja lebih keras daripada jogging.\n" +
                    "\n" +
                    "Fakta: Berlari termasuk bentuk latihan aerobik\n" +
                    "Olahraga aerobik adalah jenis latihan fisik yang merangsang laju pernapasan dan denyut jantung lebih cepat selama sesi olahraga. Saat laju pernapasan dan denyut jantung meningkat, Anda tentu memerlukan lebih banyak oksigen. Jika Anda bayangkan, efeknya sama ketika Anda sedang berlari, bukan?\n" +
                    "\n" +
                    "Fakta: Berlari lebih cepat dan lebih lama, membakar kalori lebih banyak\n" +
                    "Olahraga dapat membakar energi tubuh. Jika kalori dalam tubuh yang ingin dibakar lebih banyak, maka Anda harus meningkatkan intensitasnya. Ambil contoh lari 13 km, misalnya.\n" +
                    "\n" +
                    "Jika seseorang dengan berat 100 kg menempuh jarak tersebut dengan lari, ia bisa membakar sekitar 150 kalori. Untuk orang dengan berat 54 kg, ia bisa membakar sekitar 82 kalori. Ini berarti, semakin bugar tubuh Anda, maka semakin sedikit kalori yang terbakar dalam jarak tempuh yang sama.\n" +
                    "\n" +
                    "Mitos: Harus minum minuman olahraga setelah atau selama latihan\n" +
                    "Minuman olahraga memang mengandung kalori dan elektrolit yang membantu dalam olahraga lari. Pasalnya, kandungan pada minuman akan mengganti cairan tubuh yang hilang sehingga mencegah tubuh Anda lelah dan lemas.\n" +
                    "\n" +
                    "Namun, jenis minuman ini paling bermanfaat untuk sesi berlari dengan waktu lebih dari satu jam. Jika Anda hanya berlari hanya 30 menit atau kurang dari 1 jam, air putih adalah pilihan terbaik. Kenapa?\n" +
                    "\n" +
                    "Energi yang Anda gunakan untuk berlari selama 30 menit tidak terbuang cukup banyak sehingga tidak perlu minum minuman olahraga yang punya kalori tinggi.\n" +
                    "\n" +
                    "Mitos: Tak perlu pemanasan sebelum latihan\n" +
                    "Lari adalah suatu jenis olahraga dengan intensitas yang lumayan tinggi. Maka dari itu, latihan pemanasan yang tepat sangat dianjurkan. Namun, latihan pemanasan atau peregangan yang dianjurkan bukanlah peregangan statis, yaitu cara melemaskan otot dengan menahan gerakan selama beberapa detik.\n" +
                    "\n" +
                    "Latihan pemanasan yang lebih baik untuk berlari, setidaknya dilakukan selama 5 hingga 10 menit. Ini memberikan otot Anda waktu lebih lama untuk menyesuaikan latihan nantinya. Ini dikenal dengan latihan peregangan dinamis, yang terdiri dari gerakan lunges, leg swings, atau butt kicks.\n" +
                    "\n" +
                    "Mitos: Berlari setiap hari itu aman\n" +
                    "Jika Anda ingin latihan ini membuahkan hasil, lakukan juga cross-training. Lari tidak hanya mencakup gerakan kaki berulang; otot dan stamina Anda perlu meningkat untuk bisa menempuh jarak yang lebih jauh. Untuk itu, cobalah untuk mengkombinasikan latihan dengan berenang, bersepeda, angkat beban, atau jenis olahraga lainnya."
    };

    public static ArrayList<DataItemArtikel> getListDataArtikel() {
        ArrayList<DataItemArtikel> list = new ArrayList<>();
        for (int position = 0; position < judulBerita.length; position++) {
            DataItemArtikel dataArtikel = new DataItemArtikel();
            dataArtikel.setTglBerita(tanggalBerita[position]);
            dataArtikel.setJudulBerita(judulBerita[position]);
            dataArtikel.setDescBerita(deskripsiBerita[position]);
            list.add(dataArtikel);
        }

        return list;
    }
}

//https://www.alodokter.com/lima-manfaat-lari-yang-sayang-untuk-dilewatkan
//https://hellosehat.com/kebugaran/olahraga-lainnya/fakta-mitos-olahraga-lari/