package com.arjen.adapterPattern;



/**
 * Created by arjen on 27-6-2016.
 */
public class AdapterPatternDemo {

    public void testAdapterPattern(){

        AudioPlayer audioPlayer = new AudioPlayer();

        System.out.println("\nAdapter pattern: ");

        audioPlayer.play("mp3", "TestSongMp3");
        audioPlayer.play("mp4", "TestSongMp4");
        audioPlayer.play("vlc", "TestSongVlc");
        audioPlayer.play("avi", "TestSongAvi");

    }
}
