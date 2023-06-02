package com.example.pagoeapps.database

import com.example.pagoeapps.R
import com.example.pagoeapps.database.database.detailTarian
import com.example.pagoeapps.tarian.TarianNusantara

object database {
    private var namaTarian = arrayOf(
        "Tari Saman Meuseukat",
        "Tari Bidadari Teminang Anak",
        "Tari Sekapur Sirih",
        "Tari Topeng",
        "Tari Serimpi",
        "Tari Reog Ponorogo",
        "Tari Radap Rahayu",
        "Tari Cakalele",
        "Tari Musyoh",
        "Tari Gareng Lameng"
    )

    private var asalTarian = arrayOf(
        "Prov. Aceh",
        "Prov. Bengkulu",
        "Prov. Jambi",
        "Prov. Jawa Barat",
        "Prov. Jawa Tengah",
        "Prov. Jawa Timur",
        "Prov. Kalimantan Selatan",
        "Prov. Maluku",
        "Prov. Papua Timur",
        "Prov. Nusa Tenggara Timur"
    )

    private var photoTarian = intArrayOf(
        R.drawable.tarisaman,
        R.drawable.taribidadariteminanganak,
        R.drawable.tarisekapursirih,
        R.drawable.taritopeng,
        R.drawable.tariserimpi,
        R.drawable.tarireogponorogo,
        R.drawable.tariradaprahayu,
        R.drawable.taricakalele,
        R.drawable.tarimusyoh,
        R.drawable.tarigarenglameng
    )

