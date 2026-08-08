class Solution {
    public int secondHighest(String s) {
        

        int count = 0;

        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
         if (count == 0) {
            return -1;
        }

        int[] arr = new int[count];

        int index = 0;

       
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                arr[index++] = s.charAt(i) - '0';
            }
        }

        int n = arr.length;
        int Largest = arr[0];
        int sLargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > Largest) {
                sLargest = Largest;
                Largest = arr[i];
            } else if (arr[i] < Largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;

    }
}