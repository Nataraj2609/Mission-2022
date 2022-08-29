package study.Altimetrik;

public class ErrorResponseModel {
  public ErrorResponseModel(String errorName, String errorCode) {
    ErrorName = errorName;
    ErrorCode = errorCode;
  }

  String ErrorName;
  String ErrorCode;
}
