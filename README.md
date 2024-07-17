# Flappy Bird in Kotlin

This project is a simple implementation of the Flappy Bird game using Kotlin and Android's SurfaceView for custom drawing and game loop management.

## Features

- **Simple Graphics**: Custom drawing of bird and pipes.
- **Collision Detection**: Detects when the bird hits a pipe.
- **Scoring System**: Increments score when the bird successfully passes through pipes.
- **Timer**: Tracks the elapsed time of the game.
- **Sound Effects**: Includes flapping and collision sounds.
- **Game Over Screen**: Displays score, time, and a restart button upon game over.

## Getting Started

### Prerequisites

- Android Studio 4.0 or higher
- Kotlin 1.3 or higher
- Android SDK 29 or higher

### Installing

1. Clone the repository:
    ```bash
    git clone https://github.com/dentistkiller/FloppyBird.git
    ```

2. Open the project in Android Studio.

3. Sync the project with Gradle files.

4. Add the sound files (`flap.wav` and `collision.wav`) to `res/raw`.

5. Run the project on an emulator or physical device.

### Project Structure

- **MainActivity.kt**: Launches the game.
- **GameView.kt**: Handles the game loop, drawing, and updates.
- **GameThread.kt**: Manages the game loop thread.
- **Bird.kt**: Represents the bird and its behavior.
- **Pipe.kt**: Represents the pipes and their behavior.
- **HomeScreenActivity.kt**: Displays the game over screen with score, time, and restart button.
