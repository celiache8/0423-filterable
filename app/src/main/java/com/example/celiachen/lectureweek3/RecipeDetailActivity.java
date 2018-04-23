package com.example.celiachen.lectureweek3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by celiachen on 2/7/18.
 */

public class RecipeDetailActivity extends AppCompatActivity{

    private WebView mWebView;

    // override onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        // title
        // instruction url
        // get recipe data from main activity

        String title = this.getIntent().getExtras().getString("title");
        String url = this.getIntent().getExtras().getString("url");

        // set the title on the action bar
        setTitle(title);

        // create the webview and load the url
        mWebView = findViewById(R.id.detail_web_view);
        mWebView.loadUrl(url);

    }
}