    private var detailTarian = arrayListOf(
        "Tari ini bermula pada sekitar abad XIV Masehi,  seorang Ulama Gayo bernama Syekh Saman, dari dataran tinggi Gayo menciptakan tarian ini. Pada awalnya tarian ini hanyalah berupa permainan rakyat yang dinamakan Pok Ane. Namun, pada perkembangannya ditambahkan pula iringan syair-syair yang berisi puji-pujian kepada Allah SWT, serta diiringi pula oleh kombinasi tepukan-tepukan para penari. Saat itu, tari Saman menjadi salah satu media dakwah. Pada awalnya, tarian saman hanya dimainkan kaum adam yang jumlahnya tidak lebih dari 10 orang, 8 sebagai penari dan 2 sebagai pemberi aba-aba. Pada perkembangannya, jumlah penari pun bisa lebih dari 10 penari.",
        "Tari Bidadari Teminang Anak merupakan tarian tradisional yang berasal dari Rejang Lebong, Provinsi Bengkulu. Tarian ini kerap dipentaskan pada berbagai macama acara seperti penyambutan tamu penting, upacara perkawinan dan berbagai acara lainnya. Tari Bidadari Teminang Anak atau dalam bahasa Bengkulu juga disebut Bidadei Teminang adalah sebuah tarian yang menggambarkan seorang bidadari cantik yang turun dari langit dan menuju bumi untuk meminang seorang anak. Tarian ini biasa biasa dilakukan oleh 8 hingga 16 orang penari, dengan salah satunya mengenakan kostum yang berbeda. Penari dengan kostum yang berbeda itu adalah gambaran seorang anak dari bumi yang diangkat sebagai anak oleh bidadari.",
        "Tari Sekapur Sirih merupakan salah tari penyambutan yang biasanya ditarikan oleh para penari perempuan, dengan mengenakan pakaian adat, para penari akan mementaskan tari Sekapur Sirih ditemani oleh alunan musik pengiring. Para penari akan menampilkan ragam gerakan tari Sekapur Sirih dengan lembut sambil membawa properti berupa cerano atau wadah untuk persembahan.",
        "Tari Topeng sudah ada sejak abad ke 10 Masehi. Tarian ini kemudian berkembang pada abad ke 10 hingga ke 16 Masehi. Saat itu adalah masa pemerintahan Prabu Panji Dewa. Beliau adalah Raja Jenggala yang ada di Jawa Timur. Lalu seiring berjalannya waktu, tari topeng mulai menyebar ke beberapa daerah yang ada di Jawa Barat. Salah satunya adalah daerah Cirebon.",
        "Awal mulanya muncul di masa kerajaan Mataram ketika Sultan Agung berkuasa di tahun 1613 sampai 1646. Tarian ini tergolong ke dalam seni budaya tertua yang ada di Jawa. Selain itu, tari serimpi juga dianggap mempunyai kesakralan dan juga kesucian. Sebab, tarian ini hanya dipentaskan di Kawasan Keraton sebagai bagian dari acara ritual. Di masa itu, orang-orang yang boleh mementaskan tarian ini hanya penari-penari pilihan. Kemudian pada tahun 1755 Kerajaan Mataram mengalami perpecahan dan menjadi Kesultanan Surakarta dan Kesultanan Yogyakarta. Tari ini pun terkena dampaknya. Dampak yang diperoleh yaitu adanya perbedaan antara gerakan tari serimpi Jogja dan tari serimpi Surakarta. Walaupun keduanya masih mempunyai inti tarian yang serupa.",
        "Dalam buku Babad Ponorogo jilid I-VIII tahun 1984, Tari Reog Ponorogo memiliki kisah tersendiri dalam proses kemunculannya. Sejarahnya berasal dari cerita rakyat. Ada lima versi cerita yang berkembang, namun yang paling terkenal adalah cerita tentang pemberontakan Ki Ageng Kutu. Dikisahkan bahwa Ki Ageng Kutu merupakan seorang abdi kerajaan pada masa Bhre Kertabumi pada abad ke-15. Dia melakukan pemberontakan karena murka pada pemerintahan raja yang penuh kezaliman dan terpengaruh kuat dari istri raja majapahit yang berasal dari Cina. ",
        "Pada awal sejarahnya, Tari Radap Rahayu ini diperuntukan untuk menolak bala atau musibah dan sebagai bentuk pengharapan kepada Yang Maha Esa untuk senantiasa diberikan kemudahan dan keselamatan. Namun, dengan seiring dengan perkembangan zaman, jenis tari ini juga ditampilkan dalam upacara penyambutan tamu yang terhormat, acara pernikahan, ataupun upacara kematian. Tari ini juga sebagai bentuk hiburan dan pagelaran budaya seni tari untuk masyarakat Banjarmasin.",
        "Menurut laman Kemdikbud, kata cakalele secara etimologi terdiri dari suku kata yaitu kata caka yang artinya adalah setan atau roh dan lele yang artinya adalah mengamuk. Jadi, tari Cakalele jika diartikan secara harfiah adalah setan atau roh yang mengamuk. Selain makna cakalele yang terdengar sedikit mengamuk, tari ini sebenarnya adalah tarian yang sangat sakral. Oleh karena itu, tarian ini tidak dapat ditarikan oleh orang luar yang bukan berasal dari desa di Kepulauan Banda. Selain itu, meskipun tari tradisional ini berasal dari Kepulauan Banda, tetapi tidak semua desa di pulau tersebut memiliki tradisi tari Cakalele, sebab tari ini hanya dimiliki oleh desa adat saja.",
        "Pada zaman dulu, saat seorang warga suku Papua meninggal dunia akibat kecelekaan atau hal yang tidak terduga, masyarakat Papua meyakini jika arwah dari orang yang meninggal tersebut masih bergentayangan dan tidak tenang. Untuk mengatasi hal tersebut, masyarakat suku Papua menciptakan satu ritual berupa Tari Musyoh. Sehingga, Tari Musyoh ini sering disebut sebagai tarian pengusir roh.",
        "Tari Gareng Lameng kerap menjadi pertunjukan pada saat penduduk sedang melangsungkan acara khitan. Ucapan-ucapan rasa syukur dan juga memohonkan doa atas kesuksesan dan kesehatan sang anak yang telah melangsungkan proses khitan. Dapat dirasakan suasana suka cita dalam Tarian Gareng Lameng ini. Masyarakat setempat merupakan masyarakat yang religius dan menjunjung tinggi nilai ketuhanan sehingga Tari Gareng Lameng pun terasa kesakralannya ketika masyarakat meminta berkat dari Yang Maha Kuasa."
    )

    val listData : ArrayList<TarianNusantara>
    get(){
        val list = ArrayList<TarianNusantara>()
        for(position in namaTarian.indices){
            val tarian = TarianNusantara()
            tarian.name = namaTarian[position]
            tarian.asal = asalTarian[position]
            tarian.photo = photoTarian[position]
            tarian.detail = detailTarian[position]
            list.add(tarian)
        }
        return list
    }
}