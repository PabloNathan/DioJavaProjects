public class User {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        smartTv.turnOn();
        smartTv.decreaseVolume();
        smartTv.setChannel(3);


        System.out.println("TV on? "+ smartTv.on);
        System.out.println("channel: " + smartTv.channel);
        System.out.println("volume: " + smartTv.volume);
    }
}