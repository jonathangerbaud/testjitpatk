package com.toolsfordevs.sublib2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class TestActivity : AppCompatActivity()
{
    private val sublib2 = Sublib2()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        sublib2.sublib.doSomeStuff()
    }
}