package com.example.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_LEAGUE

class SkillActivity : AppCompatActivity() {

    var leagueExtra = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        leagueExtra = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBegginerClicked(view: View) {}
    fun onBallerClicked(view: View) {}
    fun onSkillFinishClicked(view: View) {}
}
