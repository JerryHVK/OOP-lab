package aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }

    public Track(){}

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(!(o instanceof Track)){
            return false;
        }

        Track track = (Track) o;

        if(!this.title.equalsIgnoreCase(track.getTitle())){
            return false;
        }
        if(!(this.length == track.getLength())){
            return false;
        }
        return true;
    }
}
