package com.example.tablayoutandviewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewpagerAdpter (val colors:List<Int>): RecyclerView.Adapter<ViewpagerAdpter.ViewPagerViewHolder>(){



    inner  class  ViewPagerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override  fun onCreateViewHolder(parent: ViewGroup, viewType:Int):ViewPagerViewHolder{


        val view= LayoutInflater.from(parent.context).inflate(R.layout.fragments,parent,false)


        return  ViewPagerViewHolder(view)

    }

    override  fun getItemCount():Int{

        return  colors.size

    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val theColors=colors[position]

        var  a= holder.itemView.findViewById(R.id.Text) as TextView
        a.setBackgroundResource(theColors)

    }








}
