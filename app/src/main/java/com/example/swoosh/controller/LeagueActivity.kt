package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        if(savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun leagueNextClicked(view: View) {
        if(player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Select a league", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMensClicked(view: View) {
        toggleButtonWomens.isChecked = false
        toggleButtonCoEd.isChecked = false

        player.league = "mens"
    }
    fun onWomensClicked(view: View) {
        toggleButtonCoEd.isChecked = false
        toggleButtonMens.isChecked = false

        player.league = "womens"
    }
    fun onCoEdClicked(view: View) {
        toggleButtonMens.isChecked = false
        toggleButtonWomens.isChecked = false

        player.league = "co-ed"
    }
}
