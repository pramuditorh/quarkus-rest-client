package rh.pramudito.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Chapters {
    public List<Quran> getChapters() {
        return chapters;
    }

    public void setChapters(List<Quran> chapters) {
        this.chapters = chapters;
    }

    @JsonProperty
    private List<Quran> chapters; // Array List jadi bisa pakai method List
    // private String[] chapter; // Array primitif
    public Chapters() {
    }
    public Chapters(List<Quran> chapters) {
        this.chapters = chapters;
    }

    public static class Quran {
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

        @JsonProperty("translated_name")
        private TranslatedName translatedName;


        public Quran() {
        }

        public Quran(String id, String revelationPlace, int revelationOrder, String bismillahPre, String nameSimple, String nameArabic, int verseCount) {
            this.id = id;
            this.revelationPlace = revelationPlace;
            this.revelationOrder = revelationOrder;
            this.bismillahPre = bismillahPre;
            this.nameSimple = nameSimple;
            this.nameArabic = nameArabic;
            this.verseCount = verseCount;
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

        public TranslatedName getTranslatedName() {
            return translatedName;
        }

        public void setTranslatedName(TranslatedName translatedName) {
            this.translatedName = translatedName;
        }

        public static class TranslatedName {
            @JsonProperty("language_name")
            private String languageName;
            @JsonProperty
            private String name;

            public TranslatedName() {
            }

            public TranslatedName(String languageName, String name) {
                this.languageName = languageName;
                this.name = name;
            }

            public String getLanguageName() {
                return languageName;
            }

            public void setLanguageName(String languageName) {
                this.languageName = languageName;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
