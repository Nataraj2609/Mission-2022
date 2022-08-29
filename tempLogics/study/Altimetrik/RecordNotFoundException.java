package study.Altimetrik;

public class RecordNotFoundException extends RuntimeException{

  RecordNotFoundException(String errorName){
    super(errorName);
  }
}
