package com.planzy.planzyai;

public class AI_chatbot_model {
    boolean sent_by_ai, typing_animation_required;
    String body, character_name;

    public AI_chatbot_model(boolean sent_by_ai, String body, String character_name, boolean typing_animation_required) {
        this.sent_by_ai = sent_by_ai;
        this.body = body;
        this.character_name = character_name;
        this.typing_animation_required = typing_animation_required;
    }

    public boolean isTyping_animation_required() {
        return typing_animation_required;
    }

    public void setTyping_animation_required(boolean typing_animation_required) {
        this.typing_animation_required = typing_animation_required;
    }

    public boolean isSent_by_ai() {
        return sent_by_ai;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    public void setSent_by_ai(boolean sent_by_ai) {
        this.sent_by_ai = sent_by_ai;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
