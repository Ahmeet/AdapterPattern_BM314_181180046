/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class Main {

    public static void main(String[] args) {
	 Lesson lesson = new Lesson();

	 AmericanStudents americanStudents = new AmericanStudents();
	 TurkishStudents turkishStudents = new TurkishStudents();

	 BlindAmericanStudents blindAmericanStudents = new BlindAmericanStudents();
	 BlindTurkishStudents blindTurkishStudents = new BlindTurkishStudents();
	 lesson.lecture(americanStudents);
	 lesson.lecture(turkishStudents);

	 SubtitlesToSpeechAdapter subtitlesToSpeechAdapter = new SubtitlesToSpeechAdapter(blindAmericanStudents);

	 lesson.lecture(subtitlesToSpeechAdapter);
    }
}
