
public class TestProject_6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Tv t = new Tv("black", 4, false);
    }

}

class Tv {
    String color;
    int channel, volume;
    boolean power;

    Tv(String c, int n, boolean p) {
        this.color = c;
        this.channel = n;
        this.power = p;
    }

    public void channelUp(int channel) {
        ++channel;
    }

    public void channelDown(int channel) {
        --channel;
    }

    public void power(boolean onoff) {
        power = !power;
    }

    public void volumeUp(int volume) {
        ++volume;
    }

    public void volumeDown(int volume) {
        --volume;
    }

}