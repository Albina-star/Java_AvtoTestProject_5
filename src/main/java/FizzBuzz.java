public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        if (start <= end) {
            String[] array = new String[end - start + 1];

            int number = start;

            for (int i = 0; i < array.length && number <= end; i++) {
                if (number % 15 == 0) {  // число делится одновременно на 3 и на 5
                    array[i] = "FizzBuzz";
                } else if (number % 3 == 0) {   //делится  на 3
                    array[i] = "Fizz";
                } else if (number % 5 == 0) {  //делится  на 5
                    array[i] = "Buzz";
                } else {
                    array[i] = String.valueOf(number);  //turn/make to string
                }

                number++;
            }

            return array;
        }

        return new String[0]; // ели усл не сработает, то создастся и вернется новый пустой массив
    }
}
