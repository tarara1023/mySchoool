package sessions.methods;

public class ReturnCalculator {

    public static void main(String[] args) {
        ReturnCalculator myCalculator = new ReturnCalculator();
        //42
        int result = myCalculator.addTwoNum(30,12);//returning a result which is int
        //60
        int result1 = myCalculator.addTwoNum(40,20);
        System.out.println(result);
        System.out.println(result1);

        int finalResult = myCalculator.addTwoNum(result, result1);
        System.out.println(finalResult);

        int taxToBePaidForUnmarried = myCalculator.calculateTax(10000, false);
        System.out.println(taxToBePaidForUnmarried);

        char grade = myCalculator.getGrade(80.8);
        System.out.println(grade);



    }

    //please write a function (method) (not main method but my own) which will
    //add two numbers
    public void sum (int num1, int num2) {
        System.out.println(num1 + num2);
    }

    //int is a return type.
    //return type means -> result of the function
    //return type -> data type of the result of the method.
    public int addTwoNum (int num1, int num2) {
        return num1 + num2;// -> num1 + num2 =>
        // signals the give this result. Or this is the result of the function
    }

    //execute (run) the logic and return result.
    //add num1 to num2
    //return type of method doesnt affect the params

    public int calculateTax (int salary, boolean isMarried) {
        int tax = 0;
        if (isMarried) {
            tax = salary * 5 / 100;
        } else {
            tax = salary * 30 / 100;

        }
        return tax;
    }
    //write a method which will give(returns) me exam grade based on the exam score
    public char getGrade (double examScore) {
        char grade;
        if (examScore > 60 && examScore < 70) {
            grade = 'D';
        }else if (examScore >= 70 && examScore <80) {
            grade = 'C';
        }else if (examScore >= 80 && examScore <90) {
            grade = 'B';
        }else if (examScore >= 90 && examScore <100) {
            grade = 'A';
        }else {
                grade = '0';
            }
           return grade;
    }

}

