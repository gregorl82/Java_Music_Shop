package accessories;

public enum StringNote {

    A("A"),
    C("C"),
    D("D"),
    E("E"),
    G("G");

    public String noteName;

    StringNote (String noteName) {
        this.noteName = noteName;
    }

    public String getNoteName() {
        return noteName;
    }
}
