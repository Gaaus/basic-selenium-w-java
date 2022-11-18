package lab_06;

public class lab_06_04 {
    public static void main(String[] args) {
        /*
        * String url = "https://google.com";
        * check http OR https; domain name; .com OR .net
        * ===============================================
        *
        * if url.contains("https"):
        *   " url has https"
        * else if (url.contains("http"):
        *   "url has http"
        * else "wrong url, missing http/https"
        *
        * url.subString((url.indexOf("//")) + 2,url.length()).sout
        *
        * url.subString((url.indexOf("."), url.length())
        * */

        String url = "https://google.com";

        if (url.substring(0,5).equals("https") && url.substring(5,6).equals(":")) {
            System.out.println("1./ ---> url has https");
        } else if (url.substring(0,4).equals("http") && url.substring(4,5).equals(":")) {
            System.out.println("1./ ---> url has http");
        } else System.out.println("1./ ---> Wrong url OR missing http/https");

        System.out.println("3./ Domain name: ---> " + url.substring((url.indexOf("//") + 2), url.length()));

        System.out.println("3./ .com or .net: ---> " +url.substring((url.indexOf(".")), url.length()));

    }
}
