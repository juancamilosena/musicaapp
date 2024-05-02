package com.example.musica.data

import com.example.musica.model.Album

class DataSource {
    fun getAlbmes(): MutableList<Album>{
        var  albumes:MutableList<Album> = mutableListOf()
        albumes.add(Album("caver","2024","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkpxv7Cc8-DBzVhEZl9m8IkpNM2ByCWL6PhCIdxUNT_Q&s"))

       /* albumes.add(Album("caver","2024","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkpxv7Cc8-DBzVhEZl9m8IkpNM2ByCWL6PhCIdxUNT_Q&s"))
        albumes.add(Album("caver","2024","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkpxv7Cc8-DBzVhEZl9m8IkpNM2ByCWL6PhCIdxUNT_Q&s"))
        albumes.add(Album("caver","2024","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkpxv7Cc8-DBzVhEZl9m8IkpNM2ByCWL6PhCIdxUNT_Q&s"))
        albumes.add(Album("caver","2024","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkpxv7Cc8-DBzVhEZl9m8IkpNM2ByCWL6PhCIdxUNT_Q&s"))
        albumes.add(Album("caver","2024","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkpxv7Cc8-DBzVhEZl9m8IkpNM2ByCWL6PhCIdxUNT_Q&s"))*/
        return albumes
    }
}