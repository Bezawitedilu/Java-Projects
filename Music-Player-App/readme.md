# Music Player App

## Overview
This project is a basic implementation of a Music Player application using Object-Oriented Programming (OOP) principles in Java. The app allows users to manage and play music files stored on their system.

## Features
- **Add Songs**: Users can add songs to the music player by providing the file path.
- **Play**: Plays the currently selected song.
- **Pause**: Pauses the currently playing song.
- **Stop**: Stops the currently playing song and resets playback to the beginning.
- **Next**: Skips to the next song in the playlist.
- **Previous**: Skips to the previous song in the playlist.
- **Shuffle**: Shuffles the playlist to play songs randomly.
- **Repeat**: Repeats the currently playing song or the entire playlist.
- **Display Playlist**: Shows the list of songs in the playlist.

## Technologies Used
- **Java**: Core programming language used for development.
- **Object-Oriented Programming (OOP)**: Principles of encapsulation, inheritance, and polymorphism were employed for designing the Music Player application.

## Methodology
The project follows an Object-Oriented approach to design the Music Player app:
1. **Class Design**: Creation of classes such as Song, Playlist, and MusicPlayer to model the various components of the application.
2. **Encapsulation**: Use of encapsulation to hide the internal implementation details of classes and expose only necessary functionalities.
3. **Inheritance**: Utilization of inheritance to create specialized classes and reuse code.
4. **Polymorphism**: Implementation of polymorphic behavior for handling different types of songs and playlists.
5. **Testing**: Extensive testing to ensure the correctness and robustness of the application.

## Usage
To use the Music Player app, follow these steps:
1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Compile and run the project.
4. Follow the on-screen instructions to add songs to the playlist and control playback.

## Class Structure
- **Song**: Represents a single music file with properties such as title, artist, duration, and file path.
- **Playlist**: Represents a collection of songs with methods for adding, removing, and manipulating songs.
- **MusicPlayer**: Controls the playback of songs, manages the playlist, and provides methods for controlling playback.

## Example Code
```java
// Create a new song
Song song = new Song("Title", "Artist", "path/to/song.mp3");

// Create a playlist
Playlist playlist = new Playlist();
playlist.addSong(song);

// Create a music player
MusicPlayer player = new MusicPlayer();
player.setPlaylist(playlist);
player.play();
```

## Contribution
Contributions to the Music Player app are welcome! If you find any bugs or have suggestions for improvements, please open an issue or submit a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
