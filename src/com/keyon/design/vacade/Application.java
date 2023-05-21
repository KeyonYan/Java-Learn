package com.keyon.design.vacade;

public class Application {

    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        converter.convert("funny-cats-video.ogg", "mp4");
    }

}
