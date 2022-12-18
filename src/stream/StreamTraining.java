package stream;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

class Trader {
    private final String name;
    private final String city;

    public Trader(String nmae, String city) {
        this.name = nmae;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader : " + this.name + " in " + this.city;
    }
}

class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" + this.trader + ", " + "year : " + this.year + ", " + "value : " + this.value + "}";
    }
}

public class StreamTraining {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List <Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        System.out.println("1. 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정렬하시오");
        System.out.println(
                transactions.stream()
                        .filter(transaction -> transaction.getYear() == 2011)
                        .sorted(comparing(Transaction::getValue))
                        .collect(toList())
        );

        System.out.println("2. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오");
        System.out.println(
               transactions.stream()
                       .map(transaction -> transaction.getTrader().getCity())
                       .distinct()
                       .sorted(reverseOrder())
                       .collect(toList())
        );

        System.out.println("3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오");
        System.out.println(
                transactions.stream()
                        .map(Transaction::getTrader)
                        .distinct()
                        .filter(trader -> trader.getCity().equals("Cambridge"))
                        .sorted(comparing(Trader::getName))
                        .collect(toList())
        );

        System.out.println("4. 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하시오");
        System.out.println(
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (x,y) -> x + y)
//                        .collect(toList())
        );
    }
}
