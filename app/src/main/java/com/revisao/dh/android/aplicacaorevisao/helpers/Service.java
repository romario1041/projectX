package com.revisao.dh.android.aplicacaorevisao.helpers;

import com.revisao.dh.android.aplicacaorevisao.model.Game;



import retrofit2.http.GET;
import retrofit2.Call;

public interface Service {

    @GET("/games")
    Call<Game> getGame();
}
