package com.example.arraylistpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
fun main() {
    var arraylist2 = arrayOf("dhakad","bodyguard","3 idiots")
    var arraylist1=  arrayOf("movie1","movie2","movie3")

    var arraylist=ArrayList<HashMap<String,String>>()
    for (i in 0..arraylist1.lastIndex)
    {
        var hm =HashMap<String,String >()
        hm.put(arraylist1[i],arraylist2[i])
        arraylist.add(hm)
    }
    println(arraylist)
}
