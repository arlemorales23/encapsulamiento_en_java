package encapsulation;

public class MainFutbol {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        soccerPlayer.setName("vergara");
        soccerPlayer.setGolesAnotados(6);
        soccerPlayer.setNumeroCamiseta(10);
        System.out.println(soccerPlayer.getName());
    }
}
