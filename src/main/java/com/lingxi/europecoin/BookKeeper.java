package com.lingxi.europecoin;

import java.util.List;

/**
 * 记账员
 */
public class BookKeeper {
    private PeerProperty peerProperty;
    private List<Block> blocks;
    private List<Transaction> transactions;
    private Integer semaphore = new Integer(0);

    /**
     * 开始记账
     *
     * @return 1 启动成功;0 启动失败
     */
    public int start() {
        synchronized (semaphore) {
            if (semaphore == 1) {
                return semaphore;
            }
            try {
                startMine();
            } catch (Exception e) {

            }
            semaphore = 1;
        }
        return semaphore;
    }

    /**
     * 停止记账
     *
     * @return 1 停止成功;0 停止失败
     */
    public int stop() {
        synchronized (semaphore) {
            if (semaphore == 0) {
                return semaphore;
            }
            try {
                stopMine();
            } catch (Exception e) {

            }
            semaphore = 0;
        }
        return semaphore;
    }

    /**
     * 交易
     *
     * @return
     */
    public long submitTransaction() {
        return 0L;
    }

    private void startMine() {

    }

    private void stopMine() {

    }

    private String signature(Block block) {
        return null;
    }

    private Block createBlock() {
        return new Block();
    }


}
