package com.lingxi.europecoin;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 区块
 */
@Data
public class Block implements Serializable {

    private long index;

    private long timestamp;

    private List<Transaction> transactions;

    private long pow;

    private String sign;

    private String preSign;
}
