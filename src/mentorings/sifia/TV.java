package mentorings.sifia;

public class TV {

    private int channel;

    public TV(int channel) {
        this.channel = channel;
    }

    public int getChannel(){
        return channel;
    }

    public int setChannel(int channel) {
        if(channel > 0 && channel <=50) this.channel = channel;
        else this.channel = 1;
        return this.channel;
    }


}
