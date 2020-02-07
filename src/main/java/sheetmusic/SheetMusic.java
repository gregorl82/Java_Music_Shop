package sheetmusic;

public class SheetMusic {

    private String title;
    private String composer;
    private String forInstrument;

    public SheetMusic(String title, String composer, String forInstrument) {
        this.title = title;
        this.composer = composer;
        this.forInstrument = forInstrument;
    }

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }

    public String getForInstrument() {
        return forInstrument;
    }
}
