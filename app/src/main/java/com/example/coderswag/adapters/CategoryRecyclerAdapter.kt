package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.model.Category

class CategoryRecyclerAdapter(private val context: Context, private val categoryList: List<Category>, val clickListener: (Category) -> Unit): RecyclerView.Adapter<CategoryRecyclerAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        // inflating the layout with our own view
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent,false)

        return ViewHolder(view, clickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // binding the views
        holder.bindCategory(categoryList[position], context)
    }

    override fun getItemCount(): Int {

        // returning the list size
        return categoryList.count()
    }


    inner class ViewHolder(itemView: View, clickListener: (Category) -> Unit) : RecyclerView.ViewHolder(itemView){

        // getting the image and text view in the resource file
        private val categoryImage: ImageView = itemView.findViewById(R.id.categoryImage)
        private val  categoryName: TextView = itemView.findViewById(R.id.categoryName)

        // binding with the specific category
        fun bindCategory(category: Category, context: Context){

            // converting the image to resource id
            categoryImage.setImageResource(context.resources.getIdentifier(category.image,"drawable",context.packageName))

            // setting the text
            categoryName.text = category.title

            // if item is clicked
            itemView.setOnClickListener {
                clickListener(category)
            }
        }
    }
}