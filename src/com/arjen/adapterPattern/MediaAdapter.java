package com.arjen.adapterPattern;

/**
 * Created by arjen on 27-6-2016.
 */
public class MediaAdapter implements Mediaplayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){

        switch (audioType){
            case "vlc" :
                advancedMediaPlayer = new VlcPlayer();
                break;
            case "mp4" :
                advancedMediaPlayer = new Mp4Player();
                break;
            default:
                break;

        }
    }


    @Override
    public void play(String audioType, String fileName) {

        switch (audioType){
            case "vlc":
                advancedMediaPlayer.playVlc(fileName);
                break;
            case "mp4":
                advancedMediaPlayer.playMp4(fileName);
                break;
        }

    }
}
