package homeworks;

public class Browser {
    public static void main(String[] args) {

        String browser = "Iphone browser";

        switch (browser) {
            case "Edge":
                System.out.println("You've got the Edge!");
                break;
            case "Internet Explirer":
                System.out.println("Internet Explorer is not supported");
                break;
            case "Chrome":
            case "Firefox":
            case "Safari":
            case "Opera":
                System.out.println("Okay we support " + browser + " browser too");
                break;
            case "android browser":
            case "iphone browser":
                System.out.println("Mobile phones are not supported");
                break;
            default:
                System.out.println("We hope that this page looks ok!");

        }
    }
}
