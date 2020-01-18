package com.example.ahabdelhak.mvvm_newsapp.data;

import com.example.ahabdelhak.mvvm_newsapp.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsClient {
    private static final String BaseURL = "http://jsonplaceholder.typicode.com/";
    private PostsInterface postInterface ;
    private static PostsClient INSTANCE ;

    public PostsClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
            postInterface=retrofit.create(PostsInterface.class);
    }

    public static PostsClient getINSTANCE() {
        if (null == INSTANCE) {
            INSTANCE = new PostsClient();
        }
        return INSTANCE;
    }

    public Call<List<PostModel>> getPosts(){
        return postInterface.getPosts();
    }

}
