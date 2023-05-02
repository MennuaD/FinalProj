public class PathB {
    private int length;
    private int boost1;
    private int boost2;
    private int trap1;
    private int trap2;

    public PathB(int length){
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
        trap2 = (int) (Math.random() * length + 1);
        while (trap2 == boost1 || trap2 == boost2 || trap2 == trap1){
            trap2 = (int) (Math.random() * length + 1);
        }

    }
    public String toString(){
        return ( "PathB: " + length + " " + boost1 + " " + boost2 + " " + trap1 + " " + trap2);
    }

}
