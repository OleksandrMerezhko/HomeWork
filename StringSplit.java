package les1;
//���� ����� �� 3-� ���� �word1 word2 word3�. 
//�������� 1-� � 3-� ����� ������� � ������� �� ����� ���������.
public class StringSplit {

    public static void main(String[] args) {
        String text = "word1 word2 word3";
        String[] texts = text.split(" ");
        String fintext = texts[2] + " " + texts[1] + " " + texts[0];
        
        System.out.println(fintext);
    }

}
