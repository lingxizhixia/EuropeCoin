package com.lingxi.europecoin;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class PeerProperty {

    private List<Peer> peers;

    @Data
    public class Peer {
        String id;
        String name;
        String rootUrl;
    }
}
