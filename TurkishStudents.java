/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class TurkishStudents implements Students {

    private String language;

    public TurkishStudents() {
        this.language = "Turkish";
    }
    @Override
    public  String openSubtitles() {
        System.out.println("Turkish Students can open " + language + " subtitles");
        return language;
    }
}
