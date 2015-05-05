package net.timandersen;

public class FizzBuzz {
    public String print() {

        String output = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output += "FizzBuzz";
            } else if (i % 3 == 0) {
                output += "Fizz";
            } else if (i % 5 == 0) {
                output += "Buzz";
            } else {
                output += i;
            }
            output += System.lineSeparator();
        }
        return output;
    }
}
