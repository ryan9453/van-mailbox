package com.example.mailbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.mailbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    fun toCheck(view: View) {
        var cargo = MailBox()
        cargo.length = binding.length.text.toString().toInt()
        cargo.width = binding.width.text.toString().toInt()
        cargo.height = binding.height.text.toString().toInt()
        var state = cargo.check(cargo.length,cargo.width,cargo.height)
        val message =
            when(state) {
                MailBox.BoxState.BOX1 -> "BOX1, ＄50."
                MailBox.BoxState.BOX2 -> "BOX2, ＄60."
                MailBox.BoxState.BOX3 -> "BOX3, ＄70."
                else -> "Your cargo is too big, please try again."
            }
        AlertDialog.Builder(this)
            .setTitle("Result")
            .setMessage(message)
            .setPositiveButton("OK",null)
            .show()
    }

}



