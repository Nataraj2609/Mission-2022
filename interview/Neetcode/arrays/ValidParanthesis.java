package Interview.Neetcode.arrays;

import java.util.Stack;

public class ValidParanthesis {
  public static void main(String[] args) {
    String str = "{}[](){{}}{{{}}";
    System.out.println(isValidParanthesis(str));
  }

  private static boolean isValidParanthesis(String str) {
    Stack<Character> stackBucket = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      char lastPopped;

      if (ch == '(' || ch == '[' || ch == '{') {
        stackBucket.push(ch);
        continue;
      }
      if (stackBucket.isEmpty()) {
        return false;
      }

      switch (ch) {
        case '}': {
          lastPopped = stackBucket.pop();
          if (lastPopped != '{') {
            return false;
          }
          break;
        }
        case ')': {
          lastPopped = stackBucket.pop();
          if (lastPopped != '(') {
            return false;
          }
          break;
        }
        case ']': {
          lastPopped = stackBucket.pop();
          if (lastPopped != '[') {
            return false;
          }
          break;
        }
        default:
          return false;
      }
    }

    return stackBucket.isEmpty();
  }
}
