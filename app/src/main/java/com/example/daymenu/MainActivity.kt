package com.example.daymenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_items,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.setting -> Toast.makeText(this,"Setting is Clicked",Toast.LENGTH_SHORT).show()
            R.id.delete -> Toast.makeText(this,"Delete is Clicked",Toast.LENGTH_SHORT).show()
            R.id.help -> Toast.makeText(this,"Help is Clicked",Toast.LENGTH_SHORT).show()
            R.id.contact -> Toast.makeText(this,"Contact Us is Clicked",Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }
}