public class FizzBuzzTranslate {
    public static String checkDivisibleBy3And5(int number) {
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        if (isDivisibleBy3 && isDivisibleBy5) {
            return "FizzBuzz";
        } else if (isDivisibleBy5) {
            return "Buzz";
        } else if (isDivisibleBy3) {
            return "Fizz";
        } else {
            return "This " + number + " can't divide by 5 or 3";
        }
    }

    public static String translate(String number) {
        String unit = null;
        String tensOf = null;
        if(number.length()==1) {
            switch (number.charAt(0)) {
                case '1':
                    unit = "một";
                    break;
                case '2':
                    unit = "hai";
                    break;
                case '4':
                    unit = "bốn";
                    break;
                case '6':
                    unit = "sáu";
                    break;
                case '7':
                    unit = "bảy";
                    break;
                case '8':
                    unit = "tám";
                    break;
                case '9':
                    unit = "chín";
                    break;
            }
        }


        if(number.length()==2) {
            switch (number.charAt(0)) {
                case '1':
                    tensOf = "mười";
                    break;
                case '2':
                    tensOf = "hai";
                    break;
                case '4':
                    tensOf = "bốn";
                    break;
                case '6':
                    tensOf = "sáu";
                    break;
                case '7':
                    tensOf = "bảy";
                    break;
                case '8':
                    tensOf = "tám";
                    break;
                case '9':
                    tensOf = "chín";
                    break;
            }
            switch (number.charAt(1)) {
                case '1':
                    unit = "một";
                    break;
                case '2':
                    unit = "hai";
                    break;
                case '4':
                    unit = "bốn";
                    break;
                case '6':
                    unit = "sáu";
                    break;
                case '7':
                    unit = "bảy";
                    break;
                case '8':
                    unit = "tám";
                    break;
                case '9':
                    unit = "chín";
                    break;
            }
        }

        if (number.length() == 1) {
            if (number.contains("3")) {
                return "Fizz";
            } else if (number.equals("5")) {
                return "Buzz";
            } else {
                return unit;
            }
        } else if (number.length() == 2) {
            if (number.contains("3") && number.contains("5")) {
                return "FizzBuzz";
            } else if (number.contains("5")) {
                return "Buzz";
            } else if (number.contains("3")) {
                return "Fizz";
            } else {
                return tensOf + " " + unit;
            }
        } else {
            return "This program can't process this number";
        }
    }


}
