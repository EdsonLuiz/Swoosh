package com.example.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        var skill = intent.getStringExtra(EXTRA_SKILL)

        textSearchLeagues.text = "Looking for a $league $skill league near you"
    }
}
