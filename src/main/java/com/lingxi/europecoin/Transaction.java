package com.lingxi.europecoin;

import lombok.Data;

import java.io.Serializable;

@Data
public class Transaction implements Serializable {
    private Member from;
    private Member recipient;
    private long amount;
}
