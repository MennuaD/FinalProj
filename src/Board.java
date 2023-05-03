public class Board {
        private PathA pathA;
        private PathB pathB;
        private PathC pathC;
        private PathD pathD;
        private PathE pathE;


        public Board(int a, int b, int c, int d, int e){
                this.pathA = new PathA(a);
                this.pathB = new PathB(b);
                this.pathC = new PathC(c);
                this.pathD = new PathD(d);
                this.pathE = new PathE(e);
        }

        public String toString(){
                return (this.pathA + "\n" + this.pathB + "\n" + this.pathC + "\n" + this.pathD + "\n" + this.pathE);
        }

}
