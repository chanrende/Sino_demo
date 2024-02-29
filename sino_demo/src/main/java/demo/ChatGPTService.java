package demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ChatGPTService {
    private final WebClient webClient;
    private String apiKey;

    public ChatGPTService(WebClient.Builder webClientBuilder, @Value("${chatgpt.api.key}") String apiKey) {
        this.apiKey = apiKey;
        this.webClient = webClientBuilder.baseUrl("https://api.openai.com/v1").build();
        System.out.println(apiKey);
    }

    public Mono<String> askQuestion(String question) {
        // Implementiere hier den Code, um die Anfrage zu senden und die Antwort als Mono<String> zurückzugeben
        
        return null;
    }

}
