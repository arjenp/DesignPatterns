package com.arjen.adapterPattern;

/**
 * Created by arjen on 27-6-2016.
 */
public class AudioPlayer implements Mediaplayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        switch (audioType){
            case "mp3":
                System.out.println("Playing mp3 file : " + fileName);
                break;

            case "vlc":
            case "mp4":
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType,fileName);
                break;

             default:
                System.out.println("Error. Not supported");
                break;
        }

    }
}
