public class Main {
    public static void main(String[] args) {

        String text = "Today is a beautiful day.";
        System.out.println(text);
        System.out.println("Character number:"+text.length()); //shows the length of the string
        System.out.println("5. character: "+ text.charAt(4)); // show the 5.character
        System.out.println(text.concat(" Isn't it?")); //concat text with another string
        System.out.println(text.startsWith("i"));//boolean
        System.out.println(text.endsWith("."));

        char[] chars = new char[5];
        text.getChars(0,5,chars,0);
        System.out.println(chars);

        System.out.println(text.indexOf('T')); // which index the character in

        String newText = text.replace(' ', '-');
        System.out.println(newText);

        System.out.println(text.substring(4,8));

        for(String word:text.split(" ")){
            System.out.println(word);
        }
    }
}