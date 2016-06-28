package com.arjen.adapterPattern;

/**
 * Created by arjen on 27-6-2016.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file:" + filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
