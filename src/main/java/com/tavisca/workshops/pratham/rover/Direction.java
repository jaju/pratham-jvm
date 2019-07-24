package com.tavisca.workshops.pratham.rover;

class TwoDVector {
    public final int x;
    public final int y;
    public TwoDVector(int x, int y){
        this.x = x;
        this.y = y;
    }
}


public interface Direction {
    public TwoDVector move(TwoDVector v);
}

class North implements Direction{
    @Override
    public TwoDVector move(TwoDVector v){
        return new TwoDVector(v.x, v.y+1);
    }
}

class South implements Direction{
    @Override
    public TwoDVector move(TwoDVector v){
        return new TwoDVector(v.x, v.y-1);
    }
}

class East implements Direction{
    @Override
    public TwoDVector move(TwoDVector v){
        return new TwoDVector(v.x+1,v.y);
    }
}

class West implements Direction{
    @Override
    public TwoDVector move(TwoDVector v){
        return new TwoDVector(v.x-1,v.y);
    }
}
