/*Have the function Questions Marks(str)
take the str string parameter, which will
contain single digit numbers, letters, and
question marks, and check if there are
exactly 3 question marks between every
pair of two numbers that add up to 10. If
so, then your program should return the
string true, otherwise it should return the
string false. If there aren't any two
numbers that add up to 10 in the string,
then your program should return false as
well. For example: if str is
"arrb6???4xxbl5???eee5" then your
program should return true because
there are exactly 3 question marks
between 6 and 4, and 3 question marks
between 5 and 5 at the end of the string.
Examples

Input: "aa6?9"
Output: false
*/
package lec_15_Strings;

public class tarang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(questionMarks("arrb6???4xxbl5???eee5"));
		System.out.println(questionMarks("aa6?9"));
	}
    public static String questionMarks(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (Character.isDigit(currentChar)) {
                int firstDigit = Character.getNumericValue(currentChar);
                int sum = firstDigit;

                for (int j = i + 1; j < str.length(); j++) {
                    char nextChar = str.charAt(j);

                    if (Character.isDigit(nextChar)) {
                        int secondDigit = Character.getNumericValue(nextChar);
                        sum += secondDigit;

                        if (sum == 10) {
                            int questionMarkCount = 0;

                            // Count the number of question marks between the two digits
                            for (int k = i + 1; k < j; k++) {
                                if (str.charAt(k) == '?') {
                                    questionMarkCount++;
                                }
                            }

                            // Check if there are exactly 3 question marks
                            if (questionMarkCount == 3) {
                                return "true";
                            } else {
                                return "false";
                            }
                        }
                    }
                }
            }
        }

        return "false";
    }

}
