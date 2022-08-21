public class TeamTest {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

//        Team Liverpool = new Team("Liverpool");

        Team<SoccerPlayer> Liverpool = new Team<>("Liverpool");

        //Team<String> brokenTeam = new Team<>("This won't work");

//        Liverpool.addPlayer(joe);
//        Liverpool.addPlayer(pat);
        Liverpool.addPlayer(beckham);

        System.out.println(Liverpool.numPlayer());

    }
}
