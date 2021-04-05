class Euclid{
    public static void main (String[]args){
        System.out.println(Euclid.reduce(252, 105));
    }
    public static int reduce (int firstn, int secondn){
        firstn = Math.abs(firstn);
        secondn = Math.abs(secondn);
        if (firstn == secondn) {
            return firstn;
        }
        if (firstn > secondn) { 
            return reduce(firstn-secondn, secondn);
        } else {
            return reduce(firstn, secondn-firstn);
        }
    }
}

