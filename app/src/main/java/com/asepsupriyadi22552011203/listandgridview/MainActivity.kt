package com.asepsupriyadi22552011203.listandgridview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.setHasFixedSize(true)

        val itemList = listOf(
            ItemList(
                "Fisika Kuantum",
                "Fisika kuantum sendiri merupakan sebuah ilmu atau studi yang mempelajari mengenai perilaku materi serta energi yang ada pada tingkatan molekuler, atom, nuklir, ...",
                "https://down-id.img.susercontent.com/file/295e12d79647f3170e66a64fdda6c8c0"
            ),
            ItemList(
                "Kalkulus Integral",
                "Membahas tentang pengantar integral, integral riemann, teknik pengintegralan, fungsi transenden, bentuk tak tentu dan integral tak wajar, luas bidang datar, ....",
                "https://down-id.img.susercontent.com/file/id-11134207-7r98r-lvfo0wmom7xr33"
            ),
            ItemList(
                "DBMS",
                "Sistem manajemen database yang bersifat open-source yang menggunakan perintah dasar atau bahasa pemrograman yang berupa ...",
                "https://down-id.img.susercontent.com/file/id-11134207-7r98v-lp5996s9ytl9a1"
            ),
            ItemList(
                "Pengantar Statistika",
                "Mempelajari bagaimana cara merencanakan, mengumpulkan, menganalisis, lalu menginterpretasikan, dan akhirnya mempresentasikan data.",
                "https://down-id.img.susercontent.com/file/365baff88d50b73cb57b22d854a07d0a"
            ),
            ItemList(
                "Sejarah Perang Dunia",
                "Mempelajari peristiwa-peristiwa utama dan dampak-dampak besar dari Perang Dunia I dan II.",
                "https://down-id.img.susercontent.com/file/id-11134601-7quky-lir15telax7a57"
            ),
            ItemList(
                "Object Oriented Programming",
                "Memahami konsep-konsep dasar dari pemrograman berorientasi objek seperti kelas, objek, pewarisan, dan polimorfisme.",
                "https://down-id.img.susercontent.com/file/0cff09aeab4b4ba2ce87756fb8ad0ad7"
            ),
            ItemList(
                "Project Management",
                "Mengelola proyek dari awal hingga akhir, termasuk perencanaan, pelaksanaan, dan evaluasi.",
                "https://down-id.img.susercontent.com/file/id-11134201-7r98o-ltjua654ogxaaa"
            ),
            ItemList(
                "Business Plan",
                "Merancang rencana bisnis yang komprehensif untuk mendukung pertumbuhan dan keberlanjutan usaha.",
                "https://down-id.img.susercontent.com/file/id-11134207-7r98y-lrepfzaflebxef"
            ),
            ItemList(
                "Teori Bahasa Automata",
                "Mempelajari dasar-dasar teori bahasa formal dan automata serta penerapannya dalam ilmu komputer.",
                "https://down-id.img.susercontent.com/file/sg-11134201-7qvfu-lgf0fpdv188wff"
            ),
            ItemList(
                "Big Data",
                "Mengeksplorasi konsep dan teknologi terkait dengan pengelolaan dan analisis data besar.",
                "https://down-id.img.susercontent.com/file/id-11134207-7r98w-lmiyepans7c497"
            )
        )


        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter

    }
}