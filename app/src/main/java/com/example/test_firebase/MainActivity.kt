package com.example.test_firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   // val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
//save to fire
        save.setOnClickListener {
            val name = PersonName.text.toString()
            val id = PersonID.text.toString()
            val age = PersonAge.text.toString()


            val person = hashMapOf(
                "name" to name,
                "id" to id,
                "age" to age
            )

            db.collection("Persons")
                .add(person)
                .addOnSuccessListener { documentReference ->
                    Toast.makeText(applicationContext,"${documentReference.id}",Toast.LENGTH_SHORT).show()

                }
                .addOnFailureListener { e ->
                    Toast.makeText(applicationContext,"$e",Toast.LENGTH_SHORT).show()


                }


        }

 */
    }
}