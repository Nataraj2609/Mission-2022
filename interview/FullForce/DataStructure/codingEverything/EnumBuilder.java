package Interview.FullForce.DataStructure.codingEverything;

public class EnumBuilder {
  public static void main(String[] args) {
    System.out.println(String.format("playlist with id '%s' not found", "Vikram Title Track"));
    System.out.println(Response_status_error_code.Record_already_exists_conflict.getCode());
  }

  enum Response_status_error_code {
    Record_not_found(404),
    Record_already_exists_conflict(409);

    public int getCode() {
      return code;
    }

    public void setCode(int code) {
      this.code = code;
    }

    private int code;

    Response_status_error_code(int code) {
      this.code = code;
    }
  }
}
