public class Cube {
    private int side;

    public Cube(){
        side = 1;
    }

    public Cube(int n){
        this.side=n;
        if(n<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }

    public int getSide(){
        return side;
    }

    public void setSide(int n){
        this.side = n;
        if(n<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }

    public int getSurfaceArea(){
        return side*side*6;
    }

    public int getVolume(){
        return side*side*side;
    }


}
