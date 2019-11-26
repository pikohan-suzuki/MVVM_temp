package com.amebaownd.pikohan_nwiatori.mvvm_temp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this).get(ViewModel::class.java)

        val fetChButton = findViewById<Button>(R.id.fetch_button)
        val numTextView = findViewById<TextView>(R.id.num_text)

        fetChButton.setOnClickListener {
            viewModel.fetchNum()
            numTextView.text = viewModel.num.number.toString()
        }
    }
}
