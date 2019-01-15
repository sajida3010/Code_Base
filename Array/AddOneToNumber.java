import java.util.ArrayList;

public class AddOneToNumber {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(9);
        num.add(9);
        num.add(9);
        num.add(9);
        ArrayList<Integer> newNum = plusOne(num);
        System.out.println(newNum);
    }
        public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
            int size = a.size();
            int carry = 1;
            ArrayList<Integer> res = new ArrayList<Integer>();
            for (int i=size-1;i>=0;i--){
                int num = a.get(i);
                num = num + carry;
                carry = 0;

                if (num == 10){
                    carry = 1;
                    num = 0;
                }
                a.set(i,num);

            }
            if (carry==1)
                res.add(1);

            for (int elem:a){
                if (( elem == 0) && (res.size() == 0))
                {
                    continue;
                }

                res.add(elem);
            }



            return res;
        }
    }
