public class PathE {
    private int length;

    private int trap1;
    private int trap2;
    private int trap3;



    public PathE(int length){
        this.length = length;
        trap1 = (int) (Math.random() * length + 1);
        trap2 = (int) (Math.random() * length + 1);
        while(trap2 == trap1){
            trap2 = (int) (Math.random() * length + 1);
        }
        trap3 = (int) (Math.random() * length + 1);
        while (trap3 == trap1 || trap3 == trap2){
            trap1 = (int) (Math.random() * length + 1);
        }

    }
    public String toString(){
        return ( "PathE: " + length + " " + trap1 + " " + trap2 + " " + trap3 + " " );
    }

}
