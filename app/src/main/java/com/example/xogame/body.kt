package com.example.xogame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class body : AppCompatActivity() {
    var i :Int =0
    var counter:Int =0
    var a:Int=-11
    var b:Int=-12
    var c:Int=-13
    var d:Int=-14
    var e:Int=-15
    var f:Int=-16
    var g:Int=-17
    var h:Int=-18
    var j:Int=-19
    var o_count:Int=0
    var x_count:Int=0
    var winner:Int =-100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_body)
        var bt1 =findViewById<Button>(R.id.button)
        var bt2 =findViewById<Button>(R.id.button2)
        var bt3 =findViewById<Button>(R.id.button3)
        var bt4 =findViewById<Button>(R.id.button11)
        var bt5 =findViewById<Button>(R.id.button12)
        var bt6 =findViewById<Button>(R.id.button13)
        var bt7 =findViewById<Button>(R.id.button14)
        var bt8 =findViewById<Button>(R.id.button15)
        var bt9 =findViewById<Button>(R.id.button16)
        var bt10 =findViewById<Button>(R.id.button17)
        var txt1=findViewById<TextView>(R.id.txt)
        txt1.text="O player -> ${o_count} | x player -> ${x_count}"

        bt1.setOnClickListener {
            a=check(bt1)
            sheckwinner()
        }

        bt2.setOnClickListener {
            b=check(bt2)
            sheckwinner()
        }
        bt3.setOnClickListener {
            c=check(bt3)
            sheckwinner()
        }
        bt4.setOnClickListener {
            d=check(bt4)
            sheckwinner()
        }
        bt5.setOnClickListener {
            e=check(bt5)
            sheckwinner()
        }
        bt6.setOnClickListener {
            f=check(bt6)
            sheckwinner()
        }
        bt7.setOnClickListener {
           g= check(bt7)
            sheckwinner()
        }
        bt8.setOnClickListener {
            h=check(bt8)
            sheckwinner()
        }
        bt9.setOnClickListener {
           j= check(bt9)
            sheckwinner()
        }
        bt10.setOnClickListener {
            reset()
        }
    }
    fun check(b:Button ):Int{
        if (i==1){
            b.background = ContextCompat.getDrawable(this, R.drawable.ic_o)
            i--
            counter++
            b.isEnabled=false
            return 1
        }
        else {
            b.background = ContextCompat.getDrawable(this, R.drawable.ic_x)
            i++
            counter++
            b.isEnabled=false
            return 0
        }
    }
    fun sheckwinner(){

        //Rows
        if (a==1&&b==1&&c==1) winner = 1
        if (a==0&&b==0&&c==0) winner = 0

        if (d==1&&e==1&&f==1) winner = 1
        if (d==0&&e==0&&f==0) winner = 0

        if (g==1&&h==1&&j==1) winner = 1
        if (g==0&&h==0&&j==0) winner = 0


        //Columns
        if (a==1&&d==1&&g==1) winner = 1
        if (a==0&&d==0&&g==0) winner = 0


        if (b==1&&e==1&&h==1) winner = 1
        if (b==0&&e==0&&h==0) winner = 0

        if (c==1&&f==1&&j==1) winner = 1
        if (c==0&&f==0&&j==0) winner = 0


        //Diagonals
        if (a==1&&e==1&&j==1) winner = 1
        if (a==0&&e==0&&j==0) winner = 0

        if (c==1&&e==1&&g==1) winner = 1
        if (c==0&&e==0&&g==0) winner = 0

        if (winner==1){
            var txt1=findViewById<TextView>(R.id.txt)
            Toast.makeText(this, "O player is the winner", Toast.LENGTH_SHORT).show()
            o_count+=1
            txt1.text="O player -> ${o_count} | x player -> ${x_count}"
            Handler().postDelayed({reset()},600)
        }
        if (winner==0){
            var txt1=findViewById<TextView>(R.id.txt)
            Toast.makeText(this, "X player is the winner", Toast.LENGTH_SHORT).show()
            x_count+=1
            txt1.text="O player -> ${o_count} | x player -> ${x_count}"
            Handler().postDelayed({reset()},600)
        }
        if (counter==9&&winner!=0&&winner!=1){
            Handler().postDelayed({reset()},600)
            Toast.makeText(this, "there is no winner", Toast.LENGTH_SHORT).show()
        }
    }
    fun reset(){
        var bt1 =findViewById<Button>(R.id.button)
        var bt2 =findViewById<Button>(R.id.button2)
        var bt3 =findViewById<Button>(R.id.button3)
        var bt4 =findViewById<Button>(R.id.button11)
        var bt5 =findViewById<Button>(R.id.button12)
        var bt6 =findViewById<Button>(R.id.button13)
        var bt7 =findViewById<Button>(R.id.button14)
        var bt8 =findViewById<Button>(R.id.button15)
        var bt9 =findViewById<Button>(R.id.button16)
         a=-11
         b=-12
         c=-13
         d=-14
         e=-15
         f=-16
         g=-17
         h=-18
         j=-19
        winner=-1
        counter=0
        bt1.isEnabled=true
        bt1.background = ContextCompat.getDrawable(this, R.drawable.shape2)

        bt2.isEnabled=true
        bt2.background = ContextCompat.getDrawable(this, R.drawable.shape2)

        bt3.isEnabled=true
        bt3.background = ContextCompat.getDrawable(this, R.drawable.shape2)

        bt4.isEnabled=true
        bt4.background = ContextCompat.getDrawable(this, R.drawable.shape2)

        bt5.isEnabled=true
        bt5.background = ContextCompat.getDrawable(this, R.drawable.shape2)

        bt6.isEnabled=true
        bt6.background = ContextCompat.getDrawable(this, R.drawable.shape2)

        bt7.isEnabled=true
        bt7.background = ContextCompat.getDrawable(this, R.drawable.shape2)

        bt8.isEnabled=true
        bt8.background = ContextCompat.getDrawable(this, R.drawable.shape2)

        bt9.isEnabled=true
        bt9.background = ContextCompat.getDrawable(this, R.drawable.shape2)
    }

    }


