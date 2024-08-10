package prueba.API.de.numeros;


import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

//Para que funcione agregar la dependencia correspodiente
public class ConsultaChatGPT {
    public static String obtenerTraduccion(String texto) {
        //Genera la APIKEY en OPEN IA
        OpenAiService service = new OpenAiService("TU-APIKEY-OPENIA");


        CompletionRequest requisicion = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduce a español el siguiente texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();


        var respuesta = service.createCompletion(requisicion);
        return respuesta.getChoices().get(0).getText();
    }
}
