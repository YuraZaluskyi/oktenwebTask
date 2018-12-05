/*
* Пишемо  свій метод equalsIgnoreCase(). Як він буде працювати залежить від вас!
ВАЖЛИВО ! Не використовувати стрінговий метод equals() , а то чітінг)))

1 написати метод,
який вирізає зі стрічки вказаний діапазон і вертає його
2 написати метод,
який розрізає стрічку по певному символу(ви задаєте самі)
і вертає масив сегментів цієї стрічки
3 написати метод,
який рахує кількість входжень символу який ви вводите як аргумент
* */


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String str = cutString("qweerrtyuiu", 2, 4);
        System.out.println(str);

        int countSymbol = countSymbol("qmmmhdmmmmmkjgmmh", 'm');
        System.out.println(countSymbol);

        String[] str2 = cutStringBySymbol("ddddfdfddvcccdaaa", 'f');

        System.out.println(Arrays.toString(str2));

        System.out.println("");
        char a = 'd';

        System.out.println((int) a);

        System.out.println("");
        System.out.println(equalsIgnoreCase("aAAAAb", "aAAAAb"));

    }

    //  1. написати метод,
//який вирізає зі стрічки вказаний діапазон і вертає його
    public static String cutString(String str, int begin, int end) {
        String newString = "";
        char[] charStr = str.toCharArray();
        for (int i = begin; i <= end; i++) {
            newString = newString + charStr[i];

        }
        return newString;
    }

    //   3. написати метод,
//який рахує кількість входжень символу який ви вводите як аргумент
    public static int countSymbol(String str, char symbol) {
        int countSymbol = 0;
        char[] arrChar = str.toCharArray();
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] == symbol) {
                countSymbol += 1;
            }
        }
        return countSymbol;
    }

//    2 написати метод,
//    який розрізає стрічку по певному символу(ви задаєте самі)
//    і вертає масив сегментів цієї стрічки

    public static String[] cutStringBySymbol(String str, char symbol) {

        char[] charArr = str.toCharArray();
        String[] strArr = new String[0];
        int j = 0;
        int i = 0;
        while (i < charArr.length) {

            if (charArr[i] != symbol) {
                String[] newStrArr = new String[j + 1];
                for (int k = 0; k < strArr.length; k++) {
                    newStrArr[k] = strArr[k];
                }
                newStrArr[j] = "";
                while (i < charArr.length && charArr[i] != symbol) {
                    newStrArr[j] = newStrArr[j] + charArr[i];
                    i++;
                }
                j++;
                strArr = newStrArr;
            }
            i++;
        }
        return strArr;
    }

//    Пишемо  свій метод equalsIgnoreCase(). Як він буде працювати залежить від вас!
//    ВАЖЛИВО ! Не використовувати стрінговий метод equals() , а то чітінг)))

    public static boolean equalsIgnoreCase(String str1, String str2) {
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();
        if (charStr1.length != charStr2.length) {
            return false;
        }

        for (int i = 0; i < charStr1.length; i++) {

            if ((int) charStr1[i] == (int) charStr2[i]) {
                continue;
            } else if(((int) charStr1[i] - 32) == (int) charStr2[i]){
                continue;
            } else if(((int) charStr1[i] + 32) == (int) charStr2[i]){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
