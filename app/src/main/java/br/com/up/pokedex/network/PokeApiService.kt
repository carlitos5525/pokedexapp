package br.com.up.pokedex.network

import retrofit2.http.GET

interface PokeApiService {

    @GET("pokemon?limit=151")
    fun getPokemons()


}