import java.util.Scanner;
public class UserSettings {
    
    private Scanner input;
    public Integer columnAmount = 0;
    public Integer rowAmount = 0;
    UserSettings(){
        input = new Scanner(System.in);
    }


    public void prompt(){
        boolean questionSuccess = false;
        while (!questionSuccess) {
            System.out.println(Questions.COLUMN_NUMBER);
            try{
                columnAmount = Integer.parseInt(input.nextLine());
                questionSuccess = true;
            }catch(Exception e){
                System.out.println(Error.INVALID_INPUT);
            }
        }
        questionSuccess = false;
        while (!questionSuccess) {
            System.out.println(Questions.ROW_NUMBER);
            try{
                rowAmount = Integer.parseInt(input.nextLine());
                questionSuccess = true;
            }catch(Exception e){
                System.out.println(Error.INVALID_INPUT);
            }
        }
    }

    public void printInputs(){
        System.out.println(Questions.COLUMN_NUMBER + " answer : "+columnAmount.toString());
        System.out.println(Questions.ROW_NUMBER + " answer : "+rowAmount.toString());
        input.nextLine();
    }
}
