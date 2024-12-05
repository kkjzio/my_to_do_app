package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

//    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        //1、先拿NavHostFragment
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
//        //2、再拿NavController
//        val navController:NavController = navHostFragment.navController

        setContentView(R.layout.activity_main)
        val findNavController :NavController = findNavController(R.id.navHostFragment)
        this.setupActionBarWithNavController(findNavController)

//        val navHostFragment = supportFragmentManager
//            .findFragmentById(R.id.navHostFragment) as NavHostFragment
//        navController = navHostFragment.navController
//
//        setupActionBarWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.navHostFragment).navigateUp() || super.onSupportNavigateUp()
    }

//    override fun onStart() {
//        super.onStart()
//        val navController:NavController = findNavController(R.id.navHostFragment)
//    }

}