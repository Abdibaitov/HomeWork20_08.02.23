public enum DayOfWeek {
    DYISHINBY("Теория сабагы"),
    SHEYSHEMBI("Практика сабагы"),
    SHARSHEMBI("Теория сабагы"),
    BEYSHEMBI("Практика сабагы"),
    JUMA("Теория сабагы"),
    ISHEMBI("Практика сабагы"),
    JEKSHEMBI("Дем алыш ");

    private String whatteach;

    DayOfWeek(String whatteach) {
        this.whatteach = whatteach;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "whatteach='" + whatteach + '\'' +
                '}';
    }
}
