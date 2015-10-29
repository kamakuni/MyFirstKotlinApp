package com.example.kamakuni.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText

class MyActivity : ActionBarActivity() {

    companion object {
        val EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_my, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

     fun sendMessage(view: View):Unit {
        val intent = Intent(this, javaClass<DisplayMessageActivity>())
        val editText = findViewById(R.id.edit_message) as EditText
         val message = editText.text.toString()
         intent.putExtra(EXTRA_MESSAGE,message)
        startActivity(intent)


    }

}
