package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class OrchestratorService {

    @Autowired
    private ChatGPTService chatGPTService;

    @Autowired
    private DeepLService deepLService;

    public Mono<String> processQuestionAndTranslate(String question, String targetLanguage) {
        return chatGPTService.askQuestion(question)
                .flatMap(response -> deepLService.translateText(response, targetLanguage));
        // Hier wird zuerst die Frage an ChatGPT gesendet und die Antwort dann an DeepL zur Übersetzung gegeben.
    }
}
