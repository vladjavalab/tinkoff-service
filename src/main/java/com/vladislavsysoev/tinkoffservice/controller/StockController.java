package com.vladislavsysoev.tinkoffservice.controller;

import com.vladislavsysoev.tinkoffservice.model.Stock;
import com.vladislavsysoev.tinkoffservice.service.StockService;
import dto.FigiesDto;
import dto.StockPricesDto;
import dto.StocksDto;
import dto.TickersDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StockController {
    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(@PathVariable String ticker) {
        return stockService.getStockByTicker(ticker);
    }

    @PostMapping("/stocks/getStocksByTickers")
    public StocksDto getStocksByTickers(@RequestBody TickersDto tickersDto) {
        return stockService.getStockByTickers(tickersDto);
    }

    @PostMapping("/prices/")
    public StockPricesDto getPrices(@RequestBody FigiesDto figiesDto) {
        return stockService.getPrices(figiesDto);
    }
}
