package com.keyon.design.vacade;

public class VideoConverter {

    void convert(String filename, String format) {
//        CompressionCodec sourceCodec = new CodecFactory.extract(filename);
        if (format == "mp4") {
//            destinationCodec = new MPEG4CompressionCodec()
            System.out.println("VideoConverter: converting to mp4");
        } else if (format == "ogg") {
//            destinationCodec = new OggCompressionCodec()
            System.out.println("VideoConverter: converting to ogg");
        }
    }

}
