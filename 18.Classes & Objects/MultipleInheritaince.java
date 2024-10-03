public class MultipleInheritaince {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.dirive();
        c1.playMusic();
        c1.startEngine();
    }
}

interface Engine {
    void startEngine();
}

interface MusicPlayer {
    void playMusic();
}

class Car implements Engine, MusicPlayer {
    // @Override
    public void startEngine() {
        System.out.println("Engine start");
    }

    // @Override //Without this code running properly but we used this for good
    // habbit in programming
    public void playMusic() {
        System.out.println("Music is going on");
    }

    public void dirive() {
        System.out.println("I know drive");
    }
}