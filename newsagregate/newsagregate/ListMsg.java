package com.example.newsagregate;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;


public class ListMsg {
    List<Msg> msgs = new ArrayList<>();

    public ListMsg() {
        msgs.add(new Msg("test1", "trrr"));
    }


    public List<Msg> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<Msg> msgs) {
        this.msgs = msgs;
    }
}
