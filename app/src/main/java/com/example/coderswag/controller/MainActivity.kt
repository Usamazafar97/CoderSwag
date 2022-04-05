package com.example.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.CategoryRecyclerAdapter
import com.example.coderswag.services.DataService
import com.example.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // making our custom adapter
        adapter = CategoryRecyclerAdapter(this, DataService.categories){ category ->

            // calling the new activity and send the data
            val productIntent = Intent(this, ProductsActivity::class.java)

            // sending the title
            productIntent.putExtra(EXTRA_PRODUCT, category.title)

            // starting new activity
            startActivity(productIntent)

        }

        // setting the adapter
        categoryListView.adapter = adapter

        // setting the layout to linear
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager

        // set the size dynamic
        categoryListView.setHasFixedSize(true)


        // listview item click listener
        /*

        catagoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]

            Toast.makeText(this,"${category.title}",Toast.LENGTH_SHORT).show()
        }

        */


    }
}