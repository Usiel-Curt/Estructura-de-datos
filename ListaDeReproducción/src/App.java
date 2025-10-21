public class App {
    public static void main(String[] args) throws Exception {
        SongList songList = new SongList();
        songList.addSong("Bugambilias", 150);
        songList.addSong("Eres", 120);
        songList.addSong("Tritella", 190);
        songList.addSong("Si pudiera", 256);

        songList.removeSong("Bugambilias");
        
        songList.printPlayList();
        songList.getTotalDuration();
    }
}
