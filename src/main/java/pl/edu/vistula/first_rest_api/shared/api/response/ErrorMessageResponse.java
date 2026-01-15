package pl.edu.vistula.first_rest_api.shared.api.response;

public class ErrorMessageResponse {

    private final  String message;


    public ErrorMessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
