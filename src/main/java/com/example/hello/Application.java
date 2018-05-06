package com.example.hello;

import com.blade.Blade;

/**
 * Hello Blade!
 */
public class Application {

    public static void main(String[] args) throws Exception {
        Blade.me()
             .get("/", (req, res) -> res.text("Hello World!"))
             .start(Application.class, args);
    }

}