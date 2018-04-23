package les1;
//Дано текст из 3-х слов “word1 word2 word3”. 
//Поменять 1-е и 3-е слова местами и вывести на экран результат.
public class StringSplit {

    public static void main(String[] args) {
        String text = "word1 word2 word3";
        String[] texts = text.split(" ");
        String fintext = texts[2] + " " + texts[1] + " " + texts[0];
        
        System.out.println(fintext);
    }

}
