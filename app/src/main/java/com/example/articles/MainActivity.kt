package com.example.articles

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),RecyclerAdapter.MyClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecyclerAdapter
    private lateinit var moveList: ArrayList<Data>

    private lateinit var image : Array<Int>
    private lateinit var title : Array<String>
    private lateinit var name : Array<String>
    private lateinit var day : Array<String>
    private lateinit var avatar : Array<Int>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         title = arrayOf(
            "Dry farming could help agriculture in the western U.S. amid climate change",
            "Plant/animal hybrid proteins could help crops fend off diseases",
            "The oldest known pollen-carrying insects lived about 280 million years ago",
            "A Caribbean island gets everyone involved in protecting beloved species",
            "How Kenyans help themselves and the planet by saving mangrove trees",
            "The worldwide water-lifting power of plants is enormous",
            "Flower shape and size impact bees’ chances of catching gut parasites",
            "These flowers lure pollinators to their deaths. There’s a new twist on how",
            "Africa’s fynbos plants hold their ground with the world’s thinnest roots",
            "Earth may have 9,200 more tree species than previously thought"
        )
         name = arrayOf(
            "Katherine Kornei",
            "Erin Garcia de Jesús",
            "Sid Perkins",
            "Anna Gibbs",
            "Geoffrey Kamadi",
            "Sid Perkins",
            "Rachel Crowell",
            "Susan Milius",
            "Nikk Ogasa",
            "Jake Buehler",
            "Jude Coleman"
        )
        day = arrayOf(
            "March 9, 2023",
            "March 2, 2023",
            "February 28, 2023",
            "September 27, 2022",
            "September 14, 2022",
            "September 6, 2022",
            "July 12, 2022",
            "April 19, 2022",
            "March 24, 2022",
            "March 1, 2022",
            "February 7, 2022"
        )
         image = arrayOf(
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8,
            R.drawable.a9,
            R.drawable.a10
        )
        avatar = arrayOf(
            R.drawable.b1,
            R.drawable.b2,
            R.drawable.b3,
            R.drawable.b4,
            R.drawable.b5,
            R.drawable.b6,
            R.drawable.b7,
            R.drawable.b8,
            R.drawable.b9,
            R.drawable.b10
        )





        recyclerView = findViewById(R.id.recycerView)

        moveList = ArrayList()
        moveList.add(Data(image[0],title[0],name[0],day[0],avatar[0]))
        moveList.add(Data(image[1],title[1],name[1],day[1],avatar[1]))
        moveList.add(Data(image[2],title[2],name[2],day[2],avatar[2]))
        moveList.add(Data(image[3],title[3],name[3],day[3],avatar[3]))
        moveList.add(Data(image[4],title[4],name[4],day[4],avatar[4]))
        moveList.add(Data(image[5],title[5],name[5],day[5],avatar[5]))
        moveList.add(Data(image[6],title[6],name[6],day[6],avatar[6]))
        moveList.add(Data(image[7],title[7],name[7],day[7],avatar[7]))


        adapter = RecyclerAdapter(moveList,this@MainActivity)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)




    }

    override fun onClick(position: Int) {
        when(position){
            0 -> startActivity(Intent(this,article1::class.java))
            1 -> startActivity(Intent(this,article2::class.java))
            2 -> startActivity(Intent(this,article3::class.java))
            3 -> startActivity(Intent(this,articles4::class.java))
            4 -> startActivity(Intent(this,articles5::class.java))
            5 -> startActivity(Intent(this,articles6::class.java))
            6 -> startActivity(Intent(this,articles7::class.java))
            7 -> startActivity(Intent(this,articles8::class.java))
            8 -> startActivity(Intent(this,articles9::class.java))
            9 -> startActivity(Intent(this,articles10::class.java))
        }
    }

}