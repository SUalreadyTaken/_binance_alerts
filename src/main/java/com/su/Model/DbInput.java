package com.su.Model;

import java.util.List;
import java.util.Map;

import com.su.Enum.CoinSymbol;
import com.su.Enum.DBCommand;

public class DbInput {
  private DBCommand dbCommand;
  private CoinSymbol symbol;
  private List<PriceInfo> priceInfoList;
  private Map<String, List<Float>> alertsHit;
  private String chatId;


  public DbInput(DBCommand dbCommand, CoinSymbol symbol, Map<String, List<Float>> alertsHit) {
    this.dbCommand = dbCommand;
    this.symbol = symbol;
    this.alertsHit = alertsHit;
  }
  
  public DbInput(DBCommand dbCommand, List<PriceInfo> priceInfoList, CoinSymbol symbol, String chatId) {
    this.dbCommand = dbCommand;
    this.symbol = symbol;
    this.priceInfoList = priceInfoList;
    this.chatId = chatId;
  }

  public String getChatId() {
    return this.chatId;
  }

  public List<PriceInfo> getPriceInfoList() {
    return this.priceInfoList;
  }

  public DBCommand getDbCommand() {
    return this.dbCommand;
  }

  public CoinSymbol getSymbol() {
    return this.symbol;
  }

  public Map<String,List<Float>> getAlertsHit() {
    return this.alertsHit;
  }
  
}
