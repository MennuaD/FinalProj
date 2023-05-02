public class PathD {
    private int length;
    private int boost1;
    private int trap1;
    private int trap2;
    private int trap3;
    private int trap4;
    private int powerUp1;
    public PathD(int length){
        this.length = length;
        boost1 = (int) (Math.random() * length + 1);
        trap1 = (int) (Math.random() * length + 1);
        while(trap1 == boost1){
            trap1 = (int) (Math.random() * length + 1);
        }
        trap2 = (int) (Math.random() * length + 1);
        while (trap2 == boost1 || trap2 == trap1){
            trap2 = (int) (Math.random() * length + 1);
        }
        trap3 = (int) (Math.random() * length + 1);
        while (trap3 == boost1 || trap3 == trap1 || trap3 == trap2){
            trap3 = (int) (Math.random() * length + 1);
        }
        trap4 = (int) (Math.random() * length + 1);
        while (trap4 == boost1 || trap4 == trap1 || trap4 == trap2 || trap4 == trap3){
            trap4 = (int) (Math.random() * length + 1);
        }
        powerUp1 = (int) (Math.random() * length + 1);
        while (powerUp1 == boost1 || powerUp1 == trap1 || powerUp1 == trap2 || powerUp1 == trap3 || powerUp1 == trap4){
            powerUp1 = (int) (Math.random() * length + 1);
        }
    }
    public String toString(){
        return ( "PathD: " + length + " " + boost1 + " " + trap1 + " " + trap2 + " " + trap3 + " " + trap4 + " " + powerUp1 );
    }

}
