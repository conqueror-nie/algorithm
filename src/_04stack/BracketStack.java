package _04stack;

import java.util.Scanner;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/26 9:14
 * @Slogan: The harder you work, the more luck you have.
 * @desc:   字符串括号匹配
 */
public class BracketStack {

    public static boolean isOK(String str){ //str表示的就是待匹配的括号串 [}使用字符来表示 时间复杂度 O(n)
        ArrayStack<Character> arrayStack = new ArrayStack<>(20);
        char[] characters = str.toCharArray();

        Character pop = null;
        for (char x : characters){
            switch (x){
                case '{':
                case '(':
                case '[':
                case '<':
                    arrayStack.push(x);
                    break;
                case '}':
                    pop = (Character) arrayStack.pop();
                    if (pop == null) return false;
                    if (pop == '{'){
                        break;
                    }else {
                        return false;
                    }
                case ')':
                    pop = (Character) arrayStack.pop();
                    if (pop == null) return false;
                    if (pop == '('){
                        break;
                    }else {
                        return false;
                    }
                case ']':
                    pop = (Character) arrayStack.pop();
                    if (pop == null) return false;
                    if (pop == '['){
                        break;
                    }else {
                        return false;
                    }
                case '>':
                    pop = (Character) arrayStack.pop();
                    if (pop == null) return false;
                    if (pop == '<'){
                        break;
                    }else {
                        return false;
                    }
            }
        }

        return arrayStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("可输入如下括号组合：(){}[]<>");
        while (scanner.hasNext()){
            String s = scanner.next();
            System.out.println(s + "匹配的结果为：" + isOK(s));
        }
    }
}
