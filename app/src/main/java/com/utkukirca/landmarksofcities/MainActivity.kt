package com.utkukirca.landmarksofcities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.utkukirca.landmarksofcities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val colesseum = Landmark("Rome","Colesseum",R.drawable.colesseum)
        val duomo = Landmark("Milan","Duomo", R.drawable.duomo)
        val eiffel = Landmark("Paris","Eiffel Tower", R.drawable.eiffel)
        val angkorwat = Landmark("Cambodia", "Angkor Wat",R.drawable.angkorwat)
        val machupichu = Landmark("Machu Picchi","Machu Pichu", R.drawable.machupichu)
        val sagrada = Landmark("Barcelona","Sagrada Familia",R.drawable.sagrada)
        val tajmahal = Landmark("Angra","Taj Mahal",R.drawable.tajmahal)

        landmarkList.add(colesseum)
        landmarkList.add(duomo)
        landmarkList.add(eiffel)
        landmarkList.add(angkorwat)
        landmarkList.add(machupichu)
        landmarkList.add(sagrada)
        landmarkList.add(tajmahal)


        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { Landmark-> Landmark.cityname })

        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(MainActivity@this,LandMarksDetailPage::class.java)
            intent.putExtra("landmark", landmarkList.get(i))


            startActivity(intent)
        }

    }







}