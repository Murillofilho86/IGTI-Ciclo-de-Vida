package com.example.igticiclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class SecundaryActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secundary)

        button = findViewById(R.id.btnResultado)
        Log.i("IGTILOG", "$ACTIVITY onCreate")

        configurarListeners()

    }

    private fun configurarListeners() {
        acaoBotaoVoltar()
        acaoBotaoExibir()
    }

    private fun acaoBotaoExibir() {
        findViewById<Button>(R.id.btnNovo).setOnClickListener{
            button.visibility = View.VISIBLE
        }
    }

    private fun acaoBotaoVoltar() {

          button.setOnClickListener{
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "$ACTIVITY onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.i(TAG, "$ACTIVITY onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.i(TAG, "$ACTIVITY onStop")
    }

    override fun onStart() {
        super.onStart()

        Log.i(TAG, "$ACTIVITY onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "$ACTIVITY onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "$ACTIVITY onDestroy")
    }

    companion object {
        private val TAG = "IGTILOG"
        private val ACTIVITY = "SecundaryActivity::"
    }

}