/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class BlindAmericanStudents implements StudentsWhoAreBlind{
    private String speechLanguage;

    public BlindAmericanStudents() {
        speechLanguage = "English";
    }

    @Override
    public String subtitlesToSpeech() {
        System.out.println("Blind American Student can listen in " + speechLanguage);
        return speechLanguage;
    }
}
