package com.tiv.react.agent;

/**
 * 模型配置
 */
public class ModelConfig {

    /**
     * 模型API KEY 从本地环境变量中读取
     */
    public static final String API_KEY = System.getenv("DASHSCOPE_API_KEY");

    /**
     * 模型API URL
     */
    public static final String BASE_URL = "https://dashscope.aliyuncs.com/compatible-mode/v1";

    /**
     * 模型名称
     */
    public static final String LLM_NAME = "qwen3-max";

}
