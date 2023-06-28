package aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }
    public CompactDisc(){
        super();
    }
    public CompactDisc(String artist){
        this();
        this.artist = artist;
    }

    public void addTrack(Track track){
        for(Track i : tracks){
            if(i.equals(track)){
                System.out.println("This track is already in the Disc");
                return;
            }
        }
        tracks.add(track);
    }
    public void removeTrack(Track track){
        for(Track i: tracks){
            if(i.equals(track)){
                tracks.remove(i);
                return;
            }
        }
        System.out.println("This track is not in the Disc");
    }

    public int getLength(){
        int sum=0;
        for(Track i : tracks){
            sum += i.getLength();
        }
        return sum;
    }

    @Override
    public void play() {
        System.out.println("This is the track of artist " + this.artist);
        for(Track i : tracks){
            i.play();
        }
    }
}
