package animals;

public class Competition {

    public static void main(String[] args) {
        Course course = new Course();
        Tiger[] competitors = {new Tiger("Tom", 1500, 6, 600), new Tiger("Tim", 800, 3, 400), new Tiger("Bob", 2000, 9, 700), new Tiger("Bill", 3000, 2, 750)};
        Team team = new Team("DreamTeam", competitors);
        Obstacle[] obstacles = {new Cross(1000), new Pool(500), new Wall(5)};

        System.out.println("Название команды: " + team.getName());

        System.out.println("Приветствие участников: ");
        team.showResults();

        System.out.println("Команда проходит полосу препятствий: ");
        course.doIt(team);

        System.out.println("Результаты команды: ");
        team.showResults();
    }
}