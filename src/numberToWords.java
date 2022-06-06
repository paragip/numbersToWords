public class numberToWords {

    public static void main(String[] args) {
        numberToWords(1);

    }

    public static void numberToWords (int number) {

        int numberReversed = 0; // ezt felesleges 0-val indítani de mindegy, nem számít
        int numberOfDigitsOriginal = getDigitCount(number);
        int numberOfDigitsReversed = 0; // alább számítjuk ki



        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            numberReversed = reverse(number); // a fordított szám jegyeinek darabszámához kell ez a művelet
            while (numberReversed != 0) {
                numberOfDigitsReversed++; // itt adunk hozzá +1 db-ot a fordított szám számjegyeihez
                numberReversed /= 10; // elfogyasztjuk a fordított számot
            }

            numberReversed = reverse(number); // visszaállítja a fordított számot, hogy fel tudjuk használni alább

            while (numberReversed != 0) {
                int lastDigit = numberReversed % 10;

                switch (lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

                numberReversed /= 10;
            }

            int numberOfLostZeros = numberOfDigitsOriginal - numberOfDigitsReversed; // megadja hogy hány 0 volt az eredeti szám végén, amelyek a szám megfordításakor eltűntek

            if (numberOfLostZeros != 0) { // ha az eredeti szám 0-ra végződik, akkor  a végére annyi "Zero"-t ír ki, ahány 0 elveszett a szám megfordításakor, tehát ahány 0 volt eredetileg a szám végén
                for (int i = 1; i <= numberOfLostZeros; i++) {
                    System.out.println("Zero");
                }
            }

        }

    }

    public static int reverse (int number) { // előállítja az eredeti szám fordítottját
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount (int number){ // megadja az eredeti szám jegyeinek számát

        int numberOfDigits = 0;

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            while (number != 0) {
                numberOfDigits++;
                number /= 10;
            }
        }
        return numberOfDigits;
    }


}
