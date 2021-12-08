package com.alphacoder.designpattern;

public class FishingBoatAdapter implements RowingBoat{
    private FishingBoat fishingBoat= new FishingBoat();
    @Override
    public void row() {
        this.fishingBoat.sail();
    }
}
