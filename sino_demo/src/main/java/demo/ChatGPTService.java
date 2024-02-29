package demo;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ChatGPTService {
    private final WebClient webClient;

    public ChatGPTService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.openai.com/v1").build();
    }

    public Mono<String> askQuestion(String question) {
        // Implementiere hier den Code, um die Anfrage zu senden und die Antwort als Mono<String> zurückzugeben
        
        return null;
    }

}
