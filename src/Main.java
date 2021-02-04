public class Main {

    public static void main(String[] args) throws SizeException, DataException {
        String[][] strings = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "w", "4"},
                {"1", "2", "3", "4"}};
        System.out.println(countSum(strings));
    }

    public static int countSum(String[][] strings) throws SizeException, DataException {
        if(strings.length != 4) {
            throw new SizeException("Array's size isn't 4X4");
        }
        int somme = 0;
        //String onlyDigits = "\\d+";
        for(int i = 0; i< strings.length; i++) {
            if (strings[i].length != 4) {
                throw new SizeException("Array's size isn't 4X4");
            }
            for(int j=0; j<strings[i].length; j++) {
				/*if(!strings[i][j].matches(onlyDigits)) {
					throw new MyArrayDataException("In ["+i+"]["+j+"] it's "+strings[i][j]+" instead of string");
				}
				somme+=Integer.parseInt(strings[i][j]);*/
                try {
                    somme+=Integer.parseInt(strings[i][j]);
                }
                catch(NumberFormatException e) {
                    throw new DataException("In ["+i+"]["+j+"] it's "+strings[i][j]+" instead of string");
                }

            }
        }
        return somme;
    }

}
