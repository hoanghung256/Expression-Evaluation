
import stack.array_stack.ArrayStack;

import java.util.Scanner;
// 9 3 / 5 + 7 2 - *
public class CaculateExpressionNoparenthess {
    String input = new String();

    public CaculateExpressionNoparenthess(String input) {
        this.input = input;
    }

    public double caculating() throws Exception {
        double result = 0.0;
        String[] part = this.input.split(" ");
        ArrayStack st = new ArrayStack();
//        LinkedStack st = new LinkedStack();
        try {
            for(int i = 0; i < part.length; i++) {
                String item = part[i];
                if (item.equals("+")) {
                    result = (Double)st.pop() + (Double)st.pop();
                    st.push(result);
                } else if (item.equals("-")) {
                    result = (Double)st.pop() - (Double)st.pop();
                    result = (-1.0) * result;
                    st.push(result);
                } else if (item.equals("*")) {
                    result = (Double)st.pop() * (Double)st.pop();
                    st.push(result);
                } else if (item.equals("/")) {
                    Double divisor = (Double)st.pop();
                    result = (Double)st.pop() / divisor;
                    st.push(result);
                } else {
                    st.push(Double.parseDouble(item));
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return 0.0;
        }
        return (Double)st.pop();
        //return gia tri cua bieu thuc
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter postfix  arithmetic expressions: ");
        String s = scanner.nextLine();
        CaculateExpressionNoparenthess cenp = new CaculateExpressionNoparenthess(s);
        System.out.println(cenp.caculating());
    }
}
