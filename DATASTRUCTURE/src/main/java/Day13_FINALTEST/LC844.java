package Day13_FINALTEST;

import java.util.Stack;
//Bài toán cho 2 chuỗi string để duyệt, nếu gặp ký tự # thì xóa phần tử trước đó, so sánh 2 chuỗi sau khi duyệt
//Ta sử dụng Stack để lưu trữ 2 chuỗi duyệt trong bài này
//Độ phức tạp thuật toán bài này là
public class LC844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>(); //tạo ra 2 stack lưu trữ
        Stack<Character> stack2 = new Stack<>();

        //duyệt chuỗi s
        for (char c : s.toCharArray()) {
            if (c == '#') { //nếu ký tự là # thì xóa phần tử trên cùng nếu stack không rỗng
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else { //nếu khác ký tự # thì thêm vào stack
                stack1.push(c);
            }
        }

        // duyệt t tương tự s
        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }
        // So sánh 2 stack sau khi đã duyệt
        //Dùng while so sánh 2 stack, dùng pop so sánh từng phần tử và remove chúng
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.pop() != stack2.pop()) {
                return false;
            }
        }

        //nếu sau cùng cả 2 stack rỗng thì trả về true, một trong hai còn phần tử thì false
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
