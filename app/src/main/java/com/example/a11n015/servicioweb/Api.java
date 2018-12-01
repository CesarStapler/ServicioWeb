package com.example.a11n015.servicioweb;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface Api {

    String BASE_URL = "https://swapi.co/";
    @GET("people")

    Call<List<Actores>> getActores();





}
