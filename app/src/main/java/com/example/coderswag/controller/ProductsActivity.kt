package com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.coderswag.R
import com.example.coderswag.utilities.EXTRA_PRODUCT

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val productType = intent.getStringExtra(EXTRA_PRODUCT)

        println(productType)
        Toast.makeText(this, "Product type: $productType", Toast.LENGTH_SHORT).show()

    }
}