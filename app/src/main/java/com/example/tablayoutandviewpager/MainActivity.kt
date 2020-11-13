package com.example.tablayoutandviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayoutandviewpager.R.color.yalow
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

lateinit var  tabLay: TabLayout
lateinit var ViewPager: ViewPager2
lateinit var text: TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLay = findViewById(R.id.tab)
      ViewPager = findViewById(R.id.vp)


        val colors = listOf(
          R.color.colorAccent,
            R.color.colorPrimary,
            R.color.colorPrimaryDark
        )


        val adpter = ViewpagerAdpter(colors)
       ViewPager.adapter = adpter


        TabLayoutMediator(tabLay, ViewPager )
              { tab,postion->


            tab.icon=when(postion){

                0 -> ContextCompat.getDrawable(this,R.drawable.ic_launcher_foreground)
                1 -> ContextCompat.getDrawable(this,R.drawable.ic_launcher_foreground)
                2 -> ContextCompat.getDrawable(this,R.drawable.ic_launcher_foreground)
                else ->  ContextCompat.getDrawable(this,R.drawable.ic_launcher_foreground)
            }

            // Tab text

            tab.text=when(postion){


                0->"1"
                1->"2"
                2->"3"
                else-> null
            }
        }.attach()


      ViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Toast.makeText(this@MainActivity,position.toString(), Toast.LENGTH_LONG).show()
            }
        }
        )
    }




}