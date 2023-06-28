package aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    private String director;
    private int length;
    private static int nbDigitalVideoDisc = 0;

    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }

    public DigitalVideoDisc(String title) {
        nbDigitalVideoDisc++;
//        this.id = nbDigitalVideoDisc;
        setId(nbDigitalVideoDisc);
//        this.title = title;
        setTitle(title);

    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
//        this.category = category;
//        this.cost = cost;
        setCategory(category);
        setCost(cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, cost);
        this.director = director;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, cost);
        this.length = length;
    }
    //@Override
    public String toString(){
        System.out.println(getId() + ". DVD - " + getTitle() + " - " + getCategory() + " - "
                + director + " - " + length + ": " + getCost()) ;
        return null;
    }
    public boolean isMatch(String title){
        String[] k1 = title.split(" ", -1);
        String[] k2 = getTitle().split(" ", -1);
//        for(int i=0; i<k2.length; i++){
//            for(int j=0; j<k1.length; j++){
//                if(k1[j].equalsIgnoreCase(k2[i])) return true;
//            }
//        }

        for(String a : k2){
            for(String b: k1){
                if(a.equalsIgnoreCase(b)) return true;
            }
        }
        return false;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
