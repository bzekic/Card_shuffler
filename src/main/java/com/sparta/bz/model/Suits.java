package com.sparta.bz.model;

public enum Suits {
    HEARTS{
        public String getSymbol()
        {
            return "Heart symbol";
        }
    },
    DIAMONDS{
        public String getSymbol()
        {
            return "Diamond symbol";
        }
    },
    CLUBS{
        public String getSymbol()
        {
            return "Club symbol";
        }
    },
    SPADES{
        public String getSymbol()
        {
            return "Spade symbol";
        }
    };
    public abstract String getSymbol();
}

