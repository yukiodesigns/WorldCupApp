package com.example.worldcup

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class WrldAdapter(private var activity: Activity, private var items: ArrayList<CountryModel> ): BaseAdapter {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): CountryModel {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //Used in adapter to generate items view for a list view

    }


}