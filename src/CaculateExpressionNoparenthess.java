
import stack.ArrayStack;

import java.util.Scanner;

public class CaculateExpressionNoparenthess {
    String input = new String();

    public CaculateExpressionNoparenthess(String input) {
        this.input = input;
    }

    public double caculating() throws Exception {
        double result = 0.0;
        String[] part = this.input.split(" ");
        ArrayStack st = new ArrayStack();

        try {
            String[] var5 = part;
            int var6 = part.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                String s = var5[var7];
                if (s.equals("+")) {
                    result = (Double)st.pop() + (Double)st.pop();
                    st.push(result);
                } else if (s.equals("-")) {
                    result = (Double)st.pop() - (Double)st.pop();
                    result = -1.0 * result;
                    st.push(result);
                } else if (s.equals("*")) {
                    result = (Double)st.pop() * (Double)st.pop();
                    st.push(result);
                } else if (s.equals("/")) {
                    Double divisor = (Double)st.pop();
                    result = (Double)st.pop() / divisor;
                    st.push(result);
                } else {
                    st.push(Double.parseDouble(s));
                }
            }
        } catch (Exception var10) {
            System.out.println("Exception" + var10.getMessage());
            return 0.0;
        }
        return (Double)st.pop();
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter postfix  arithmetic expressions: ");
        String s = scanner.nextLine();
        CaculateExpressionNoparenthess cenp = new CaculateExpressionNoparenthess(s);
        System.out.println(cenp.caculating());
    }
}
