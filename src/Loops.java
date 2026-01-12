public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();

    }//main method

    public Loops() {
        countUp();
        countByThrees();
        countDown();
        nestedLoop();
        //call counting methods in here
    }//constructor method
    //define counting methods down here

    public void countUp() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
    public void countByThrees() {
        for (int i =3; i<=12; i= i+3) {
            System.out.println(i);
        }
    }
    public void countDown() {
        for (int i =10; i>=1; i= i-1) {
            System.out.println(i);
        }
        System.out.println("Happy Loop Year!");

    }
    //outer loop
    public void nestedLoop() {
        for (int i =1; i<= 5; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

}