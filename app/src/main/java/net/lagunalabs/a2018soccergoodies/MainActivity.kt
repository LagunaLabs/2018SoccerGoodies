package net.lagunalabs.a2018soccergoodies

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Console

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Debug 1\nDebug 1\nDebug 1")

        val gridview: GridView = this.findViewById(R.id.gridview)

        gridview.adapter = ImageAdapter(this) // this =?= self


        gridview.onItemClickListener =
                AdapterView.OnItemClickListener { parent, v, position, id ->
                    print("Debug 2.a")
                    Toast.makeText(this, "$position", Toast.LENGTH_SHORT).show()
                    print("Debug 2.b")
                }


    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */


//    companion object {
//
//        // Used to load the 'native-lib' library on application startup.
//        init {
//            System.loadLibrary("native-lib")
//        }
//    }
}
