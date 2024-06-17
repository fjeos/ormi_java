package Day9;

public class DailyQuiz {
    public static void main(String[] args) {
        try{
            Example example = new Example();
            example.throwException("My Custom Exception Message");
        } catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}

class Example{
    public void throwException(String message) throws CustomException {
        throw new CustomException(message);
    }
}

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
