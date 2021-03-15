package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("sceazpIMsn6Kb1ftrTHdQPeD8MY1OIjhKoXJwDyi")
                .clientKey("r7M31w9BchrHBan8fke2QaUaYzIlUyj1P45XUS7I")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
