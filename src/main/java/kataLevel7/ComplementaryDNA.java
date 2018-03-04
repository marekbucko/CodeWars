package kataLevel7;

public class ComplementaryDNA {

    /*
    * kata level 7
    * link https://www.codewars.com/kata/554e4a2f232cdd87d9000038
    * */
    public static String makeComplement(String dna) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.charAt(i)) {
                case 'A':
                    sb.append('T');
                    break;
                case 'T':
                    sb.append('A');
                    break;
                case 'G':
                    sb.append('C');
                    break;
                case 'C':
                    sb.append('G');
                    break;
            }
        }
        return sb.toString();
    }
}
