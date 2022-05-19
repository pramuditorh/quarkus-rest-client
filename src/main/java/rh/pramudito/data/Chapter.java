package rh.pramudito.data;

public class Chapter {

    private Chapters.Quran chapter;

    public Chapter(Chapters.Quran chapter) {
        this.chapter = chapter;
    }

    public Chapter() {
    }

    public Chapters.Quran getChapter() {
        return chapter;
    }

    public void setChapter(Chapters.Quran chapter) {
        this.chapter = chapter;
    }
}
