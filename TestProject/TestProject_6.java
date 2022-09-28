
public class TestProject_6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Tv t = new Tv("yellow", 4, false);

        t.getChannel();
        System.out.println();

        String result = t.getColor();
        System.out.println(result);
    }

}

class Tv {
    private String color;
    private int channel, volume;
    private boolean power;

    Tv() {
    }

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

    public int getChannel() {
        return channel;
    }

    public String getColor() {
        String color;
        color = "blue";
        this.color = color;
        return this.color;
    }

}