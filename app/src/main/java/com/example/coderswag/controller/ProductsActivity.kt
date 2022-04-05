package com.example.coderswag.controller

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.ProductAdapter
import com.example.coderswag.services.DataService
import com.example.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*


class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val productType = intent.getStringExtra(EXTRA_PRODUCT)

        println(productType)
        Toast.makeText(this, "Product type: $productType", Toast.LENGTH_SHORT).show()

        //
        adapter = ProductAdapter(this, DataService.getProductList(productType))

        productsListView.adapter = adapter
        productsListView.layoutManager = GridLayoutManager(this, 2)


    }
}