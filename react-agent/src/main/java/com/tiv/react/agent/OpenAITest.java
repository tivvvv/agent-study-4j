package com.tiv.react.agent;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatCompletion;
import com.openai.models.ChatCompletionCreateParams;

public class OpenAITest {

    public static void main(String[] args) {
        OpenAIClient openAIClient = OpenAIOkHttpClient.builder()
                .apiKey(ModelConfig.API_KEY)
                .baseUrl(ModelConfig.BASE_URL)
                .build();

        String promptString = "你是谁?";

        ChatCompletionCreateParams params = ChatCompletionCreateParams.builder()
                .addUserMessage(promptString)
                .model(ModelConfig.LLM_NAME)
                .build();

        ChatCompletion chatCompletion = openAIClient.chat().completions().create(params);
        String rawLlmOutput = chatCompletion.choices().get(0).message().content().get();

        System.out.println(rawLlmOutput);
    }

}
