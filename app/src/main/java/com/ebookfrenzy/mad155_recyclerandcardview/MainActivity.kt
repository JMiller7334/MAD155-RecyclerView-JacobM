package com.ebookfrenzy.mad155_recyclerandcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ebookfrenzy.mad155_recyclerandcardview.adapters.MyAdapter
import com.ebookfrenzy.mad155_recyclerandcardview.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set up
        recyclerView = findViewById<RecyclerView>(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,
            LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true) // a good practice

        // data
        arrayList = setupData()
        thisAdapter = MyAdapter(applicationContext, arrayList)// send the data to myAdapter
        recyclerView.adapter = thisAdapter // sets the recycler views adapter

    }

    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList() // generates a blank array to which I will sent to myAdapter to be displayed

        items.add(MyModel(R.drawable.p01, "A location somewhere1")) //creating an instance of MyModel and inserting into items array
        items.add(MyModel(R.drawable.p02, "A location somewhere2"))
        items.add(MyModel(R.drawable.p03, "A location somewhere3"))
        items.add(MyModel(R.drawable.p04, "A location somewhere4"))
        items.add(MyModel(R.drawable.p05, "A location somewhere5"))
        items.add(MyModel(R.drawable.p06, "A location somewhere6"))
        items.add(MyModel(R.drawable.p07, "A location somewhere7"))
        items.add(MyModel(R.drawable.p08, "A location somewhere8"))
        items.add(MyModel(R.drawable.p09, "A location somewhere9"))
        items.add(MyModel(R.drawable.p10, "A location somewhere10"))
        items.add(MyModel(R.drawable.p11, "A location somewhere11"))
        items.add(MyModel(R.drawable.p12, "A location somewhere12"))
        items.add(MyModel(R.drawable.p13, "A location somewhere13"))
        items.add(MyModel(R.drawable.p14, "A location somewhere14"))
        items.add(MyModel(R.drawable.p15, "A location somewhere15"))
        items.add(MyModel(R.drawable.p16, "A location somewhere16"))
        items.add(MyModel(R.drawable.p17, "A location somewhere17"))
        items.add(MyModel(R.drawable.p18, "A location somewhere18"))
        items.add(MyModel(R.drawable.p19, "A location somewhere19"))
        items.add(MyModel(R.drawable.p20, "A location somewhere20"))
        items.add(MyModel(R.drawable.p21, "A location somewhere21"))
        items.add(MyModel(R.drawable.p22, "A location somewhere22"))
        items.add(MyModel(R.drawable.p23, "A location somewhere23"))
        items.add(MyModel(R.drawable.p24, "A location somewhere24"))
        items.add(MyModel(R.drawable.p25, "A location somewhere25"))
        return items
    }
}