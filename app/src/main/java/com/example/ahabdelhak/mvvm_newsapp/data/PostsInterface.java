package com.example.ahabdelhak.mvvm_newsapp.data;

import com.example.ahabdelhak.mvvm_newsapp.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostsInterface {
    @GET("posts")
    public Call<List<PostModel>> getPosts();
}
