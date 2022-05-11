package rh.pramudito.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quran {
    private String id;
    @JsonProperty("revelation_place")
    private String revelationPlace;
    @JsonProperty("revelation_order")
    private int revelationOrder;
    @JsonProperty("bismillah_pre")
    private String bismillahPre;
    @JsonProperty("name_simple")
    private String nameSimple;
    @JsonProperty("name_arabic")
    private String nameArabic;
    @JsonProperty("verse_count")
    private int verseCount;

    public Quran() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRevelationPlace() {
        return revelationPlace;
    }

    public void setRevelationPlace(String revelationPlace) {
        this.revelationPlace = revelationPlace;
    }

    public int getRevelationOrder() {
        return revelationOrder;
    }

    public void setRevelationOrder(int revelationOrder) {
        this.revelationOrder = revelationOrder;
    }

    public String getBismillahPre() {
        return bismillahPre;
    }

    public void setBismillahPre(String bismillahPre) {
        this.bismillahPre = bismillahPre;
    }

    public String getNameSimple() {
        return nameSimple;
    }

    public void setNameSimple(String nameSimple) {
        this.nameSimple = nameSimple;
    }

    public String getNameArabic() {
        return nameArabic;
    }

    public void setNameArabic(String nameArabic) {
        this.nameArabic = nameArabic;
    }

    public int getVerseCount() {
        return verseCount;
    }

    public void setVerseCount(int verseCount) {
        this.verseCount = verseCount;
    }
}
