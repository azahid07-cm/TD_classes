package TD_classes;
import java . util .*;

public class Exercice8 {
    public static class Playlist{
        private String name;
        private List <String> tracks;
        public Playlist(String name){
            this.name=name;
            this.tracks = new ArrayList<>();
        }
        public void addTrack(String track){
            tracks.add(track);
        }
        public int size(){
            return tracks.size();
        }
        public List<String> getTracks(){
            return List.copyOf(tracks);
        }
    }
    public static void main(String args[]){
        Playlist P=new Playlist("Abatera");
        P.addTrack("7elmetado 5");
        P.addTrack("7elmetado 3");
        P.addTrack("7elmetado 2");
        System.out.println("Nbr de morceaux: "+P.size());
        System.out.println("Tracks: "+P.getTracks());
    }
}
