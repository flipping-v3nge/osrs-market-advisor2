package com.yourname.marketadvisor;

class PricePoint
{
    int itemId;
    String name;
    long timestamp;
    int price;
    long volume;
}

class Signal
{
    String itemName;
    int itemId;
    String type;
    int price;
    double baseline;
    String reason;
}
