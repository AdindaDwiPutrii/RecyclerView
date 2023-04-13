package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(R.drawable.ironman,
                nameSuperhero = "Iron Man",
                descSuperhero = "lorem ipsum lorem ipsum lorem ipsum"
            ),
            Superhero(R.drawable.captainamerica,
                nameSuperhero = "Captain America",
                descSuperhero = "lorem ipsum lorem ipsum lorem ipsum"
            ),
            Superhero(R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "lorem ipsum lorem ipsum lorem ipsum"
            ),
            Superhero(R.drawable.antman,
                nameSuperhero = "Ant Man",
                descSuperhero = "lorem ipsum lorem ipsum lorem ipsum"
            ),
            Superhero(R.drawable.captainmarvel,
                nameSuperhero = "Captain Marvel",
                descSuperhero = "lorem ipsum lorem ipsum lorem ipsum"
            ),
            Superhero(R.drawable.spiderman,
                nameSuperhero = "Spiderman",
                descSuperhero = "lorem ipsum lorem ipsum lorem ipsum"
            ),
            Superhero(R.drawable.thor,
                nameSuperhero = "Thor",
                descSuperhero = "lorem ipsum lorem ipsum lorem ipsum"
            ),
            Superhero(R.drawable.doktorstrange,
                nameSuperhero = "Doctor Strange",
                descSuperhero = "lorem ipsum lorem ipsum lorem ipsum"
            ),
            Superhero(R.drawable.blackpanther,
                nameSuperhero = "Black Panther",
                descSuperhero = "lorem ipsum lorem ipsum lorem ipsum"
            ),
            Superhero(R.drawable.blackwidow,
                nameSuperhero = "Black Widow",
                descSuperhero = "lorem ipsum lorem ipsum lorem ipsum"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this,  DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}