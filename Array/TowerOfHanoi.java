public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(4, 'A', 'C', 'B');
    }
    public static void towerOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        if(n == 1){
            System.out.println("Move disk 1 from peg " + fromPeg + " to Peg " + toPeg);
            return;
        }
        towerOfHanoi(n - 1, fromPeg, auxPeg, toPeg );

        System.out.println("Move disk from peg " + fromPeg + " to Peg " + toPeg);

        towerOfHanoi(n-1, auxPeg, toPeg, fromPeg);
    }
}

