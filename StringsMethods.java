public class StringsMethods {
    public static void main(String[] args) {
        String name = "  Katsu  ";
        System.out.println(name);
        // boolean result = name.equals("Katsu");
        // int result = name.length();
        // char result = name.charAt(0);
        // int result = name.indexOf("a");
        // int result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();
        String result = name.replace('a', 'o');
        System.out.println(result);

    }
}
