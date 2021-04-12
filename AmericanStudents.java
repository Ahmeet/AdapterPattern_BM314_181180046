/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class AmericanStudents implements Students{

    private String language;

    public AmericanStudents() {
        this.language = "English";
    }
    @Override
    public  String openSubtitles() {
        System.out.println("American Students can open " + language + " subtitles");
        return language;
    }
}
