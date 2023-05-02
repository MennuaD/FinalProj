public class PathA {
    private int length;
    private int boost1;
    private int boost2;
    private int trap1;
    private int powerUp1;
    private int powerUp2;
    private int powerUp3;

    public PathA(int length){
        this.length = length;
        boost1 = (int) (Math.random() * length + 1);
        boost2 = (int) (Math.random() * length + 1);
        while(boost2 == boost1){
            boost2 = (int) (Math.random() * length + 1);
        }
        trap1 = (int) (Math.random() * length + 1);
        while (trap1 == boost1 || trap1 == boost2){
            trap1 = (int) (Math.random() * length + 1);
        }
        powerUp1 = (int) (Math.random() * length + 1);
        while (powerUp1 == boost1 || powerUp1 == boost2 || powerUp1 == trap1){
            powerUp1 = (int) (Math.random() * length + 1);
        }
        powerUp2 = (int) (Math.random() * length + 1);
        while (powerUp2 == boost1 || powerUp2 == boost2 || powerUp2 == trap1 || powerUp2 == powerUp1){
            powerUp2 = (int) (Math.random() * length + 1);
        }
        powerUp3 = (int) (Math.random() * length + 1);
        while (powerUp3 == boost1 || powerUp3 == boost2 || powerUp3 == trap1 || powerUp3 == powerUp1 || powerUp3 == powerUp2){
            powerUp3 = (int) (Math.random() * length + 1);
        }
    }

    public String toString(){
        return ( "PathA: " + length + " " + boost1 + " " + boost2 + " " + trap1 + " " + powerUp1 + " " + powerUp2 + " " + powerUp3);
    }


}
