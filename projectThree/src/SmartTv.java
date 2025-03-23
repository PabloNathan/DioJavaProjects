public class SmartTv{
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void decreaseVolume(){
        volume -= 1;
    }

    public void increaseVolume(){
        volume += 1;
    }

    public void downChannel(){
        channel -= 1;
    }

    public void upChannel(){
        channel += 1;
    }

    public void setChannel(int newChannel){
        channel = newChannel;
    }
}