package com.example.cits_project.ui.UlsanView

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class Traffic_Light_Markes {
    // Firebase Database 참조를 위한 변수

    private lateinit var database: DatabaseReference
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    fun fetchData() {
        // Firebase Database 참조 초기화
        database = Firebase.database.reference
        val dataRef = database.child("")

        // lttd의 값을 가져오기 위한 참조
        val lttdRef = dataRef.child("Location-info").child("base").child("header").child("totalCnt")

    }

}
