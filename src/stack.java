import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("1"); // Stack Push
        stack.peek(); // Stack Top 맨위 객체를 반환 -> 1
        stack.empty(); // Stack Empty 스택이 비어 있는지 체크
        stack.search("1"); // 해당 요소의 위치를 찾아서 반환
        stack.pop(); // Stack Pop 요소 제거


    }
}
