package com.example.mailbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mailbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    class MailBox (var length: Int, var width: Int, var height: Int) {
        constructor() : this(0, 0, 0) {
        }

        fun check() {
            when {
                // TODO: 想問老師為何在類別方法裡，呼叫不到 binding？
                // length > 10 || width > 15 || height > 15 -> binding.tip.text = "你的太大了，放不進來" // 這句不行
                length > 10 || width > 15 || height > 15 -> println("你的太大了，放不進來")
                length <= 10 && width <= 10 && height <= 10 -> println("您適合 BOX1, 費用 50元")
                length <= 10 && width <= 10 && height <= 15 -> println("您適合 BOX2, 費用 60元")
                length <= 10 && width <= 15 && height <= 15 -> println("您適合 BOX3, 費用 70元")
            }
        }
    }

    fun toCheck(view: View) {
        var cargo = MailBox()
        cargo.length = binding.length.text.toString().toInt()
        cargo.width = binding.width.text.toString().toInt()
        cargo.height = binding.height.text. toString().toInt()
        cargo.check()
    }
}




