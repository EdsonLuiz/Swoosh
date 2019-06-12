package com.example.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var leagueExtra = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        leagueExtra = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBegginerClicked(view: View) {
        ballerButton.isChecked = false
        skill = "begginer"
    }

    fun onBallerClicked(view: View) {
        begginerButton.isChecked = false
        skill = "baller"
    }

    fun onSkillFinishClicked(view: View) {
        if(skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, leagueExtra)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Select one skill",Toast.LENGTH_SHORT).show()
        }

    }
}
