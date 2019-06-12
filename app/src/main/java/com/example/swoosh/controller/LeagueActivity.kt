package com.example.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if(selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Select a league", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMensClicked(view: View) {
        toggleButtonWomens.isChecked = false
        toggleButtonCoEd.isChecked = false

        selectedLeague = "mens"
    }
    fun onWomensClicked(view: View) {
        toggleButtonCoEd.isChecked = false
        toggleButtonMens.isChecked = false

        selectedLeague = "womens"
    }
    fun onCoEdClicked(view: View) {
        toggleButtonMens.isChecked = false
        toggleButtonWomens.isChecked = false

        selectedLeague = "co-ed"
    }
}