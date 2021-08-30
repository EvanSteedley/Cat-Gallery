package com.example.cat_gallery.data

import com.example.cat_gallery.R
import com.example.cat_gallery.model.Cat

class Datasource {
fun loadCats(): List<Cat> {
    return listOf<Cat>(
        Cat(R.drawable.cat1),
        Cat(R.drawable.cat2),
        Cat(R.drawable.cat3),
        Cat(R.drawable.cat4),
        Cat(R.drawable.cat5),
        Cat(R.drawable.cat6),
        Cat(R.drawable.cat7),
        Cat(R.drawable.cat8),
        Cat(R.drawable.cat9),
        Cat(R.drawable.cat10)
    )
}
}