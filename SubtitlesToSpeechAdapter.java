/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class SubtitlesToSpeechAdapter implements Students{
    private StudentsWhoAreBlind studentsWhoAreBlind;

    public SubtitlesToSpeechAdapter(StudentsWhoAreBlind studentsWhoAreBlind) {
        this.studentsWhoAreBlind = studentsWhoAreBlind;
    }

    @Override
    public String openSubtitles() {
        return studentsWhoAreBlind.subtitlesToSpeech();
    }
}
