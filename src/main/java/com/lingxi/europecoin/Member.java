package com.lingxi.europecoin;

import lombok.Data;

import java.io.Serializable;

@Data
public class Member implements Serializable {
    private String account;
    private long coin;
}
