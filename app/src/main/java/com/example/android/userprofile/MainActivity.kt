package com.example.android.userprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var mAdapter : UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val mainItems:ArrayList<Text> = ArrayList()
        mainItems.add(Text("Bio","Write Something About You Here",R.drawable.bio))
        mainItems.add(Text("Location","Delhi , India",R.drawable.location))
        mainItems.add(Text("Basic Information","Height,Weight,Age , Gender , Activity",R.drawable.basicinfo))
        mainItems.add(Text("Primary Goal","Lose Weight",R.drawable.primarygoal))
        mainItems.add(Text("Food Prefrences","Diet Preference , Allergies , Cuisine",R.drawable.food))
        mainItems.add(Text("Payment Details","Update Your Payment Details Here",R.drawable.payment))
        val listView : RecyclerView =  findViewById(R.id.RecycleView)
        listView.layoutManager = LinearLayoutManager(this)
        mAdapter = UserAdapter(mainItems,this)
        listView.adapter = mAdapter

        // Finish
    }
}