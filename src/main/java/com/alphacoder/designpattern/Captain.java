package com.alphacoder.designpattern;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class Captain {
    private RowingBoat rowingBoat;

    public void row(){
        this.rowingBoat.row();
    }
}
