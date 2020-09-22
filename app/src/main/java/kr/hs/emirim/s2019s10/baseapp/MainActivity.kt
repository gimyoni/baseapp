package kr.hs.emirim.s2019s10.baseapp
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var button1 : Button
    lateinit var check1 : CheckBox
    lateinit var check2 : CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.toastButtton)
        button1.setOnClickListener {
            Toast.makeText(this, "나 클릭되었어요", Toast.LENGTH_SHORT).show();
        }
        check1 = findViewById(R.id.checkBox1)
        check2 = findViewById(R.id.checkBox2)
        check1.setOnClickListener {
            val check = it as CheckBox
            Toast.makeText(this, "내가 좋아하는 것은 " + check.text, Toast.LENGTH_LONG).show()
        }
        check2.setOnClickListener {
            val check = it as CheckBox
            Toast.makeText(this, "내가 좋아하는 것은 " + check.text, Toast.LENGTH_LONG).show()
        }
    }
}