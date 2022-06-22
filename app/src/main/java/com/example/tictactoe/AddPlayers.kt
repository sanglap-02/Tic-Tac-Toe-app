package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AddPlayers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_players)
        val playerOne:EditText =findViewById(R.id.playerOneName)
        val playerTwo:EditText =findViewById(R.id.playerTwoName)

        val startGameBtn:Button= findViewById(R.id.start_game_btn)

        startGameBtn.setOnClickListener {
             val getPlayerOneName:String=playerOne.text.toString()
             val getPlayerTwoName:String=playerTwo.text.toString()

            if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()){
                Toast.makeText(this,"invalid inputs. Please enter valid names",Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this,MainActivity::class.java);
                intent.putExtra("PlayerOneName", getPlayerOneName)
                intent.putExtra("PlayerTwoName", getPlayerTwoName)
                startActivity(intent);
            }
        }
    }
}