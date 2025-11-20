public class MadLib {

        public static void main(String[] args) {
            MadLib myStory = new MadLib();
        } // main method

        public MadLib() {
            // Variable definitions
            String classmate = "Aidan";
            String city = "Chicago";
            String noun = "deodorant";
            String pluralNoun = "bags";
            double decimalBiggerThan1 = 67.67;
            String adjective = "sunny";
            int number1 = 100;
            String pluralAnimal = "Black Panthers";
            String miltonTeacher = "Mr. Furst";
            boolean trueOrFalse = true;
            int wholeNumberBetween1And4 = 2;
            String season = "spring";
            String miltonDean = "Ms.Latham";
            int number2 = 2;
            char letterGrade = 'A';
            String classmate2 = "Michael";
            String you = "I";


            //Story
            String story = "This weekend I am going camping with "
                    +classmate+ ". We are going to a campsite in "
                    +city+ ". I packed my "+noun+ " and "
                    +pluralNoun + ".  The forecast is calling for a high of "
                    +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                    +adjective+" day! This year, the park rangers have seen "
                    +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                    +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                    +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                    +miltonDean+ " said it actually has only happened "
                    + number2+" times. Wish us luck! If we survive, we will earn a "
                    +letterGrade+ "- in P.E. class. "
                    +classmate2+" said we are not surviving!!! "
                    +you+" said have some faith, we got this. ";

//now print story to the dos window
            System.out.println(story);

        } // constructor method


}
