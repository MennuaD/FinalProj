public class PathC {
    private int length;
    private int boost1;
    private int boost2;
    private int boost3;
    private int trap1;

    public PathC(int length){
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
        boost3 = (int) (Math.random() * length + 1);
        while (boost3 == boost1 || boost3 == boost2 || boost3 == trap1){
            boost3 = (int) (Math.random() * length + 1);
        }
    }
    public String toString(){
        return ( "PathAC: " + length + " " + boost1 + " " + boost2 + " " + boost3 + " " + trap1);
    }

}
