package com.movie_application.constants

object Constants {
    //for retrofit be sure that at the end of URL there is / character, otherwise url "must end in /" exception is taken
    var baseUrl: String = "https://run.mocky.io/v3/c46122d9-9a2d-4712-aa57-e5f2949998f5/"
    //var baseUrlForImage: String = "https://ctis.bilkent.edu.tr/ctis487/"


    const val TABLE_NAME = "MOVIES"
    const val DATABASE_NAME = "MOVIES_DB"
}