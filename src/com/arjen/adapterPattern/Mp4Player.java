package com.arjen.adapterPattern;

/**
 * Created by arjen on 27-6-2016.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {

        System.out.println("Playing mp4 file: " + filename);
    }
}
