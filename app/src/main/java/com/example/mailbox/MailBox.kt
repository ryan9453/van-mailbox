package com.example.mailbox



class MailBox (var length: Int, var width: Int, var height: Int) {
    constructor() : this(0, 0, 0) {
    }
    enum class BoxState() {
        BOX1, BOX2, BOX3, Oversize
    }

    fun check(length: Int,width: Int,height: Int) : BoxState{
        val state =
            when {
                // TODO: 想問老師為何在類別方法裡，呼叫不到 binding？
    //                length > 10 || width > 15 || height > 15 -> binding.tip.text = "你的太大了，放不進來" // 這句不行
                length <= 10 && width <= 10 && height <= 10 -> BoxState.BOX1
                length <= 10 && width <= 10 && height <= 15 -> BoxState.BOX2
                length <= 10 && width <= 15 && height <= 15 -> BoxState.BOX3
                else -> BoxState.Oversize
            }
        return state
    }
}