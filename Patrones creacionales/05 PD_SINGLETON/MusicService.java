package PD_SINGLETON;

public class MusicService {
    //  Instancia del singleton
    private static MusicService instance;
    private String currentSong;

    // Contructor privado para prevenir instancias fuera de la clase
    private MusicService() {
        currentSong = null;
    }

    // Metodo para obtener la instancia del singleton
    // un método static solo puede tener una intancia de MusicService
    public static MusicService getInstance() {
        if (instance == null) {
            instance = new MusicService();
        }
        return instance;
    }

    // Método para reproducir una canción
    public void playSong(String song) {
        currentSong = song;
        System.out.println("Estás escuchando: " + currentSong);
    }

    // Método para obtener la canción actual que se está reproduciendo
    public String getCurrentSong() {
        return currentSong;
    }
}


