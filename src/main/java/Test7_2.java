import java.nio.channels.Channel;

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;
    private int time;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    // 코드시작

    public void setChannel(int channel) { // 현재 채널을 저장하고 입력한 채널로 변경함
        if(channel < MIN_CHANNEL || channel > MAX_CHANNEL) {return;}
        prevChannel = this.channel; // 이전 채널 값에 현재 채널 값를 저장
        this.channel = channel; // 입력받은 채널로 변경한다.
    }
    public void setVolume(int volume) {
        if(volume < MIN_VOLUME || volume > MAX_VOLUME) {return;}
        this.volume = volume;
    }
    public int getChannel() {
        return channel;
    }
    public int getVolume() {
        return volume;
    }

    public void gotoPrevChannel (){ //현재 채널을 저장하고 이전 채널로 변경함
        setChannel(prevChannel); //
    }

}

public class Test7_2 {

    public static void main(String[] args) {
        MyTv t  = new MyTv();

        t.setChannel(10);
        System.out.println("ch:" + t.getChannel());
        t.setChannel(20);
        System.out.println("ch:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("ch:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("ch:" + t.getChannel());



    }

}
