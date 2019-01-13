public class Kangaroo {
    private int rooStart;
    private int rooSpotNow;
    private int rooSpeed;

    Kangaroo(int rooStart, int rooSpeed){
        this.rooStart = rooStart;
        this.rooSpeed = rooSpeed;
        this.rooSpotNow = rooStart;
    }

    public boolean willRoosMeet(Kangaroo rooTwo){
        if (this.rooStart == rooTwo.rooStart){
            return true;
        }

        Kangaroo backRoo = this.rooStart < rooTwo.rooStart ? this : rooTwo;
        Kangaroo frontRoo = this.rooStart < rooTwo.rooStart ? rooTwo : this;

        return jk(backRoo, frontRoo);
    }

    private boolean jk(Kangaroo backRoo, Kangaroo frontRoo) {
        if (backRoo.rooSpeed > frontRoo.rooSpeed) {
            while (backRoo.rooSpotNow < frontRoo.rooSpotNow) {
                backRoo.rooSpotNow += backRoo.rooSpeed;
                frontRoo.rooSpotNow += frontRoo.rooSpeed;

                if (backRoo.rooSpotNow == frontRoo.rooSpotNow) {
                    return true;
                }
            }
        }
        return false;
    }

}
