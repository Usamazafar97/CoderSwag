package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.model.Product

class ProductAdapter(val context: Context, val products: List<Product>): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindProduct(context, products[position])
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val productImage: ImageView = itemView.findViewById(R.id.productImage)
        private val productName: TextView = itemView.findViewById(R.id.productName)
        private val productPrice: TextView = itemView.findViewById(R.id.productPrice)

        fun bindProduct(context: Context, product: Product) {

            productImage.setImageResource(context.resources.getIdentifier(product.image,"drawable",context.packageName))
            productName.text = product.title
            productPrice.text = product.price

        }

    }
}