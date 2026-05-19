public class Student {
    private String studentName;
    private int studentAge;
    private int studentMarks;


    public static void displayStudentInfo(){

    }
    public static int calculateGrade(int Grade){

        if (Grade>= 80){
            System.out.println("A");

        }
        else if (Grade >= 70 && Grade <= 79){
            System.out.println("B");
        }
        else if(Grade >= 60 && Grade <= 69){
            System.out.println("c");
        }
        else if(Grade>= 50 && Grade <= 59){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
        return(Grade);
    }
    public static boolean  isPassed(int Grade){
        if (Grade>= 50){
            return true;
        }
        else{
            return false;

        }



    }
    public static void schoolMotto(){
        System.out.println("Education for Everyone");
    }

    //public static String compareMarks(){
        //return
    }

}
