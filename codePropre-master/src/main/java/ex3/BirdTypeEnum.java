package ex3;
public enum BirdTypeEnum  {
    Eagle, Sparrow, Pigeon;

    public String move() {
        switch (this) {
        case Eagle:
            return Eagle.toString() + " fly";
        case Pigeon:
            return Pigeon.toString() + " fly";
        case Sparrow:
            return Sparrow.toString() + " fly";
        default:
            return this.toString() + " fly";
        }
        
        
        
    }

    public String getVoice() {
        switch (this) {
        case Eagle:
            return Eagle.toString() + " gives voice";
        case Pigeon:
            return Pigeon.toString() + " gives voice";
        case Sparrow:
            return Sparrow.toString() + " gives voice";
        default:
            return this.toString() + " gives voice";
        }
    }
}