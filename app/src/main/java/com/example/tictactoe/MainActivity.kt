package com.example.tictactoe

import android.content.ContentValues.TAG
import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AlertDialog
import javax.net.ssl.SSLEngineResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val player1Name: String? =intent.getStringExtra("PlayerOneName")
        val player2Name: String? =intent.getStringExtra("PlayerTwoName")

        val player1_lenearlayout:LinearLayout=findViewById(R.id.player1LL)
        val player2_lenearlayout:LinearLayout=findViewById(R.id.player2LL)

        val restartBtn:Button=findViewById(R.id.restartButton)

        val player1Textbox:TextView=findViewById(R.id.playerOneTextview)
        val player2Textbox:TextView=findViewById(R.id.playerTwoTextview)

        player1Textbox.text=player1Name
        player2Textbox.text=player2Name

        restartBtn.setOnClickListener {
            finish();
            startActivity(getIntent());
        }

        val box1:ImageView=findViewById(R.id.img1)
        val box2:ImageView=findViewById(R.id.img2)
        val box3:ImageView=findViewById(R.id.img3)
        val box4:ImageView=findViewById(R.id.img4)
        val box5:ImageView=findViewById(R.id.img5)
        val box6:ImageView=findViewById(R.id.img6)
        val box7:ImageView=findViewById(R.id.img7)
        val box8:ImageView=findViewById(R.id.img8)
        val box9:ImageView=findViewById(R.id.img9)

        player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)

        var playerTurn:Int=1
        var board=Array(3){Array(3){0} }
