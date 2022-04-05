package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {

    val categories = listOf<Category>(
        Category("SHIRTS","shirtimage"),
        Category("HATS","hatimage"),
        Category("HOODIES","hoodieimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf<Product>(
        Product("Devslopes Graphic Beenie","$18","hat1"),
        Product("Devslopes Hat Black","$20","hat2"),
        Product("Devslopes Hat White","$18","hat3"),
        Product("Devslopes Hat Snapback","$22","hat4")
    )

    val hoodies = listOf<Product>(
        Product("Devslopes Hoodie Grey","$28","hoodie01"),
        Product("Devslopes Hoodie Red","$32","hoodie02"),
        Product("Devslopes Grey hoodie","$28","hoodie03"),
        Product("Devslopes Black hoodie","$32","hoodie04")
    )

    val shirts = listOf<Product>(
        Product("Devslopes Shirt Black","$18","shirt01"),
        Product("Devslopes Badge Light Grey","$20","shirt02"),
        Product("Devslopes Logo Shirt Red","$18","shirt03"),
        Product("Devslopes Hustle","$22","shirt04"),
        Product("Kichflip Studios","$20","shirt05")
    )
}