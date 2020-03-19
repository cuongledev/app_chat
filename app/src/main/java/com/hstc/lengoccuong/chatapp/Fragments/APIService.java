package com.hstc.lengoccuong.chatapp.Fragments;

import com.hstc.lengoccuong.chatapp.Notifications.MyResponse;
import com.hstc.lengoccuong.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-type: application/json",
                    "Authorization:key=AAAACoxGrro:APA91bFrUey8pDm0laSK7LxETxvw5UKbdCe6t3XNQJ7orwZaRvE_EURinEcDsa-gFMgt-lSkUfz0De68beAAb8wEqRJ4LD6kb6vPIIsndvI63vAYt-ea60IurcHUI8Gp-3qlsjbSTapF"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
