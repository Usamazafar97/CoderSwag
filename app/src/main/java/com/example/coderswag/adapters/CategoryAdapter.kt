package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.R
import com.example.coderswag.model.Category
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryAdapter(context: Context, categoryList: List<Category>) : BaseAdapter() {

    val context = context
    val categoryList = categoryList

    override fun getCount(): Int {

        // get the list size
        return categoryList.count()
    }

    override fun getItem(position: Int): Any {

        // get the item at the current position
        return categoryList[position]
    }

    override fun getItemId(position: Int): Long {

        // set the id to current item, but we set 0 (do not want to set)
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        // declaring our custom view
        val categoryView: View

        // inflate the whole view with our own resource file
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)

        // getting the image and text view in the resource file
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)

        // getting the current category item
        val category = categoryList[position]

        // converting the image name to resource id for setting the image
        val resourceId = context.resources.getIdentifier(category.image,"drawable", context.packageName)

        println(resourceId)

        // setting the image resource id
        categoryImage.setImageResource(resourceId)

        // setting the text
        categoryName.text = category.title

        // returning the view created
        return categoryView
    }
}