package com.example.f4.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.f4.R
import kotlinx.android.synthetic.main.activity_spoon.*

class SpoonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spoon)
        
        // 추천음식 검색 화면으로 이동

        searchSpoon.setOnClickListener {
            var spoon2_intent: Intent = Intent(this, Spoon2Activity::class.java)
            startActivity(spoon2_intent)
            overridePendingTransition(0, 0);
            finish()
        }
        
        // 하단 바

        Spoon_Calender.setOnClickListener {
            var spc_intent: Intent = Intent(this, CalenderActivity::class.java)
            startActivity(spc_intent)
            overridePendingTransition(0, 0);
            finish()

        }
        Spoon_Spoon.setOnClickListener {
            var spsp_intent: Intent = Intent(this, SpoonActivity::class.java)
            startActivity(spsp_intent)
            overridePendingTransition(0, 0);
            finish()

        }
        Spoon_Group.setOnClickListener {
            var spg_intent: Intent = Intent(this,GroupActivity::class.java)
            startActivity(spg_intent)
            overridePendingTransition(0, 0);
            finish()

        }
        Spoon_Setting.setOnClickListener {
            var sps_intent: Intent = Intent(this, SettingActivity::class.java)
            startActivity(sps_intent)
            overridePendingTransition(0, 0);
            finish()

        }
    }
}