package com.tavisca.workshops.pratham.rover;

public interface Direction {
    public Vector move(Vector v);
    public Vector turnLeft(Vector v);
    public Vector turnRight(Vector v);
}

class North implements Direction{
    @Override
    public Vector move(Vector v){
        return new Vector(v.x, v.y+1, v.direction);
    }
    public Vector turnLeft(Vector v){
        return new Vector(v.x, v.y, new West());
    }
    public Vector turnRight(Vector v){
        return new Vector(v.x, v.y, new East());
    }
}

class South implements Direction{
    @Override
    public Vector move(Vector v){
        return new Vector(v.x, v.y-1, v.direction);
    }
    public Vector turnLeft(Vector v){
        return new Vector(v.x, v.y, new East());
    }
    public Vector turnRight(Vector v){
        return new Vector(v.x, v.y, new West());
    }
}

class East implements Direction{
    @Override
    public Vector move(Vector v){
        return new Vector(v.x+1,v.y, v.direction);
    }
    public Vector turnLeft(Vector v){
        return new Vector(v.x, v.y, new North());
    }
    public Vector turnRight(Vector v){
        return new Vector(v.x, v.y, new South());
    }
}

class West implements Direction{
    @Override
    public Vector move(Vector v){
        return new Vector(v.x-1,v.y, v.direction);
    }
    public Vector turnLeft(Vector v){
        return new Vector(v.x, v.y, new South());
    }
    public Vector turnRight(Vector v){
        return new Vector(v.x, v.y, new North());
    }
}
