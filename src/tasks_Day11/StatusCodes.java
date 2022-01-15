package tasks_Day11;

public class StatusCodes {
    public static void main(String[] args) {
        int statusCode=401;
        String output="";

        switch (statusCode){
            case 200:
                output="Ok";
                break;
            case 201:
                output="created";
                break;
            case 202:
                output="accepted";
                break;
            case 301:
                output="moved permanently";
                break;
            case 303:
                output="see other";
                break;
            case 304:
                output="not modified";
                break;
            case 307:
                output="temporary redirect";
                break;
            case 400:
                output="Bad Request";
                break;
            case 401:
                output="unauthorized";
                break;
            case 403:
                output="forbidden";
                break;
            case 404:
                output="not found";
                break;
            case 410:
                output="gone";
                break;
            case 500:
                output="I S Error";
                break;
            case 503:
                output="service unavailable";
                break;
            default:
                output="invalid code";


        }
        System.out.println(output);;

    }
}
/*
5. HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status code:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable
 */
