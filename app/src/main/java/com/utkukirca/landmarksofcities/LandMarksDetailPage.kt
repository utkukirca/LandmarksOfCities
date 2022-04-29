package com.utkukirca.landmarksofcities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.utkukirca.landmarksofcities.databinding.ActivityLandMarksDetailPageBinding

class LandMarksDetailPage : AppCompatActivity() {


    private lateinit var binding: ActivityLandMarksDetailPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandMarksDetailPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent = intent
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        binding.cityName.text = selectedLandmark.cityname
        binding.imageView.setImageResource(selectedLandmark.image)
        binding.landmarkName.text = selectedLandmark.landmarkName

    }
}