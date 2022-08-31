package com.su.Model;

public class Message {

  private String chatId;
  // private long chatId;
  private String text;

  public Message(String chatId, String text) {
    this.chatId = chatId;
    this.text = text;
  }

  public String getChatId() {
    return chatId;
  }

  public void setChatId(String chatId) {
    this.chatId = chatId;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
