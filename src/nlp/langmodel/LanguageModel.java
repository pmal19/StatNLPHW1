package nlp.langmodel;

import java.util.List;

/**
 * Language models assign probabilities to sentences and generate sentences.
 */
public interface LanguageModel {
	double getSentenceProbability(List<String> sentence);

	void setLambda(double lambda1);

	void setLambdas(double lambda1, double lambda2);

	List<String> generateSentence();
}