//        val board=Array(3){i->Array(3){j->false} }
        var moves=1
        var game_Status=0
        Log.i(TAG,"hello")
        val Str:String="game status "+game_Status+" moves "+moves

        box1.setOnClickListener {

            if (isClickable(board,0,0)){
                if (playerTurn==1){

                    box1.setImageResource(R.drawable.cross)
                    board[0][0]=1
                    playerTurn=2
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)

                }else{
                    box1.setImageResource(R.drawable.circle)
                    board[0][0]=2
                    playerTurn=1
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)
                }

                gameStatus(board,moves,player1Name,player2Name)

                moves++
            }else{
                Toast.makeText(this,"Please make a valid move",Toast.LENGTH_LONG).show()
            }
        }


        box2.setOnClickListener {
            if (isClickable(board,0,1)){
                if (playerTurn==1){
                    box2.setImageResource(R.drawable.cross)
                    board[0][1]=1
                    playerTurn=2
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)

                }else{
                    box2.setImageResource(R.drawable.circle)
                    board[0][1]=2
                    playerTurn=1
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)
                }
                gameStatus(board,moves,player1Name,player2Name)

                moves++
            }else{
                Toast.makeText(this,"Please make a valid move",Toast.LENGTH_LONG).show()
            }
        }

        box3.setOnClickListener {
            if (isClickable(board,0,2)){
                if (playerTurn==1){
                    box3.setImageResource(R.drawable.cross)
                    board[0][2]=1
                    playerTurn=2
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)

                }else{
                    box3.setImageResource(R.drawable.circle)
                    board[0][2]=2
                    playerTurn=1
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)
                }
                gameStatus(board,moves,player1Name,player2Name)

                moves++
            }else{
                Toast.makeText(this,"Please make a valid move",Toast.LENGTH_LONG).show()
            }
        }

        box4.setOnClickListener {
            if (isClickable(board,1,0)){
                if (playerTurn==1){
                    box4.setImageResource(R.drawable.cross)
                    board[1][0]=1
                    playerTurn=2
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)

                }else{
                    box4.setImageResource(R.drawable.circle)
                    board[1][0]=2
                    playerTurn=1
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)
                }
                gameStatus(board,moves,player1Name,player2Name)

                moves++
            }else{
                Toast.makeText(this,"Please make a valid move",Toast.LENGTH_LONG).show()
            }
        }

        box5.setOnClickListener {
            if (isClickable(board,1,1)){
                if (playerTurn==1){
                    box5.setImageResource(R.drawable.cross)
                    board[1][1]=1
                    playerTurn=2
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)

                }else{
                    box5.setImageResource(R.drawable.circle)
                    board[1][1]=2
                    playerTurn=1
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)
                }
                gameStatus(board,moves,player1Name,player2Name)

                moves++
            }else{
                Toast.makeText(this,"Please make a valid move",Toast.LENGTH_LONG).show()
            }
        }

        box6.setOnClickListener {
            if (isClickable(board,1,2)){
                if (playerTurn==1){
                    box6.setImageResource(R.drawable.cross)
                    board[1][2]=1
                    playerTurn=2
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)

                }else{
                    box6.setImageResource(R.drawable.circle)
                    board[1][2]=2
                    playerTurn=1
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)
                }
                gameStatus(board,moves,player1Name,player2Name)

                moves++
            }else{
                Toast.makeText(this,"Please make a valid move",Toast.LENGTH_LONG).show()
            }
        }

        box7.setOnClickListener {
            if (isClickable(board,2,0)){
                if (playerTurn==1){
                    box7.setImageResource(R.drawable.cross)
                    board[2][0]=1
                    playerTurn=2
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)

                }else{
                    box7.setImageResource(R.drawable.circle)
                    board[2][0]=2
                    playerTurn=1
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)
                }
                gameStatus(board,moves,player1Name,player2Name)

                moves++
            }else{
                Toast.makeText(this,"Please make a valid move",Toast.LENGTH_LONG).show()
            }
        }

        box8.setOnClickListener {
            if (isClickable(board,2,1)){
                if (playerTurn==1){
                    box8.setImageResource(R.drawable.cross)
                    board[2][1]=1
                    playerTurn=2
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)

                }else{
                    box8.setImageResource(R.drawable.circle)
                    board[2][1]=2
                    playerTurn=1
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)
                }
                gameStatus(board,moves,player1Name,player2Name)

                moves++
            }else{
                Toast.makeText(this,"Please make a valid move",Toast.LENGTH_LONG).show()
            }
        }

        box9.setOnClickListener {
            if (isClickable(board,2,2)){
                if (playerTurn==1){
                    box9.setImageResource(R.drawable.cross)
                    board[2][2]=1
                    playerTurn=2
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)

                }else{
                    box9.setImageResource(R.drawable.circle)
                    board[2][2]=2
                    playerTurn=1
                    player1_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_dark_blue)
                    player2_lenearlayout.setBackgroundResource(R.drawable.rounded_corner_darkblue_withoutborder)
                }
                gameStatus(board,moves,player1Name,player2Name)

                moves++
            }else{
                Toast.makeText(this,"Please make a valid move",Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun gameStatus(board: Array<Array<Int>>, moves: Int,player1Name:String?,player2Name:String?):Unit{
        if (moves==9){
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Match Draw")
            builder.setMessage("Do you want to try again ?")
//builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

            builder.setPositiveButton("yes") {dialog, which ->
                finish();
                startActivity(getIntent());
            }

            builder.setNegativeButton(android.R.string.no) { dialog, which ->
                val intent = Intent(this,AddPlayers::class.java);
                startActivity(intent);
            }
            builder.show()
        }
        var check:Int=0
        if (board[0][0]==board[0][1] && board[0][1]==board[0][2] && board[0][0]!=0){
            check= board[0][0]
        }
        if (board[1][0]==board[1][1] && board[1][1]==board[1][2] && board[1][0]!=0){
            check= board[1][0]
        }
        if (board[2][0]==board[2][1] && board[2][1]==board[2][2] && board[2][0]!=0){
            check= board[2][0]
        }
        if (board[0][0]==board[1][0] && board[1][0]==board[2][0] && board[0][0]!=0){
            check= board[0][0]
        }
        if (board[0][1]==board[1][1] && board[1][1]==board[2][1] && board[0][1]!=0){
            check= board[0][1]
        }
        if (board[0][2]==board[1][2] && board[1][2]==board[2][2] && board[0][2]!=0){
            check= board[0][2]
        }
        if (board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[0][0]!=0){
            check= board[0][0]
        }
        if (board[0][2]==board[1][1] && board[1][1]==board[2][0] && board[0][2]!=0){
            check= board[0][2]
        }

        if (check==1){
            val builder = AlertDialog.Builder(this)
            builder.setTitle("${player1Name} wins !!!")
            builder.setMessage("Do you want to try again ?")
//builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

            builder.setPositiveButton("yes") {dialog, which ->
                finish();
                startActivity(getIntent());
            }

            builder.setNegativeButton(android.R.string.no) { dialog, which ->
                val intent = Intent(this,AddPlayers::class.java);
                startActivity(intent);
            }
            builder.show()
        }else if(check==2){
            val builder = AlertDialog.Builder(this)
            builder.setTitle("${player2Name} wins !!")
            builder.setMessage("${player2Name} wins !!!")
//builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

            builder.setPositiveButton("yes") {dialog, which ->
                finish();
                startActivity(getIntent());
            }

            builder.setNegativeButton(android.R.string.no) { dialog, which ->
                val intent = Intent(this,AddPlayers::class.java);
                startActivity(intent);
            }
            builder.show()
        }


    }

    private fun isClickable(board: Array<Array<Int>>, a: Int, b: Int):Boolean {
        return board[a][b]==0
    }



}