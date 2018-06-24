package net.lagunalabs.a2018soccergoodies

import android.R.attr.radius
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.R.attr.src
import android.content.res.Resources
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.support.v4.graphics.drawable.RoundedBitmapDrawable



// references to our images
private val mThumbIds = arrayOf<Int>(R.drawable.icon1,R.drawable.icon1,R.drawable.icon1,R.drawable.icon1,R.drawable.icon1)

class ImageAdapter(private val mContext: Context) : BaseAdapter() {


    override fun getCount(): Int = mThumbIds.size

    override fun getItem(position: Int): Any? = null

    override fun getItemId(position: Int): Long = 0L

    // create a new ImageView for each item referenced by the Adapter
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        println("Debug 1\nDebug 1\nDebug 1Getview")

        val imageView: ImageView


        if (convertView == null) {
            // if it's not recycled, initialize some attributes

            imageView = ImageView(mContext)

            imageView.layoutParams = ViewGroup.LayoutParams(parent.width / 2,  parent.height / 2)
           // imageView.maxWidth = parent.width / 2
           // imageView.maxHeight = parent.height / 2
            //imageView.imageMatrix.mapRadius(8F) //8F is of type Float

            imageView.adjustViewBounds = true


            imageView.scaleType = ImageView.ScaleType.CENTER_CROP

          // imageView.setPadding(0, 0, 0, 0)

        } else {

            imageView = convertView as ImageView
        }


        imageView.setImageResource(mThumbIds[position])

        return imageView
    }

}


