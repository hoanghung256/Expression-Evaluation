
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
            for(int i = 0; i < part.length; ++i) {
                String s = part[i];
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
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
            return 0.0;
        }
        return (Double)st.pop();
    }
}
