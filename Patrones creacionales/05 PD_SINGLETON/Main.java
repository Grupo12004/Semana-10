package PD_SINGLETON;

public class Main {
    public static void main(String [] args) {
        // Creando a los usuarios de la aplicación de música
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Indica la canción actual que estamos escuchando
        user1.playSong("La voz de los 80's");
        // El método devulve la canción actual
        user1.getCurrentSong();
        user2.getCurrentSong();

        System.out.println("---------------------------------------------------");
        // Indica la canción actual que estamos escuchando
        user2.playSong("América ven a mí");
        // El método devulve la canción actual
        user1.getCurrentSong();
        user2.getCurrentSong();
    }
}


