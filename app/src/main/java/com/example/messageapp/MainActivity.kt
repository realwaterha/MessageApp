package com.example.messageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var btn1: AppCompatButton
    private lateinit var btn2: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
        if (navHostFragment != null) {
            navController = navHostFragment.findNavController()
        }
    }

    fun mainVisiable() {
        btn1 = findViewById(R.id.frag_btn_1)
        btn2 = findViewById(R.id.frag_btn_2)
        btn1.visibility = View.INVISIBLE
        btn2.visibility = View.INVISIBLE
    }
}

//<!--fragment setting-->
//<androidx.fragment.app.FragmentContainerView
//android:id="@+id/nav_host_fragment"
//android:name="androidx.navigation.fragment.NavHostFragment"
//android:layout_width="0dp"
//android:layout_height="0dp"
//app:layout_constraintLeft_toLeftOf="parent"
//app:layout_constraintRight_toRightOf="parent"
//app:layout_constraintTop_toTopOf="parent"
//app:layout_constraintBottom_toBottomOf="parent"
//app:defaultNavHost="true"
//app:navGraph="@navigation/nav_graph" />