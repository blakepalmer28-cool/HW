public class Conditionals {
    public static void main(String[]args){
        new Conditionals();
    }

    public Conditionals(){
        String question = "Where you will be 40 years from now?";
        System.out.println(question);

        int randomInt = (int)(Math.random() *10);

        if (randomInt ==0) {
            System.out.println("Massachusetts");
        }else if (randomInt ==1){
            System.out.println("Alabama");
        }else if (randomInt ==2){
            System.out.println("Atlantis");
        }else if (randomInt ==3){
            System.out.println("In the year 2025");
        }else if (randomInt ==4){
            System.out.println("Dubai");
        }else if (randomInt ==5){
            System.out.println("Working like your collars blue and your neck is red");
        }else if (randomInt ==6){
            System.out.println("Somewhere nice in 67 degree weather");
        }else if (randomInt ==7){
            System.out.println("Italy");
        }else if (randomInt ==8){
            System.out.println("Japan");
        }else if (randomInt ==9){
            System.out.println("The sewer");
        }else if (randomInt ==10){
            System.out.println("somewhere in the year 2065");


        }
    }
}
