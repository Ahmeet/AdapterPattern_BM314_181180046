/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class BlindTurkishStudents implements StudentsWhoAreBlind{
    private String speechLanguage;

    public BlindTurkishStudents() {
        speechLanguage = "Turkish";
    }

    @Override
    public String subtitlesToSpeech() {
        System.out.println("Blind Turkish Student can listen in " + speechLanguage);
        return speechLanguage;
    }
}
