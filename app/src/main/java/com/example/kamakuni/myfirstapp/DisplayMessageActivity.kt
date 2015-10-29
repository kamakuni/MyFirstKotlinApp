package com.example.kamakuni.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import android.widget.TextView

class DisplayMessageActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = getIntent()
        val message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE)
        val textView = TextView(this)
        textView.textSize = 40f
        textView.text = message
        setContentView(textView)
    }

}
