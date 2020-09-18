public class Dubstep {
    public static String SongDecoder (String song) {
        return song.replace("WUB", " ").replaceAll("\\s+", " ").trim();
    }
}
