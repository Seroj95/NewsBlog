package com.kotjava.newsblog.ui.db

import androidx.room.TypeConverter
import com.kotjava.newsblog.ui.models.Source

class Convertes {
    @TypeConverter
    fun fromSource(source: Source):String{
return source.name
    }
    @TypeConverter
    fun toSource(name:String): Source {
        return Source(name, name)
    }
}