package com.example.worldcup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1.Adapter view
        var listView = findViewById<ListView>(R.id.listView)

        //2.Adapter
        var adapter = WrldAdapter(this,generateData())
        listView?.adapter = adapter //Connect List view with adapter
        adapter?.notifyDataSetChanged()
    }

    //3. Data Source
    fun generateData():ArrayList<CountryModel>{
        var result = ArrayList<CountryModel>()

        var country1 : CountryModel = CountryModel("Brazil", "5", R.drawable.brazil)
        var country2 : CountryModel = CountryModel("France", "2", R.drawable.france)
        var country3 : CountryModel = CountryModel("Germany", "4", R.drawable.germany)
        var country4 : CountryModel = CountryModel("Saudi Arabia", "0", R.drawable.saudiarabia)
        var country5 : CountryModel = CountryModel("Spain", "0", R.drawable.spain)
        var country6 : CountryModel = CountryModel("United Kingdom", "1", R.drawable.unitedkingdom)
        var country7 : CountryModel = CountryModel("United States", "0", R.drawable.unitedstates)

        result.add(country1)
        result.add(country2)
        result.add(country3)
        result.add(country4)
        result.add(country5)
        result.add(country6)
        result.add(country7)

        return result

    }
}