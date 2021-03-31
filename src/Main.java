public class Main {
    public static Movie[] getMovie() {
        return new Movie[] {
                new Movie("Начало", 2010, 11),
                new Movie("Веном 2", 2021, 5),
                new Movie("Кадры", 2013, 8),
        };
    }

    public static Theatre[] getTheatre() {
        return new Theatre[] {
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Шелкунчик", 2010, 11),
                new Theatre("Буратино", 2000, 20),
        };
    }

    public static void validEvent(Event event) {
        if (event.age == 0 || event.releaseYear == 0 || event.title == null) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        for (Event event : getMovie()) {
            validEvent(event);
        }
        for (Event event : getTheatre()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }
}
