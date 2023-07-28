package PD_SINGLETON;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void playSong(String song) {
        // Llamamos a la clase estática y hacemos uso del Singleton
        MusicService.getInstance().playSong(song);
    }

    public void getCurrentSong() {
        System.out.println(name + " está escuchando: " + MusicService.getInstance().getCurrentSong());
    }
}


