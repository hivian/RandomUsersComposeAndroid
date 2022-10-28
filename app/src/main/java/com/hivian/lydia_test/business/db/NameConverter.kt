package com.hivian.lydia_test.business.db

import androidx.room.TypeConverter
import com.hivian.lydia_test.business.model.dto.Name
import com.hivian.lydia_test.core.fromJson
import com.hivian.lydia_test.core.toJson

class NameConverter {

    @TypeConverter
    fun nameToJson(value: Name): String {
        return value.toJson()
    }

    @TypeConverter
    fun jsonToName(value: String): Name {
        return value.fromJson()
    }
}
