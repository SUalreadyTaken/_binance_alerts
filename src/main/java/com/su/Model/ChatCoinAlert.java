package com.su.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coin_alerts")
public class ChatCoinAlert {
  
  @Id
  private String id;
  @Indexed(unique=true)
  private String chatId;
  private List<CoinAlert> coinAlertList;

  public ChatCoinAlert(String chatId, List<CoinAlert> coinAlertList) {
    this.chatId = chatId;
    this.coinAlertList = coinAlertList;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getChatId() {
    return this.chatId;
  }

  public void setChatId(String chatId) {
    this.chatId = chatId;
  }

  public List<CoinAlert> getCoinAlertList() {
    return this.coinAlertList;
  }

  public void setCoinAlertList(List<CoinAlert> coinAlertList) {
    this.coinAlertList = coinAlertList;
  }

}
