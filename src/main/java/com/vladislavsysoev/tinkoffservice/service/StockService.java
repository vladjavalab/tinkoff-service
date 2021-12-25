package com.vladislavsysoev.tinkoffservice.service;

import com.vladislavsysoev.tinkoffservice.model.Stock;
import dto.FigiesDto;
import dto.StockPricesDto;
import dto.StocksDto;
import dto.TickersDto;

public interface StockService {
    Stock getStockByTicker(String ticker);
    StocksDto getStockByTickers(TickersDto tickersDto);
    StockPricesDto getPrices(FigiesDto figiesDto);
}
