class BalanceCheck {
    
    public boolean check(String input) {

        char[] data = input.toCharArray();
        int size = data.length;

        if (input == "" || size % 2 != 0) return false;

        for (int i = 0; i < size; i++) {

            if (i + 1 >= size) return true;

            if(data[i] == 'e') {
                continue;
            } else if (getRightSide(data[i]) == data[i + 1]) {
                data[i + 1] = 'e';
                i++;
                continue;
            } else if (getRightSide(data[i]) == data[size - (i + 1)]) {
                data[size - (i + 1)] = 'e';
                continue;
            } else
                return false;
        }

        return true;
    }

    private char getRightSide(char c) {
        if (c == '[') return ']';
        else if (c == '(') return ')';
        else return '\000';
    }
}